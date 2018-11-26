package com.geektrust.zomato.Traffic.vehiclesservice;

public abstract class OrbitSpeedAndTimeAnalysis {
	
	public void OrbitSpeedTime(String name) {
		orbitOneSpeedTimeAnalysis(name);
		orbitTwoSpeedTimeAnalysis(name);
		
	}

	public abstract void orbitOneSpeedTimeAnalysis(String name);
	public abstract void orbitTwoSpeedTimeAnalysis(String name);


}
