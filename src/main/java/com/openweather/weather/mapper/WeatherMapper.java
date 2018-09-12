package com.openweather.weather.mapper;

import java.util.Calendar;
import java.util.UUID;

import com.opeanweather.weather.entity.Logs;
import com.openweather.weather.dto.CurrentWeather;

public class WeatherMapper {
	
	public Logs DtoToEntity(CurrentWeather dto) {
		Logs log = new Logs();
		Calendar calendar = Calendar.getInstance();
		log.setResponseId(UUID.randomUUID().toString());
		log.setActualWeather(dto.getWeather().size() > 0 ? dto.getWeather().get(0).getDescription() : "Weather not available.");
		log.setLocation(dto.getName());
		log.setTemperature(dto.getMain().getTemp());
		log.setdTimeInserted(new java.sql.Timestamp(calendar.getTime().getTime()));
		return log;
	}
}
