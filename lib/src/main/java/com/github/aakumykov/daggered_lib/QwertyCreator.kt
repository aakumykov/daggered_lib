package com.github.aakumykov.daggered_lib

import com.github.aakumykov.daggered_lib.qwerty.Qwerty

interface QwertyCreator {
    fun createQwerty(user: User): Qwerty
}
