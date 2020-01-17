// File HelloRepositoryImpl.kt
// @Author pierre.antoine - 17/01/2020 - No copyright.

package com.uldskull.poc_koin.data

import android.content.Context
import android.widget.Toast
import com.uldskull.poc_koin.domain.HelloRepository

/**
 *   Class "HelloRepositoryImpl" :
 *   TODO: Fill class use.
 **/
class HelloRepositoryImpl : HelloRepository {
    override fun giveHello() = "Hello Koin"
    override fun toastHello(context: Context) {
        Toast.makeText(context, "Toast", Toast.LENGTH_SHORT).show()
    }
// TODO : Fill class.
}