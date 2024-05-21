package com.github.aakumykov.daggered_lib.di

import com.github.aakumykov.daggered_lib.QwertyCreator
import com.github.aakumykov.daggered_lib.qwerty.LocalQwerty
import com.github.aakumykov.daggered_lib.qwerty.RemoteQwerty
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class QwertyCreatorsModule {

    // TODO: переделать на @Binds

    @Provides
    fun provideLocalQwertyCreator(qwertyFactory: LocalQwerty.Factory): QwertyCreator {
        return LocalQwerty.Creator(qwertyFactory)
    }

    @Provides
    fun provideRemoteQwertyCreator(qwertyFactory: RemoteQwerty.Factory): QwertyCreator {
        return RemoteQwerty.Creator(qwertyFactory)
    }
}