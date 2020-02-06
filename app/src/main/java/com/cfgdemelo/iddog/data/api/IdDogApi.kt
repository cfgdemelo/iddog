package com.cfgdemelo.iddog.data.api

import com.cfgdemelo.iddog.data.model.FeedPayload
import com.cfgdemelo.iddog.data.model.LoginPayload
import retrofit2.http.*

interface IdDogApi {
    @FormUrlEncoded
    @POST(SIGN_UP)
    suspend fun login(@Field(EMAIL) email: String): LoginPayload

    @GET(FEED)
    suspend fun feed(
        @Query(CATEGORY) category: String?,
        @Header(AUTH) auth: String? = null
    ): FeedPayload

    companion object {
        const val SIGN_UP = "signup"
        const val EMAIL = "email"
        const val FEED = "feed"
        const val AUTH = "Authorization"
        const val CATEGORY = "category"
    }
}