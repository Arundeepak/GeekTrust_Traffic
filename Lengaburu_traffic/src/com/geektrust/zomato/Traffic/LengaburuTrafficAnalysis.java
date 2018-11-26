package com.geektrust.zomato.Traffic;

import com.geektrust.zomato.Traffic.vehicles.dto.Bike;
import com.geektrust.zomato.Traffic.vehiclesservice.BikeAnalysis;
import com.geektrust.zomato.Traffic.vehiclesservice.CarAnalysis;
import com.geektrust.zomato.Traffic.vehiclesservice.TukTukAnalysis;
import com.geektrust.zomato.Traffic.vehiclesservice.Vehicles;

public class LengaburuTrafficAnalysis {

	public static void VehicleAnalysis(String weatherCondition) {

		if (weatherCondition.equalsIgnoreCase(WeatherConditions.SUNNY.toString())) {
			// bike,tuktuk,car
			System.out.println("Sunny waether");
			Vehicles bikeVehicle = new BikeAnalysis();
			Vehicles tukTukVehicle = new TukTukAnalysis(bikeVehicle.speedCalculateForOrbits());
			Vehicles carsVehicle = new CarAnalysis(tukTukVehicle.speedCalculateForOrbits());

		} else if (weatherCondition.equalsIgnoreCase(WeatherConditions.WINDY.toString())) {
			// car and bike
			Vehicles bikeVehicle = new BikeAnalysis();
			Vehicles carsVehicle = new CarAnalysis(bikeVehicle.speedCalculateForOrbits());

		} else if (weatherCondition.equalsIgnoreCase(WeatherConditions.RAINY.toString())) {
			// car and tuktuk
			Vehicles tukTukVehicle = new TukTukAnalysis();
			Vehicles carsVehicle = new CarAnalysis(tukTukVehicle.speedCalculateForOrbits());

		} else {
			System.out.println();
		}
	}

}
