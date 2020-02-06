package com.cfgdemelo.iddog.presentation.di

import com.cfgdemelo.iddog.presentation.feed.FeedViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import com.cfgdemelo.iddog.presentation.login.LoginViewModel

val presentationModule = module {
    viewModel { LoginViewModel(get()) }
    viewModel { FeedViewModel(get()) }
}