package com.cfgdemelo.iddog.domain.feed

import com.cfgdemelo.iddog.data.feed.FeedRepository
import com.cfgdemelo.iddog.data.model.FeedPayload

class FeedUseCase(private val feedRepository: FeedRepository) {
    suspend fun feed(category: String? = null, auth: String? = null): FeedPayload = feedRepository.feed(category, auth)
}