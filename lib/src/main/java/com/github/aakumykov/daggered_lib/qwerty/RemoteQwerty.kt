package com.github.aakumykov.daggered_lib.qwerty

import com.github.aakumykov.daggered_lib.NetworkService
import com.github.aakumykov.daggered_lib.User
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import okhttp3.OkHttpClient

class RemoteQwerty @AssistedInject constructor(
    @Assisted private val user: User,
    val networkService: NetworkService,
): Qwerty
{
    override fun getUser(): User = user

    @AssistedFactory
    interface Factory : Qwerty.Factory {
        override fun create(user: User): RemoteQwerty
    }

    companion object {

        fun createDefault(user: User): RemoteQwerty {
            return create(user, NetworkService(OkHttpClient()))
        }

        fun create(user: User, networkService: NetworkService): RemoteQwerty {
            return RemoteQwerty(user, networkService)
        }
    }
}