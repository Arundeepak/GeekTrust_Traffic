package com.geektrust.zomato.Traffic.vehiclesservice;

public class BikeAnalysis implements Vehicles {
	
	public CalcuateSpeedForOrbits orbitSpeeds;
	
	public BikeAnalysis() {
		this.orbitSpeeds = new CalcuateSpeedForOrbits();
		orbitSpeeds.OrbitSpeedTime("BikeAnalysis");
	}

	@Override
	public CalcuateSpeedForOrbits speedCalculateForOrbits() {
		// TODO Auto-generated method stub
		return orbitSpeeds;
	}

}
