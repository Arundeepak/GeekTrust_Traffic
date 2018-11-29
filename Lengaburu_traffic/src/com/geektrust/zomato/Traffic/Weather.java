package com.geektrust.zomato.Traffic;

public class Weather {
	
	private static String weatherCondition;

	public static String getWeatherCondition() {
		return weatherCondition;
	}

	public static void setWeatherCondition(String weatherCondition) {
		Weather.weatherCondition = weatherCondition;
	}

}
