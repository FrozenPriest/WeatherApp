package ru.frozenpriest.weatherapp.core.network.model

import com.google.gson.annotations.SerializedName

data class WeatherResponse(
    @SerializedName("hourly")
    val weatherData: WeatherDataResponse
)
