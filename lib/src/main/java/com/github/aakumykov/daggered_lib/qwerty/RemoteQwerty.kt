package com.github.aakumykov.daggered_lib.qwerty

import com.github.aakumykov.daggered_lib.User
import okhttp3.OkHttpClient

class RemoteQwerty private constructor(
    private val user: User,
    private val okHttpClient: OkHttpClient
): Qwerty
{
    override fun getUser(): User = user

    companion object {
        fun createDefault(user: User): RemoteQwerty = create(user, OkHttpClient.Builder().build())
        fun create(user: User, okHttpClient: OkHttpClient): RemoteQwerty = RemoteQwerty(user,okHttpClient)
    }
}