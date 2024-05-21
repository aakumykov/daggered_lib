package com.github.aakumykov.app

import com.github.aakumykov.daggered_lib.QwertyCreator
import javax.inject.Inject

class QwertyCreatorCreator @Inject constructor(
    private val map: Map<StorageType, @JvmSuppressWildcards QwertyCreator>
) {
    fun createQwertyCreator(storageType: StorageType): QwertyCreator? = map[storageType]
}
