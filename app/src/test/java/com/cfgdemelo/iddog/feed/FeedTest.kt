package com.cfgdemelo.iddog.feed

import android.content.Context
import com.cfgdemelo.iddog.IdDogApp
import com.cfgdemelo.iddog.data.datasource.RemoteDataSource
import com.cfgdemelo.iddog.data.di.dataModuleForTesting
import com.cfgdemelo.iddog.domain.di.domainModule
import com.cfgdemelo.iddog.domain.feed.FeedUseCase
import com.cfgdemelo.iddog.presentation.di.presentationModule
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.runBlocking
import org.junit.Test
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.test.KoinTest
import org.koin.test.inject

class FeedTest : KoinTest {
    private val remoteDataSource: RemoteDataSource by inject()
    private val feedUseCase: FeedUseCase by inject()
    private val context: Context by inject()

    @Test
    fun categoryNotInserted_huskyIsExpected() {
        startKoin()

        runBlocking {
            val payload = remoteDataSource.login(EMAIL)
            assertEquals(
                "Category not inserted",
                HUSKY,
                feedUseCase.feed(auth = payload.user?.token).category
            )
        }

        stopKoin()
    }

    @Test
    fun categoryInserted_itsNameIsExpected() {
        startKoin()
        runBlocking {
            val payload = remoteDataSource.login(EMAIL)
            assertEquals(
                "Category inserted",
                PUG,
                feedUseCase.feed(
                    category = PUG,
                    auth = payload.user?.token
                ).category
            )
        }
        stopKoin()
    }

    private fun startKoin() {
        startKoin {
            androidContext(IdDogApp())
            modules(listOf(domainModule, dataModuleForTesting, presentationModule))
        }
    }

    companion object {
        private const val HUSKY = "husky"
        private const val PUG = "pug"
        private const val EMAIL = "abc@abc.com"
    }
}