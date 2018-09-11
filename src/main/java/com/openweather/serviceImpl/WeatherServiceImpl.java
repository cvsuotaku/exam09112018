package com.openweather.serviceImpl;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.openweather.constant.OpenWeatherConstants;
import com.openweather.dto.CurrentWeather;
import com.openweather.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {

	private static final Logger LOGGER = Logger.getLogger(WeatherServiceImpl.class.getName());

	@Override
	public CurrentWeather getCurrentWeatherById(Integer cityId) {
		LOGGER.info("START - getCurrentWeatherById");
		final String uri = "https://samples.openweathermap.org/data/2.5/weather?id=" + cityId + "&appid="
				+ OpenWeatherConstants.API_KEY;

		RestTemplate restTemplate = new RestTemplate();
		CurrentWeather result = restTemplate.getForObject(uri, CurrentWeather.class);

		System.out.println(result);
		LOGGER.info("END - getCurrentWeatherById");
		return result;
	}

}
