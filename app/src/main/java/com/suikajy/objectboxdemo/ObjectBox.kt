package com.suikajy.objectboxdemo

import android.content.Context
import android.util.Log
import io.objectbox.BoxStore

/**
 * Created by suikajy on 2019/2/28
 */
object ObjectBox {
    lateinit var boxStore: BoxStore
        private set

    fun init(context: Context) {
        boxStore = MyObjectBox.builder().androidContext(context.applicationContext).build()

        if (BuildConfig.DEBUG) {
            Log.d(App.TAG, "Using ObjectBox ${BoxStore.getVersion()} (${BoxStore.getVersionNative()})")
        }
    }
}