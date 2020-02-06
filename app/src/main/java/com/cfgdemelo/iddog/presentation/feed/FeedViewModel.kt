package com.cfgdemelo.iddog.presentation.feed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cfgdemelo.iddog.domain.feed.FeedUseCase
import com.cfgdemelo.iddog.data.model.FeedPayload
import kotlinx.coroutines.launch

class FeedViewModel(private val feedUseCase: FeedUseCase) : ViewModel() {
    private val _feed = MutableLiveData<FeedPayload>()
    val feed: LiveData<FeedPayload> = _feed

    private val _error = MutableLiveData<String>()
    val error: LiveData<String> = _error

    private val _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean> = _loading

    init {
        getNewFeed()
    }

    fun getNewFeed(category: String? = null) {
        viewModelScope.launch {
            _loading.value = true
            try {
                feedUseCase.feed(category).apply {
                    _feed.value = this
                }
            } catch (exception: Throwable) {
                _error.value = exception.message
            }
            _loading.value = false
        }
    }

    companion object {
        const val HUSKY = "husky"
        const val HOUND = "hound"
        const val PUG = "pug"
        const val LABRADOR = "labrador"
    }
}