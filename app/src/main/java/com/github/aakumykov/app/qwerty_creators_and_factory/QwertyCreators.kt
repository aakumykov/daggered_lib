package com.github.aakumykov.app.qwerty_creators_and_factory

import com.github.aakumykov.daggered_lib.User
import com.github.aakumykov.daggered_lib.qwerty.LocalQwerty
import com.github.aakumykov.daggered_lib.qwerty.Qwerty
import com.github.aakumykov.daggered_lib.qwerty.RemoteQwerty
import javax.inject.Inject

interface QwertyCreator {
    fun createQwerty(user: User): Qwerty
}

class LocalQwertyCreator @Inject constructor() : QwertyCreator {
    override fun createQwerty(user: User): Qwerty {
        return LocalQwerty.create(user)
    }
}

class RemoteQwertyCreator @Inject constructor() : QwertyCreator {
    override fun createQwerty(user: User): Qwerty {
        return RemoteQwerty.createDefault(user)
    }
}