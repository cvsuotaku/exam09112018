package com.openweather.weather.service;

import com.openweather.weather.dto.CurrentWeather;

public interface WeatherService {
	
	CurrentWeather getCurrentWeatherById(Integer cityId);
}
