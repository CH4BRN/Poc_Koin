// File MyApplication.kt
// @Author pierre.antoine - 17/01/2020 - No copyright.

package com.uldskull.poc_koin.application

import android.app.Application
import com.uldskull.poc_koin.cross_cutting.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 *   Class "MyApplication" :
 *   TODO: Fill class use.
 **/
class MyApplication : Application() {
    override fun onCreate(){
        super.onCreate()
        // start Koin!
        startKoin {
            // Android context
            androidContext(this@MyApplication)
            // modules
            modules(appModule)
        }
    }
}