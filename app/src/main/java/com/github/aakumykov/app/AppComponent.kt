package com.github.aakumykov.app

import com.github.aakumykov.daggered_lib.di.QwertyCreatorsModule
import com.github.aakumykov.daggered_lib.qwerty.Qwerty
import dagger.Component

@Component(modules = [
    QwertyCreatorsModule::class,
    AppQwertyCreatorsModule::class
])
interface AppComponent {
    fun getQwertyFactoryCreator(): QwertyFactoryCreator
}
