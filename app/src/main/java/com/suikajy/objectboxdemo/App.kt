package com.suikajy.objectboxdemo

import android.app.Application

/**
 * Created by suikajy on 2019/2/28
 */


class App : Application() {

    companion object {
        const val TAG = "ObjectBoxExample"
    }

    override fun onCreate() {
        super.onCreate()
        ObjectBox.init(this)
    }
}