package com.github.aakumykov.daggered_lib

data class User(val name: String) {
    companion object {
        val DUMMY_USER: User = User("Иванов Иван Иванович")
    }
}
