package com.cfgdemelo.iddog

import android.app.Application
import com.cfgdemelo.iddog.data.di.dataModule
import com.cfgdemelo.iddog.domain.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import presentation.di.presentationModule

class IdDogApp: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@IdDogApp)
            modules(listOf(presentationModule, domainModule, dataModule))
        }
    }
}