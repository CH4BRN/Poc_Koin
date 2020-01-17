// File appModule.kt
// @Author pierre.antoine - 17/01/2020 - No copyright.

package com.uldskull.poc_koin.cross_cutting

import com.uldskull.poc_koin.api.MySimplePresenter
import com.uldskull.poc_koin.application.RandomService
import com.uldskull.poc_koin.application.RandomServiceImpl
import com.uldskull.poc_koin.data.HelloRepositoryImpl
import com.uldskull.poc_koin.domain.HelloRepository
import org.koin.dsl.module

val appModule = module {

    //     single instance of HelloRepository
    single<HelloRepository> { HelloRepositoryImpl() }

    single<RandomService> { RandomServiceImpl()}

    // Simple Presenter Factory
    // afin d'avoir une nouvelle instance à chaque fois que ma vue sera créée

    //  À chaque fois que j'ai besoin d'injecter une instance dans un constructeur,
    //  je vais utiliser la fonction get()
    factory { MySimplePresenter(get(), get()) }
}