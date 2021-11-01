package com.example.weatherapi.data.model

import com.google.gson.annotations.SerializedName

data class WeatherCity(
    @SerializedName("consolidated_weather")
    var consolidated_weather: List<Day>,
    @SerializedName("title")
    var title: String
)