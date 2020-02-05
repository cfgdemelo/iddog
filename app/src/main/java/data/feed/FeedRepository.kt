package com.cfgdemelo.iddog.data.feed

import com.cfgdemelo.iddog.data.datasource.RemoteDataSource
import data.model.FeedPayload
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FeedRepository(private val remoteDataSource: RemoteDataSource) {

    suspend fun feed(category: String?): FeedPayload {
        return withContext(Dispatchers.IO) {
            return@withContext remoteDataSource.feed(category)
        }
    }
}