package com.opeanweather.weather.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WeatherLog")
public class Logs {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true)
	private Long id;
	
	@Column(name = "responseId", columnDefinition = "BINARY(16)", unique = true)
	private String responseId;

	@Column(name = "location", updatable = false, nullable = false)
	private String location;

	@Column(name = "actualWeather", updatable = false, nullable = false)
	private String actualWeather;

	@Column(name = "temperature", updatable = false, nullable = false)
	private Float temperature;

	@Column(name = "dTimeInserted", updatable = false, nullable = false)
	private Timestamp dTimeInserted;

	
	
	public String getResponseId() {
		return responseId;
	}

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getActualWeather() {
		return actualWeather;
	}

	public void setActualWeather(String actualWeather) {
		this.actualWeather = actualWeather;
	}

	public Float getTemperature() {
		return temperature;
	}

	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}

	public Timestamp getdTimeInserted() {
		return dTimeInserted;
	}

	public void setdTimeInserted(Timestamp dTimeInserted) {
		this.dTimeInserted = dTimeInserted;
	}

}
