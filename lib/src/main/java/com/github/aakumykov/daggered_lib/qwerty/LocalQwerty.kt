package com.github.aakumykov.daggered_lib.qwerty

import com.github.aakumykov.daggered_lib.User
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

class LocalQwerty @AssistedInject constructor(
    @Assisted private val user: User
): Qwerty {

    override fun getUser(): User = user

    @AssistedFactory
    interface Factory : Qwerty.Factory {
        override fun create(user: User): LocalQwerty
    }

    companion object {
        fun createDefault(user: User): LocalQwerty = LocalQwerty(user)
    }
}