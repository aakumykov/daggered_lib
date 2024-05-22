package com.github.aakumykov.app

import com.github.aakumykov.daggered_lib.User
import com.github.aakumykov.daggered_lib.qwerty.Qwerty
import javax.inject.Inject

class QwertyCreatorFactory @Inject constructor(
    private val qwertyCreatorsMap: Map<StorageType, @JvmSuppressWildcards Qwerty.Creator>
) {
    fun createQwertyCreator(storageType: StorageType): Qwerty.Creator? {
        return qwertyCreatorsMap[storageType]
    }
}