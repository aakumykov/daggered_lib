package com.github.aakumykov.app

import com.github.aakumykov.daggered_lib.qwerty.LocalQwerty
import com.github.aakumykov.daggered_lib.qwerty.Qwerty
import com.github.aakumykov.daggered_lib.qwerty.RemoteQwerty
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface AppQwertyFactoriesModule {

    @Binds
    @IntoMap
    @StorageTypeKey(StorageType.LOCAL)
    fun bindLocalQwertyFactory(factory: LocalQwerty.Factory): Qwerty.Factory

    @Binds
    @IntoMap
    @StorageTypeKey(StorageType.REMOTE)
    fun bindRemoteQwertyFactory(factory: RemoteQwerty.Factory): Qwerty.Factory
}
