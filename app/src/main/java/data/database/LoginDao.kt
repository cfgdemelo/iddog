package com.cfgdemelo.iddog.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import data.model.User

@Dao
interface LoginDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(token: User)

    @Query("SELECT * FROM USER")
    fun getUser(): User?
}