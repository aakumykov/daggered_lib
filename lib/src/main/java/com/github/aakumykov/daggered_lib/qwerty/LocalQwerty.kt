package com.github.aakumykov.daggered_lib.qwerty

import com.github.aakumykov.daggered_lib.User
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import javax.inject.Inject

class LocalQwerty @AssistedInject constructor(
    @Assisted private val user: User
): Qwerty {

    override fun getUser(): User = user

    @AssistedFactory
    interface Factory : Qwerty.Factory {
        override fun create(user: User): LocalQwerty
    }

    class Creator @Inject constructor(private val qwertyAssistedFactory: Factory): Qwerty.Creator {
        override fun createQwerty(user: User): Qwerty = qwertyAssistedFactory.create(user)
    }

    companion object {
        fun create(user: User): LocalQwerty = LocalQwerty(user)
    }
}