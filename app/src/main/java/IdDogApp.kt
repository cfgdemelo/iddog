package com.cfgdemelo.iddog

import android.app.Application
import com.cfgdemelo.iddog.data.di.dataModule
import com.cfgdemelo.iddog.domain.di.domainModule
import com.cfgdemelo.iddog.presentation.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


class IdDogApp: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@IdDogApp)
            modules(listOf(dataModule, domainModule, presentationModule))
        }
    }
}