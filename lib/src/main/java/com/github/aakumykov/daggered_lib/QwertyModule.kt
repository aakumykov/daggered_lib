package com.github.aakumykov.daggered_lib

import dagger.Module
import dagger.Provides

@Module
class QwertyModule {

    @Provides
    fun provideUser(): User = User("Андрей")
}