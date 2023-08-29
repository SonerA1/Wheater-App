package com.example.weatherapp.view

import android.app.Application
import com.example.weatherapp.util.SharedPrefs

class MyApp : Application() {

    companion object {
        lateinit var instance: MyApp
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    override fun onTerminate() {
        super.onTerminate()

        val sharedPrefs = SharedPrefs.getInstance(this)
        sharedPrefs.clearCityValue()
    }
}