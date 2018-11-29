/**
 * 
 */
package com.geektrust.zomato.Traffic.vehiclesservice;

/**
 * @author Arundeepak.M
 *
 */
public interface Vehicles {

	default CalcuateSpeedForOrbits getCalcuateSpeedForOrbit(String vehicleType, int vehicleSpeed,
			int vehicleCarterTime) {

		return new CalcuateSpeedForOrbits(vehicleType, vehicleSpeed, vehicleCarterTime);
	}

}
