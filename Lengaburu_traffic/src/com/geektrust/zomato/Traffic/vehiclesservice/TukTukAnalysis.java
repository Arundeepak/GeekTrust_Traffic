package com.geektrust.zomato.Traffic.vehiclesservice;

public class TukTukAnalysis implements Vehicles {
	
	public CalcuateSpeedForOrbits orbitSpeeds;

	public TukTukAnalysis(CalcuateSpeedForOrbits calcuateSpeedForOrbits) {
		this.orbitSpeeds = calcuateSpeedForOrbits;
		orbitSpeeds.OrbitSpeedTime("TukTukAnalysis");
	}

	public TukTukAnalysis() {
		this.orbitSpeeds = new CalcuateSpeedForOrbits();
		orbitSpeeds.OrbitSpeedTime("TukTukAnalysis");
	}

	@Override
	public CalcuateSpeedForOrbits speedCalculateForOrbits() {
		// TODO Auto-generated method stub
		return orbitSpeeds;
	}

}
