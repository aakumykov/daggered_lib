package com.github.aakumykov.daggered_lib.di

import com.github.aakumykov.daggered_lib.StorageType
import dagger.MapKey

@MapKey
@Retention(AnnotationRetention.RUNTIME)
annotation class StorageTypeKey(val value: StorageType)
