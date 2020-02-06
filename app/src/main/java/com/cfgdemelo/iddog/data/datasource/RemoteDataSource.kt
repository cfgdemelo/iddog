package com.cfgdemelo.iddog.data.datasource

import com.cfgdemelo.iddog.data.api.IdDogApi
import com.cfgdemelo.iddog.data.model.FeedPayload
import com.cfgdemelo.iddog.data.model.LoginPayload

class RemoteDataSource(private val api: IdDogApi) {
    suspend fun login(email: String): LoginPayload = api.login(email)
    suspend fun feed(category: String?, auth: String? = null): FeedPayload = api.feed(category, auth)
}