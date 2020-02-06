package com.cfgdemelo.iddog.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

data class LoginPayload(
    val user: User?
)

@Entity(tableName = "USER")
data class User(
    @PrimaryKey(autoGenerate = false)
    val _id: String,
    val __v: Int,
    val createdAt: String,
    val email: String,
    val token: String,
    val updatedAt: String
)