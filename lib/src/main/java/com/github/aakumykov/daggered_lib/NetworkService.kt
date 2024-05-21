package com.github.aakumykov.daggered_lib

import okhttp3.OkHttpClient
import javax.inject.Inject

class NetworkService @Inject constructor(private val okHttpClient: OkHttpClient){

}
