package com.geektrust.zomato.Traffic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.geektrust.zomato.Traffic.orbit.dto.OrbitOneDTO;
import com.geektrust.zomato.Traffic.orbit.dto.OrbitTwoDTO;

public class TrafficInputReader {

	public static void main(String[] arg) throws IOException, CloneNotSupportedException {

		TrafficInputReader inputReader = new TrafficInputReader();
		inputReader.getInputs();

	}

	public void getInputs() throws IOException, CloneNotSupportedException {

		OrbitOneDTO orbit1SpeedLimit = new OrbitOneDTO();
		OrbitTwoDTO orbit2SpeedLimit = new OrbitTwoDTO();

		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Weather Condition");
		String weatherCondition = inputReader.readLine();

		while(!weatherCondition.equalsIgnoreCase(WeatherConditions.SUNNY.toString())
				&& !weatherCondition.equalsIgnoreCase(WeatherConditions.RAINY.toString())
				&& !weatherCondition.equalsIgnoreCase(WeatherConditions.WINDY.toString())) {
			System.out.println("Enter Proper waether condition");
			weatherCondition = inputReader.readLine();
		}
		
		System.out.println("Enter Orbit 1 Speed Limit");
		String orbit1SpeedLimitBefore = inputReader.readLine();
		System.out.println("Enter Orbit 2 Speed Limit");
		String orbit2SpeedLimitBefore = inputReader.readLine();

		while(!Integer.valueOf(orbit1SpeedLimitBefore) instanceof Integer
				&& !Integer.valueOf(orbit2SpeedLimitBefore) instanceof Integer) {
			System.out.println("Enter Orbit Speed in numbers");
			orbit1SpeedLimitBefore = inputReader.readLine();
			System.out.println("Enter Orbit 2 Speed Limit");
			orbit2SpeedLimitBefore = inputReader.readLine();	
		} 
		orbit1SpeedLimit.setOrbitsSpeed(Integer.valueOf(orbit1SpeedLimitBefore));
		orbit2SpeedLimit.setOrbitsSpeed(Integer.valueOf(orbit2SpeedLimitBefore));

		LengaburuTrafficAnalysis.VehicleAnalysis(weatherCondition);

	}

}
