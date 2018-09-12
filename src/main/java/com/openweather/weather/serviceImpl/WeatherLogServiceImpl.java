package com.openweather.weather.serviceImpl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opeanweather.weather.entity.Logs;
import com.openweather.weather.repository.LogsRepository;
import com.openweather.weather.service.WeatherLogService;

@Service
public class WeatherLogServiceImpl implements WeatherLogService {

	private static final Logger LOGGER = Logger.getLogger(WeatherLogServiceImpl.class.getName());
	
	@Autowired
	LogsRepository logsRepository;
	
	@Override
	public List<Logs> getAllWeatherLogs() {
		LOGGER.info("START - getAllWeatherLogs");
		List<Logs> logs = logsRepository.findAll();
		LOGGER.info("END - getAllWeatherLogs");
		return logs;
	}

}
