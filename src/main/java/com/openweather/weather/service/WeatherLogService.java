package com.openweather.weather.service;

import java.util.List;

import com.opeanweather.weather.entity.Logs;

public interface WeatherLogService {
	
	List<Logs> getAllWeatherLogs();
	
}
