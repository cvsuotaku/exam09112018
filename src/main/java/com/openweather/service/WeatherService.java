package com.openweather.service;

import com.openweather.dto.CurrentWeather;

public interface WeatherService {
	
	CurrentWeather getCurrentWeatherById(Integer cityId);
}
