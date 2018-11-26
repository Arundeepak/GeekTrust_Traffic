package com.geektrust.zomato.Traffic.vehicles.dto;

import com.geektrust.zomato.Traffic.WeatherConditions;

public class TukTuk {

	private int tukTukSpeed = 12;
	private static final int tukTukCarterTime = 1;
	private String[] tukTukWeatherCondition = new String[] { WeatherConditions.SUNNY.toString(),
			WeatherConditions.RAINY.toString() };

	public int getTukTukSpeed() {
		return tukTukSpeed;
	}

	public void setTukTukSpeed(int tukTukSpeed) {
		this.tukTukSpeed = tukTukSpeed;
	}

	public int getTukTukCarterTime() {
		return tukTukCarterTime;
	}

	public String[] getTukTukWeatherCondition() {
		return tukTukWeatherCondition;
	}

	public void setTukTukWeatherCondition(String[] tukTukWeatherCondition) {
		this.tukTukWeatherCondition = tukTukWeatherCondition;
	}

}
