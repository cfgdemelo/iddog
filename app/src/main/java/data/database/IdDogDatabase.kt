package com.cfgdemelo.iddog.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import data.model.User

@Database(
    version = 1,
    exportSchema = false,
    entities = [User::class]
)

abstract class IdDogDatabase : RoomDatabase() {
    abstract fun loginDao(): LoginDao

    companion object {
        private const val ID_DOG_DB = "idDogDatabase"

        fun createDatabase(context: Context): IdDogDatabase =
            Room.databaseBuilder(context, IdDogDatabase::class.java, ID_DOG_DB).build()

        fun createLoginDao(idDogDatabase: IdDogDatabase): LoginDao = idDogDatabase.loginDao()
    }
}