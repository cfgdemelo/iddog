package com.cfgdemelo.iddog.domain.feed

import com.cfgdemelo.iddog.data.feed.FeedRepository
import data.model.FeedPayload

class FeedUseCase(private val feedRepository: FeedRepository) {
    suspend fun feed(category: String?): FeedPayload = feedRepository.feed(category)
}