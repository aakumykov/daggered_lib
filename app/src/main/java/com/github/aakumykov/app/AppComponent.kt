package com.github.aakumykov.app

import com.github.aakumykov.app.qwerty_creators_and_factory.QwertyCreatorFactory
import com.github.aakumykov.app.qwerty_creators_and_factory.QwertyCreatorsModule
import dagger.Component

@Component(modules = [
    QwertyCreatorsModule::class
])
interface AppComponent {
    fun getQwertyCreatorFactory(): QwertyCreatorFactory
}
