package com.github.aakumykov.app.qwerty_creators_and_factory

import com.github.aakumykov.app.StorageType
import javax.inject.Inject

class QwertyCreatorFactory @Inject constructor(
    private val map: Map<StorageType, @JvmSuppressWildcards QwertyCreator>
) {
    fun createQwertyCreator(storageType: StorageType): QwertyCreator? = map[storageType]
}