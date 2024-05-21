package com.github.aakumykov.app

import android.app.Application

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        _appComponent = DaggerAppComponent.create()
    }

    companion object {
        private var _appComponent: AppComponent? = null
        val appComponent: AppComponent get() = _appComponent!!
    }
}
