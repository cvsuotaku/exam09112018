package com.openweather.weather.dto;

public class Main {
	Float temp;
	Integer pressure;
	Integer humidity;
	Float temp_min;
	Float temp_max;

	public Float getTemp() {
		return temp;
	}

	public void setTemp(Float temp) {
		this.temp = temp;
	}

	public Integer getPressure() {
		return pressure;
	}

	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}

	public Integer getHumidity() {
		return humidity;
	}

	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}

	public Float getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(Float temp_min) {
		this.temp_min = temp_min;
	}

	public Float getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(Float temp_max) {
		this.temp_max = temp_max;
	}
}
