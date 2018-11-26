package com.geektrust.zomato.Traffic.vehicles.dto;

import com.geektrust.zomato.Traffic.WeatherConditions;

public class Bike {

	private int bikeSpeed = 10;
	private static final int bikeCarterTime = 2;
	private String[] bikeWeatherCondition = new String[] { WeatherConditions.SUNNY.toString(),
			WeatherConditions.WINDY.toString() };

	public int getBikeSpeed() {
		return bikeSpeed;
	}

	public void setBikeSpeed(int bikeSpeed) {
		this.bikeSpeed = bikeSpeed;
	}

	public int getBikeCarterTime() {
		return bikeCarterTime;
	}

	public String[] getBikeWeatherCondition() {
		return bikeWeatherCondition;
	}

	public void setBikeWeatherCondition(String[] bikeWeatherCondition) {
		this.bikeWeatherCondition = bikeWeatherCondition;
	}

}
