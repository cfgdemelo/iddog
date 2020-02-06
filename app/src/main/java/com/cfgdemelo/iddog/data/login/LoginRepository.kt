package com.cfgdemelo.iddog.data.login

import android.content.Context
import com.cfgdemelo.iddog.R
import com.cfgdemelo.iddog.data.datasource.CacheDataSource
import com.cfgdemelo.iddog.data.datasource.RemoteDataSource
import com.cfgdemelo.iddog.data.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoginRepository(
    private val remoteDataSource: RemoteDataSource,
    private val cacheDataSource: CacheDataSource
) {
    suspend fun login(context: Context, email: String, isTesting: Boolean? = false): Boolean {
        return withContext(Dispatchers.IO) {
            remoteDataSource.login(email).apply {
                user?.let {
                    if (isTesting == null || isTesting == false) {
                        cacheDataSource.insertUser(it)
                    }
                    return@withContext true
                }
            }
            throw Throwable(context.getString(R.string.login_failed))
        }
    }

    fun getLoggedUser(): User? = cacheDataSource.getUser()
}