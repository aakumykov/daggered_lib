package com.github.aakumykov.app

import com.github.aakumykov.daggered_lib.di.QwertyCreatorsModule
import dagger.Component

@Component(modules = [
    QwertyCreatorsModule::class
])
interface AppComponent {

}
