package com.cfgdemelo.iddog.data.di

import com.cfgdemelo.iddog.BuildConfig
import com.cfgdemelo.iddog.data.api.IdDogApi
import com.cfgdemelo.iddog.data.datasource.RemoteDataSource
import com.cfgdemelo.iddog.data.login.LoginRepository
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val dataModule = module {
    factory { providesOkHttpClient() }
    single {
        createWebService<IdDogApi>(
            okHttpClient = get(),
            url = BuildConfig.BASE_URL
        )
    }
    single { RemoteDataSource(get()) }
    factory { LoginRepository(get()) }
}

fun providesOkHttpClient(): OkHttpClient {
    try {
        return OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS).apply {
                HttpLoggingInterceptor().let {
                    it.level = HttpLoggingInterceptor.Level.BODY
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