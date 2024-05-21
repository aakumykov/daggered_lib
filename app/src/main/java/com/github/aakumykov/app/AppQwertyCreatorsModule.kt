package com.github.aakumykov.app

import com.github.aakumykov.daggered_lib.QwertyCreator
import com.github.aakumykov.daggered_lib.qwerty.LocalQwerty
import com.github.aakumykov.daggered_lib.qwerty.RemoteQwerty
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface AppQwertyCreatorsModule {

    @Binds
    @IntoMap
    @StorageTypeKey(StorageType.LOCAL)
    fun localQwertyCreator(creator: LocalQwerty.Creator): QwertyCreator

    @Binds
    @IntoMap
    @StorageTypeKey(StorageType.REMOTE)
    fun remoteQwertyCreator(creator: RemoteQwerty.Creator): QwertyCreator
}
