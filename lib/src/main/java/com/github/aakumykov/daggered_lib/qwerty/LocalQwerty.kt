package com.github.aakumykov.daggered_lib.qwerty

import com.github.aakumykov.daggered_lib.User

class LocalQwerty private constructor(
    private val user: User
): Qwerty
{
    override fun getUser(): User = user

    companion object {
        fun create(user: User): LocalQwerty = LocalQwerty(user)
    }
}