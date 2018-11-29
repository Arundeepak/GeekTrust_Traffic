package com.geektrust.zomato.Traffic.vehiclesservice;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public abstract class OrbitSpeedAndTimeAnalysis {

	public Map<String, LinkedList<LinkedList<Integer>>> resultMap = new LinkedHashMap<String, LinkedList<LinkedList<Integer>>>();

	public void orbitSpeedTime(int orbitOneMaxSpeed, int orbitTwoMaxSpeed, int orbitOneCartes, int orbitTwoCartes,
			String vehicleType, int vehicleSpeed, int vehicleCarterTime) {
		orbitOneSpeedTimeAnalysis(orbitOneMaxSpeed, orbitOneCartes, vehicleType, vehicleSpeed, vehicleCarterTime);
		orbitTwoSpeedTimeAnalysis(orbitTwoMaxSpeed, orbitTwoCartes, vehicleType, vehicleSpeed, vehicleCarterTime);
		System.out.println(resultMap);

	}

	public abstract LinkedList<LinkedList<Integer>> orbitOneSpeedTimeAnalysis(int orbitOneMaxSpeed, int orbitOneCartes,
			String vehicleType, int vehicleSpeed, int vehicleCarterTime);

	public abstract LinkedList<LinkedList<Integer>> orbitTwoSpeedTimeAnalysis(int orbitTwoMaxSpeed, int orbitTwoCartes,
			String vehicleType, int vehicleSpeed, int vehicleCarterTime);

}
