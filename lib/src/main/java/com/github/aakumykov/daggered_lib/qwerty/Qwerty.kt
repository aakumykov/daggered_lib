package com.github.aakumykov.daggered_lib.qwerty

import com.github.aakumykov.daggered_lib.User

interface Qwerty {
    fun getUser(): User

    interface Factory {
        fun create(user: User): Qwerty
    }

    interface Creator {
        fun createQwerty(user: User): Qwerty
    }
}

