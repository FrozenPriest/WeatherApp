package ru.frozenpriest.weatherapp.core.network.retrofit

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import ru.frozenpriest.weatherapp.core.network.model.WeatherResponse

interface WeatherApi {
    @GET("v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl")
    suspend fun getWeather(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double
    ): Response<WeatherResponse>
}
