package com.opeanweather.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WeatherLog", schema = "log")
public class Logs {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "responseId")
	private String responseId;

	@Column(name = "location")
	private String location;

	@Column(name = "actualWeather")
	private String actualWeather;

	@Column(name = "temperature")
	private String temperature;

	@Column(name = "dTimeInserted")
	private Timestamp dTimeInserted;

	public Logs(Long id, String responseId, String location, String actualWeather, String temperature,
			Timestamp dTimeInserted) {
		super();
		this.id = id;
		this.responseId = responseId;
		this.location = location;
		this.actualWeather = actualWeather;
		this.temperature = temperature;
		this.dTimeInserted = dTimeInserted;
	}

}
