/**
 * 
 */
package com.geektrust.zomato.Traffic.vehiclesservice;

/**
 * @author Arundeepak.M
 *
 */
public interface Vehicles {

	default CalcuateSpeedForOrbits getCalcuateSpeedForOrbit(int vehicleSpeed, int vehicleCarterTime) {

		return new CalcuateSpeedForOrbits(vehicleSpeed, vehicleCarterTime);
	}

}
