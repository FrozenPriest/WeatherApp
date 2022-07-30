package ru.frozenpriest.weatherapp.core.network

import retrofit2.Response
import ru.frozenpriest.weatherapp.core.network.model.WeatherResponse

interface WeatherNetworkDataSource {
    suspend fun getWeather(
        lat: Double,
        long: Double
    ): Response<WeatherResponse>
}
