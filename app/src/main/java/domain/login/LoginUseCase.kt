package com.cfgdemelo.iddog.domain.login

import com.cfgdemelo.iddog.data.login.LoginRepository
import data.model.LoginPayload

class LoginUseCase(private val loginRepository: LoginRepository) {

    suspend fun login(email: String): LoginPayload = loginRepository.login(email)
}