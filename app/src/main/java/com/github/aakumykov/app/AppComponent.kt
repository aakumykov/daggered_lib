package com.github.aakumykov.app

import dagger.Component

@Component(modules = [
    AppQwertyFactoriesModule::class,
    AppQwertyCreatorsModule::class,
])
interface AppComponent {
    fun getQwertyFactoryCreator(): QwertyFactoryCreator
    fun getQwertyCreatorCreator(): QwertyCreatorCreator
}
