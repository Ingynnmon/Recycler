package com.app.recycler

import retrofit2.Call
import retrofit2.http.GET

interface MealService {
    @GET("api/json/v1/1/latest.php")
    fun getLatestMeals(): Call<LatestMealResponse>
}