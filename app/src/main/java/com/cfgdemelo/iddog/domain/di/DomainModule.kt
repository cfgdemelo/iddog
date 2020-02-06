package com.cfgdemelo.iddog.domain.di

import com.cfgdemelo.iddog.domain.feed.FeedUseCase
import com.cfgdemelo.iddog.domain.login.LoginUseCase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val domainModule = module {
    single { LoginUseCase(get()) }
    single { FeedUseCase(get()) }
}