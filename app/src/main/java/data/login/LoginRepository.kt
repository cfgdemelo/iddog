package com.cfgdemelo.iddog.data.login

import com.cfgdemelo.iddog.data.datasource.RemoteDataSource
import data.model.LoginPayload
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoginRepository(private val remoteDataSource: RemoteDataSource) {
    suspend fun login(email: String): LoginPayload {
        return withContext(Dispatchers.IO) {
            return@withContext remoteDataSource.login(email)
        }
    }
}