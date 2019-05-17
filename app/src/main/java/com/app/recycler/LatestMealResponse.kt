package com.app.recycler

import com.google.gson.annotations.SerializedName

class LatestMealResponse {
    @SerializedName("meals")
    val meals : ArrayList<Meal>? = null
}