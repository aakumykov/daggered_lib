package com.github.aakumykov.daggered_lib.di

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient

@Module
class NetworkModule {

    @Provides
    fun provideOkHttpClient(): OkHttpClient = OkHttpClient.Builder().build()
}