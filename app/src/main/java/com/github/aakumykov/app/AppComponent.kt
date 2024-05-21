package com.github.aakumykov.app

import dagger.Component

@Component(modules = [
    AppQwertyFactoriesModule::class,
])
interface AppComponent {
    fun getQwertyFactoryCreator(): QwertyFactoryCreator
}
