package com.cfgdemelo.iddog.login

import android.content.Context
import com.cfgdemelo.iddog.IdDogApp
import com.cfgdemelo.iddog.data.di.dataModule
import com.cfgdemelo.iddog.domain.di.domainModule
import com.cfgdemelo.iddog.domain.login.LoginUseCase
import com.cfgdemelo.iddog.presentation.di.presentationModule
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.test.KoinTest
import org.koin.test.inject
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.koin.android.ext.koin.androidContext

class LoginTest : KoinTest {

    private val loginUseCase: LoginUseCase by inject()
    private val context: Context by inject()

    @Test
    fun emailInserted_isValid() {
        startKoin()

        runBlocking {
            assertEquals(
                "Email inserted is valid",
                true,
                loginUseCase.login(context, "abc@gmail.com", true)
            )
        }

        stopKoin()
    }

    @Test
    fun emailInserted_isNotValid() {
        startKoin()

        runBlocking {
            var isValid = true
            try {
                loginUseCase.login(context, "abc@", true)
            } catch (exception: Throwable) {
                isValid = exception.message != BAD_REQUEST
            }
            assertEquals("Email inserted is not valid", false, isValid)
        }

        stopKoin()
    }

    private fun startKoin() {
        startKoin {
            androidContext(IdDogApp())
            modules(listOf(domainModule, dataModule, presentationModule))
        }
    }

    companion object {
        private const val BAD_REQUEST = "HTTP 400 Bad Request"
    }
}