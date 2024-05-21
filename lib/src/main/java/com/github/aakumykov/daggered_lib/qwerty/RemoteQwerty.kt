package com.github.aakumykov.daggered_lib.qwerty

import com.github.aakumykov.daggered_lib.QwertyCreator
import com.github.aakumykov.daggered_lib.User
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import javax.inject.Inject

// TODO: добавить доп. поля
class RemoteQwerty @AssistedInject constructor(@Assisted private val user: User): Qwerty {
    override fun getUser(): User = user

    @AssistedFactory
    interface Factory : Qwerty.Factory {
        override fun create(user: User): RemoteQwerty
    }

    class Creator @Inject constructor(): QwertyCreator {
        override fun createQwerty(user: User): RemoteQwerty = RemoteQwerty(user)
    }
}