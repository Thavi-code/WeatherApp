package lk.nibm.kotlinweatherapp

object WeatherIconHelper {
    fun getWeatherIcon(weatherDescription: String): Int {
        return when {
            weatherDescription.contains("clear") -> R.drawable.clearsun
            weatherDescription.contains("cloud") -> R.drawable.cloudy
            weatherDescription.contains("rain") -> R.drawable.rainy
            weatherDescription.contains("light rain") -> R.drawable.rainy
            weatherDescription.contains("thunderstorm") -> R.drawable.thunderstorm
            // Add more conditions for other weather descriptions
            else -> R.drawable.sunny
        }
    }
}

