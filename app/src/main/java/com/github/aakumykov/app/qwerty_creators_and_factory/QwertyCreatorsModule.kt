package com.github.aakumykov.app.qwerty_creators_and_factory

import com.github.aakumykov.app.KeyStorageType
import com.github.aakumykov.app.StorageType
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface QwertyCreatorsModule {

    @Binds
    @IntoMap
    @KeyStorageType(StorageType.LOCAL)
    fun bindLocalQwertyFactory(localQwertyFactory: LocalQwertyCreator): QwertyCreator

    @Binds
    @IntoMap
    @KeyStorageType(StorageType.REMOTE)
    fun bindRemoteQwertyFactory(remoteQwertyFactory: RemoteQwertyCreator): QwertyCreator
}