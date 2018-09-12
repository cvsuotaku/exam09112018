package com.openweather.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.openweather.weather.dto.CurrentWeather;
import com.openweather.weather.service.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {

	@Autowired
	private WeatherService weatherSerivce;
	
	@GetMapping("/getWeatherInformation")
	@ResponseBody
	public CurrentWeather getWeatherInformation(@RequestParam Integer cityId) {
		return weatherSerivce.getCurrentWeatherById(cityId);
	}
}
