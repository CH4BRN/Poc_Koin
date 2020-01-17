// File HelloRepository.kt
// @Author pierre.antoine - 17/01/2020 - No copyright.

package com.uldskull.poc_koin.domain

import android.content.Context

/**
 *   Interface "HelloRepository" :
 *   va nous fournir un message via la fonction giveHello()
 **/
interface HelloRepository {
    fun giveHello():String

    fun toastHello(context:Context)
// TODO : Fill interface.
}