package com.geektrust.zomato.Traffic.vehicles.dto;

import com.geektrust.zomato.Traffic.WeatherConditions;

public class SuperCar {

	private int superCarSpeed = 20;
	private static final int superCarCarterTime = 3;
	private String[] superCarWeather = new String[] { WeatherConditions.SUNNY.toString(),
			WeatherConditions.WINDY.toString(), WeatherConditions.RAINY.toString() };

	public int getSuperCarSpeed() {
		return superCarSpeed;
	}

	public void setSuperCarSpeed(int superCarSpeed) {
		this.superCarSpeed = superCarSpeed;
	}

	public int getSuperCarCarterTime() {
		return superCarCarterTime;
	}

	public String[] getSuperCarWeather() {
		return superCarWeather;
	}

	public void setSuperCarWeather(String[] superCarWeather) {
		this.superCarWeather = superCarWeather;
	}

}
