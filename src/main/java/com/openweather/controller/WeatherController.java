package com.openweather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.openweather.dto.CurrentWeather;
import com.openweather.service.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {

	@Autowired
	private WeatherService weatherSerivce;
	
	@RequestMapping(value = "/getWeatherInformation", method = RequestMethod.GET)
	public CurrentWeather getWeatherInformation(@RequestParam Integer cityId) {
		return weatherSerivce.getCurrentWeatherById(cityId);
	}
}
