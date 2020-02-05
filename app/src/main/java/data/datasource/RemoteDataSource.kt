package com.cfgdemelo.iddog.data.datasource

import com.cfgdemelo.iddog.data.api.IdDogApi
import data.model.FeedPayload
import data.model.LoginPayload

class RemoteDataSource(private val api: IdDogApi) {
    suspend fun login(email: String): LoginPayload = api.login(email)
    suspend fun feed(category: String?): FeedPayload = api.feed(category)
}