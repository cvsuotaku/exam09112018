package com.openweather.weather.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.opeanweather.weather.entity.Logs;
import com.openweather.weather.constant.OpenWeatherConstants;
import com.openweather.weather.dto.CurrentWeather;
import com.openweather.weather.mapper.WeatherMapper;
import com.openweather.weather.repository.LogsRepository;
import com.openweather.weather.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	LogsRepository logsRepository;
	
	WeatherMapper weatherMapper = new WeatherMapper();
	
	private static final Logger LOGGER = Logger.getLogger(WeatherServiceImpl.class.getName());

	@Override
	@Transactional
	public CurrentWeather getCurrentWeatherById(Integer cityId) {
		LOGGER.info("START - getCurrentWeatherById");
		final String URI = "https://api.openweathermap.org/data/2.5/weather?id=" + cityId + "&appid="
				+ OpenWeatherConstants.API_KEY;

		RestTemplate restTemplate = new RestTemplate();
		CurrentWeather result = restTemplate.getForObject(URI, CurrentWeather.class);
		LOGGER.info("START - saveLog");
		List<Logs> logs = new ArrayList<>();
		List<Logs> logsDelete = new ArrayList<>();
		logs = logsRepository.findAll();
		if((logs.size() - 5) >= 0) {			
			logsDelete = logs.subList(0, logs.size() - 4);
			logsRepository.deleteAll(logsDelete);
		}
		logsRepository.save(weatherMapper.DtoToEntity(result));
		LOGGER.info("END - saveLog");
		
		LOGGER.info("END - getCurrentWeatherById");
		return result;
	}

}
