package com.cfgdemelo.iddog.presentation.feed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cfgdemelo.iddog.domain.feed.FeedUseCase
import data.model.FeedPayload
import kotlinx.coroutines.launch

class FeedViewModel(private val feedUseCase: FeedUseCase): ViewModel() {
    private val _feed = MutableLiveData<FeedPayload>()
    val feed: LiveData<FeedPayload> = _feed

    init {
        getNewFeed()
    }

    fun getNewFeed(category: String? = null) {
        viewModelScope.launch {
            try {
                feedUseCase.feed(category).apply {
                    _feed.value = this
                }
            } catch (exception: Throwable) {
                exception.printStackTrace()
            }
        }
    }

    companion object {
        const val HUSKY = "husky"
        const val HOUND = "hound"
        const val PUG = "pug"
        const val LABRADOR = "labrador"
    }
}