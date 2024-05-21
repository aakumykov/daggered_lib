package com.github.aakumykov.app

import com.github.aakumykov.daggered_lib.qwerty.Qwerty
import javax.inject.Inject

class QwertyFactoryCreator @Inject constructor(
    private val map: Map<StorageType, @JvmSuppressWildcards Qwerty.Factory>
) {
    fun createQwertyFactory(storageType: StorageType): Qwerty.Factory? = map[storageType]
}
