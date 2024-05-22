package com.github.aakumykov.daggered_lib.qwerty

import com.github.aakumykov.daggered_lib.NetworkService
import com.github.aakumykov.daggered_lib.User
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import okhttp3.OkHttpClient
import javax.inject.Inject

class RemoteQwerty @AssistedInject constructor(
    @Assisted private val user: User,
): Qwerty
{
    private val okHttpClient = OkHttpClient.Builder().build()

    override fun getUser(): User = user

    @AssistedFactory
    interface Factory : Qwerty.Factory {
        override fun create(user: User): RemoteQwerty
    }

    class Creator @Inject constructor(private val qwertyAssistedFactory: Factory) : Qwerty.Creator {
        override fun createQwerty(user: User): Qwerty = qwertyAssistedFactory.create(user)
    }

    companion object {
        fun create(user: User): RemoteQwerty = RemoteQwerty(user)
    }
}