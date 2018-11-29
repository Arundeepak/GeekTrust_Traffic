package com.geektrust.zomato.Traffic.vehiclesservice;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.geektrust.zomato.Traffic.Weather;
import com.geektrust.zomato.Traffic.WeatherConditions;

public class CalcuateSpeedForOrbits extends OrbitSpeedAndTimeAnalysis {

	String vehicleType;
	int vehicleSpeed;
	int vehicleCarterTime;
	LinkedList<LinkedList<Integer>> orbitResultList = new LinkedList<LinkedList<Integer>>();
	LinkedList<Integer> resultList ;
	public CalcuateSpeedForOrbits() {

	}

	public CalcuateSpeedForOrbits(String vehicleType, int vehicleSpeed, int vehicleCarterTime) {
		this.vehicleType = vehicleType;
		this.vehicleSpeed = vehicleSpeed;
		this.vehicleCarterTime = vehicleCarterTime;
	}

	@Override
	public LinkedList<LinkedList<Integer>> orbitOneSpeedTimeAnalysis(int orbitOneMaxSpeed, int orbitOneCartes,String vehicleType, int vehicleSpeed, int vehicleCarterTime) {
		int totalOrbitOneVehicleTime = 0;
		resultList = new LinkedList<Integer>();
		if (Weather.getWeatherCondition().equalsIgnoreCase(WeatherConditions.SUNNY.toString())) {

			totalOrbitOneVehicleTime = ((orbitOneMaxSpeed) / vehicleSpeed) * 60
					+ ((orbitOneCartes) - ((orbitOneCartes) * 10 / 100) * vehicleCarterTime);

		} else if (Weather.getWeatherCondition().equalsIgnoreCase(WeatherConditions.WINDY.toString())) {
			totalOrbitOneVehicleTime = ((orbitOneMaxSpeed) / vehicleSpeed) * 60 + orbitOneCartes * vehicleCarterTime;
		} else {

			totalOrbitOneVehicleTime = ((orbitOneMaxSpeed) / vehicleSpeed) * 60
					+ (orbitOneCartes + ((orbitOneCartes) * 20 / 100)) * (vehicleCarterTime);

		}
		resultList.add(1);
		resultList.add(totalOrbitOneVehicleTime);
		orbitResultList.add(resultList);
		return resultMap.put(vehicleType, orbitResultList);
	}

	@Override
	public LinkedList<LinkedList<Integer>> orbitTwoSpeedTimeAnalysis(int orbitTwoMaxSpeed, int orbitTwoCartes,String vehicleType, int vehicleSpeed, int vehicleCarterTime) {
		int totalOrbitTwoVehicleTime = 0;
		resultList = new LinkedList<Integer>();
		if (Weather.getWeatherCondition().equalsIgnoreCase(WeatherConditions.SUNNY.toString())) {

			totalOrbitTwoVehicleTime = ((orbitTwoMaxSpeed) / vehicleSpeed) * 60
					+ ((orbitTwoCartes) - ((orbitTwoCartes) * 10 / 100) * vehicleCarterTime);

		} else if (Weather.getWeatherCondition().equalsIgnoreCase(WeatherConditions.WINDY.toString())) {
			totalOrbitTwoVehicleTime = ((orbitTwoMaxSpeed) / vehicleSpeed) * 60 + orbitTwoMaxSpeed * vehicleCarterTime;
		} else {
			totalOrbitTwoVehicleTime = ((orbitTwoMaxSpeed) / vehicleSpeed) * 60
					+ (orbitTwoCartes + ((orbitTwoCartes) * 20 / 100)) * (vehicleCarterTime);
		}
		resultList.add(2);
		resultList.add(totalOrbitTwoVehicleTime);
		orbitResultList.add(resultList);
		return resultMap.put(vehicleType, orbitResultList);

	}

}
