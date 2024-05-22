package com.github.aakumykov.app

import dagger.Component

@Component(modules = [
    AppQwertyFactoriesModule::class,
//    NetworkModule::class,
    AppQwertyCreatorsModule::class,
])
interface AppComponent {
    fun getQwertyFactoryCreator(): QwertyFactoryCreator
    fun getQwertyCreatorFactory(): QwertyCreatorFactory
}
