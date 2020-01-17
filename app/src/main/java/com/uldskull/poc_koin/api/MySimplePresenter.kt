// File MySimplePresenter.kt
// @Author pierre.antoine - 17/01/2020 - No copyright.

package com.uldskull.poc_koin.api

import com.uldskull.poc_koin.application.RandomService
import com.uldskull.poc_koin.domain.HelloRepository

/**
 *   Class "MySimplePresenter" :
 *   un composant qui va nous aider à récupérer notre message et qui sera utilisé par une vue Android.
 **/
class MySimplePresenter(val repo: HelloRepository, val service: RandomService) {

    fun sayHello() = "${repo.giveHello()} from $this"

    fun sayHi() = "${service.SayHi()} from $this"

}