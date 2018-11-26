package com.geektrust.zomato.Traffic.vehiclesservice;

public class CarAnalysis implements Vehicles {

	public CalcuateSpeedForOrbits orbitSpeeds;

	public CarAnalysis(CalcuateSpeedForOrbits calcuateSpeedForOrbits) {
		this.orbitSpeeds = new CalcuateSpeedForOrbits();
		orbitSpeeds.OrbitSpeedTime("CarAnalysis");
	}

	@Override
	public CalcuateSpeedForOrbits speedCalculateForOrbits() {
		// TODO Auto-generated method stub
		return orbitSpeeds;
	}

}
