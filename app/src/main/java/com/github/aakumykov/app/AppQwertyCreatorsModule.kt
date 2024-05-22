package com.github.aakumykov.app

import com.github.aakumykov.daggered_lib.qwerty.LocalQwerty
import com.github.aakumykov.daggered_lib.qwerty.Qwerty
import com.github.aakumykov.daggered_lib.qwerty.RemoteQwerty
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface AppQwertyCreatorsModule {

    @Binds
    @IntoMap
    @KeyStorageType(StorageType.LOCAL)
    fun bindLocalQwertyCreator(creator: LocalQwerty.Creator): Qwerty.Creator

    @Binds
    @IntoMap
    @KeyStorageType(StorageType.REMOTE)
    fun bindRemoteQwertyCreator(creator: RemoteQwerty.Creator): Qwerty.Creator
}
