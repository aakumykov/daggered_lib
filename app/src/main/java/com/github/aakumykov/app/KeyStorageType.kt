package com.github.aakumykov.app

import dagger.MapKey

@MapKey
@Retention(AnnotationRetention.RUNTIME)
annotation class KeyStorageType(val value: StorageType)
