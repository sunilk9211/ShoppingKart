package com.example.testappsunil.core

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
open class AstroApp : Application() {

    override fun onCreate() {
        super.onCreate()
    }

}