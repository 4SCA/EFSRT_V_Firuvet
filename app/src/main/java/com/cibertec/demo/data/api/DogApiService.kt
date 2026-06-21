package com.cibertec.demo.data.api

import com.cibertec.demo.entity.DogBreedsResponse
import com.cibertec.demo.entity.DogImageResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface DogApiService {
    @GET("breeds/list/all")
    fun getAllBreeds(): Call<DogBreedsResponse>

    @GET("breed/{breed}/images/random")
    fun getRandomImageByBreed(@Path("breed") breed: String): Call<DogImageResponse>
}