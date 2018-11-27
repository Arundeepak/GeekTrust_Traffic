package com.geektrust.zomato.Traffic.vehiclesservice;

public abstract class OrbitSpeedAndTimeAnalysis {

	public void orbitSpeedTime(int orbitOneMaxSpeed, int orbitTwoMaxSpeed, int orbitOneCartes, int orbitTwoCartes) {
		orbitOneSpeedTimeAnalysis(orbitOneMaxSpeed, orbitOneCartes);
		orbitTwoSpeedTimeAnalysis(orbitTwoMaxSpeed, orbitTwoCartes);

	}

	public abstract void orbitOneSpeedTimeAnalysis(int orbitOneMaxSpeed, int orbitOneCartes);

	public abstract void orbitTwoSpeedTimeAnalysis(int orbitTwoMaxSpeed, int orbitTwoCartes);

}
