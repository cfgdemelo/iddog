package com.cfgdemelo.iddog.data.api

import data.model.LoginPayload
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface IdDogApi {
    @FormUrlEncoded
    @POST(SIGN_UP)
    suspend fun login(@Field(EMAIL) email: String): LoginPayload

    companion object {
        const val SIGN_UP = "signup"
        const val EMAIL = "email"
    }
}