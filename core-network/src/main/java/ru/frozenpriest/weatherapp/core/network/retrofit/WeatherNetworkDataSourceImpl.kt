package ru.frozenpriest.weatherapp.core.network.retrofit

import ru.frozenpriest.weatherapp.core.network.WeatherNetworkDataSource
import javax.inject.Inject

class WeatherNetworkDataSourceImpl @Inject constructor(
    private val weatherApi: WeatherApi,
) : WeatherNetworkDataSource {
    override suspend fun getWeather(lat: Double, long: Double) = weatherApi.getWeather(lat, long)
}
