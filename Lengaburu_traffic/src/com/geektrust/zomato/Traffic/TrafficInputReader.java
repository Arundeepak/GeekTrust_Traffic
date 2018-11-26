package com.geektrust.zomato.Traffic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.geektrust.zomato.Traffic.orbit.dto.Orbit1DTO;
import com.geektrust.zomato.Traffic.orbit.dto.Orbit2DTO;

public class TrafficInputReader {

	public static void main(String[] arg) throws IOException {

		TrafficInputReader inputReader = new TrafficInputReader();
		inputReader.readInputs();

	}

	public void readInputs() throws IOException {

		Orbit1DTO orbit1SpeedLimit = new Orbit1DTO();
		Orbit2DTO orbit2SpeedLimit = new Orbit2DTO();

		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Weather Condition");
		String weatherCondition = inputReader.readLine();

		if (!weatherCondition.equalsIgnoreCase(WeatherConditions.SUNNY.toString())
				&& !weatherCondition.equalsIgnoreCase(WeatherConditions.RAINY.toString())
				&& !weatherCondition.equalsIgnoreCase(WeatherConditions.WINDY.toString())) {
			System.out.println("Enter Proper waether condition");
		}

		System.out.println("Enter Orbit 1 Speed Limit");
		String orbit1SpeedLimitBefore = inputReader.readLine();
		System.out.println("Enter Orbit 2 Speed Limit");
		String orbit2SpeedLimitBefore = inputReader.readLine();

		if (Integer.valueOf(orbit1SpeedLimitBefore) instanceof Integer
				&& Integer.valueOf(orbit2SpeedLimitBefore) instanceof Integer) {
			orbit1SpeedLimit.setOrbitsSpeed(Integer.valueOf(orbit1SpeedLimitBefore));
			orbit2SpeedLimit.setOrbitsSpeed(Integer.valueOf(orbit2SpeedLimitBefore));
		} else {
			System.out.println("Enter Orbit Speed in numbers");
		}

		LengaburuTrafficAnalysis.VehicleAnalysis(weatherCondition);

	}

}