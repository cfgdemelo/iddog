package com.cfgdemelo.iddog.domain.login

import android.content.Context
import com.cfgdemelo.iddog.data.login.LoginRepository
import com.cfgdemelo.iddog.data.model.User

class LoginUseCase(private val loginRepository: LoginRepository) {
    suspend fun login(context: Context, email: String, isTesting: Boolean? = null): Boolean =
        loginRepository.login(context, email, isTesting)

    fun getLoggedUser(): User? = loginRepository.getLoggedUser()

}