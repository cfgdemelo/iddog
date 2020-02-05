package com.cfgdemelo.iddog.domain.login

import android.content.Context
import com.cfgdemelo.iddog.data.login.LoginRepository
import data.model.LoginPayload
import data.model.User

class LoginUseCase(private val loginRepository: LoginRepository) {
    suspend fun login(context: Context, email: String): Boolean =
        loginRepository.login(context, email)

    fun getLoggedUser(): User? = loginRepository.getLoggedUser()

}