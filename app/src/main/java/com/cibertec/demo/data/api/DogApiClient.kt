package com.cibertec.demo.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DogApiClient {
    private val BASE_URL = "https://dog.ceo/api/"

    val apiService: DogApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(DogApiService::class.java)
    }
}