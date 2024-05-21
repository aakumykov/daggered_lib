package com.github.aakumykov.daggered_lib.qwerty

import com.github.aakumykov.daggered_lib.NetworkService
import com.github.aakumykov.daggered_lib.QwertyCreator
import com.github.aakumykov.daggered_lib.User
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import javax.inject.Inject

class RemoteQwerty @AssistedInject constructor(
    @Assisted private val user: User,
    private val networkService: NetworkService,
): Qwerty
{
    override fun getUser(): User = user

    @AssistedFactory
    interface Factory : Qwerty.Factory {
        override fun create(user: User): RemoteQwerty
    }

    companion object {
        fun createDefault(user: User): RemoteQwerty {
            return RemoteQwerty(user, NetworkService())
        }
    }
}