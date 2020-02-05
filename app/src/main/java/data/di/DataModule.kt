package com.cfgdemelo.iddog.data.di

import com.cfgdemelo.iddog.BuildConfig
import com.cfgdemelo.iddog.data.api.IdDogApi
import com.cfgdemelo.iddog.data.database.IdDogDatabase
import com.cfgdemelo.iddog.data.datasource.CacheDataSource
import com.cfgdemelo.iddog.data.datasource.RemoteDataSource
import com.cfgdemelo.iddog.data.feed.FeedRepository
import com.cfgdemelo.iddog.data.login.LoginRepository
import com.google.gson.GsonBuilder
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val dataModule = module {
    single { IdDogDatabase.createDatabase(androidContext()) }
    single { IdDogDatabase.createLoginDao(get()) }
    single { CacheDataSource(get()) }
    single { RemoteDataSource(get()) }
    factory { LoginRepository(get(), get()) }
    factory { FeedRepository(get()) }
    factory { providesOkHttpClient(get()) }
    single {
        createWebService<IdDogApi>(
            okHttpClient = get(),
            url = BuildConfig.BASE_URL
        )
    }
}

fun providesOkHttpClient(cacheDataSource: CacheDataSource): OkHttpClient {
    try {
        return OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS).apply {
                HttpLoggingInterceptor().let {
                    it.level = HttpLoggingInterceptor.Level.BODY
                    this.addInterceptor(it)
                }
                IdDogInterceptor(cacheDataSource).let {
                    this.addInterceptor(it)
                }
            }.build()
    } catch (exception: Exception) {
        exception.printStackTrace()
        throw Exception(exception)
    }
}

inline fun <reified T> createWebService(okHttpClient: OkHttpClient, url: String): T {
    return Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setLenient().create()))
        .baseUrl(url)
        .client(okHttpClient)
        .build()
        .create(T::class.java)
}

class IdDogInterceptor(private val cacheDataSource: CacheDataSource) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
        if (chain.request().url.toUrl().path != SIGN_UP) {
            cacheDataSource.getUser()?.let {
                request.addHeader(AUTH, it.token)
            }
        }

        return chain.proceed(request.build())
    }

    companion object {
        private const val AUTH = "Authorization"
        private const val SIGN_UP = "/signup"
    }
}