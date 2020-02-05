package com.cfgdemelo.iddog.data.datasource

import com.cfgdemelo.iddog.data.database.LoginDao
import data.model.User

class CacheDataSource(private val loginDao: LoginDao) {
    suspend fun insertUser(token: User) {
        loginDao.insertUser(token)
    }

    fun getUser(): User? = loginDao.getUser()
}