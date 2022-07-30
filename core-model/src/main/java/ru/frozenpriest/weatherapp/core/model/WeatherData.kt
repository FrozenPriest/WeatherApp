package ru.frozenpriest.weatherapp.core.model

data class WeatherData(
    val time: String,
    val temperature: Double,
    val weatherCode: Int,
    val pressure: Double,
    val windSpeed: Double,
    val humidity: Double
)
