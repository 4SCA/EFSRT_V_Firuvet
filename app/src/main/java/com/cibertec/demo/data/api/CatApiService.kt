package com.cibertec.demo.data.api

import com.cibertec.demo.entity.CatBreed
import com.cibertec.demo.entity.CatImage
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface CatApiService {
    @GET("breeds")
    fun getAllBreeds(@Header("x-api-key") apiKey: String): Call<List<CatBreed>>

    @GET("images/search")
    fun getImagesByBreed(@Query("breed_ids") breedId: String,
                         @Query("limit") limit: Int = 1,
                         @Header("x-api-key") apiKey: String
    ): Call<List<CatImage>>
}