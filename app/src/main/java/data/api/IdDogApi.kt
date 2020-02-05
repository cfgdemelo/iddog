package com.cfgdemelo.iddog.data.api

import data.model.FeedPayload
import data.model.LoginPayload
import retrofit2.http.*

interface IdDogApi {
    @FormUrlEncoded
    @POST(SIGN_UP)
    suspend fun login(@Field(EMAIL) email: String): LoginPayload

    @GET(FEED)
    suspend fun feed(@Query("category") category: String?): FeedPayload

    companion object {
        const val SIGN_UP = "signup"
        const val EMAIL = "email"
        const val FEED = "feed"
    }
}