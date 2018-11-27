package com.geektrust.zomato.Traffic;

import com.geektrust.zomato.Traffic.orbit.dto.OrbitOneDTO;
import com.geektrust.zomato.Traffic.orbit.dto.OrbitTwoDTO;
import com.geektrust.zomato.Traffic.orbitService.OrbitOneService;
import com.geektrust.zomato.Traffic.orbitService.OrbitTwoService;
import com.geektrust.zomato.Traffic.vehicles.dto.Bike;
import com.geektrust.zomato.Traffic.vehicles.dto.SuperCar;
import com.geektrust.zomato.Traffic.vehicles.dto.TukTuk;
import com.geektrust.zomato.Traffic.vehiclesservice.BikeAnalysis;
import com.geektrust.zomato.Traffic.vehiclesservice.CarAnalysis;
import com.geektrust.zomato.Traffic.vehiclesservice.TukTukAnalysis;
import com.geektrust.zomato.Traffic.vehiclesservice.Vehicles;

public class LengaburuTrafficAnalysis {

	public static void VehicleAnalysis(String weatherCondition) throws CloneNotSupportedException {

		int orbitOneMaxSpeed = OrbitOneService.getInstanceOfOrbit().getOrbitSpeed();
		int orbitTwoMaxSpeed = OrbitTwoService.getInstanceOfOrbit().getOrbitSpeed();

		int OrbitOneCartes = OrbitOneDTO.numberOfCarters;
		int OrbitTwoCartes = OrbitTwoDTO.numberOfCarters;

		String resultOfOrbit = getResult(weatherCondition, orbitOneMaxSpeed, orbitTwoMaxSpeed, OrbitOneCartes,
				OrbitTwoCartes);

	}

	private static String getResult(String weatherCondition, int orbitOneMaxSpeed, int orbitTwoMaxSpeed,
			int orbitOneCartes, int orbitTwoCartes) {
		if (weatherCondition.equalsIgnoreCase(WeatherConditions.SUNNY.toString())) {
			// bike,tuktuk,car
			System.out.println("Sunny waether");
			Vehicles bikeVehicle = new BikeAnalysis();
			bikeVehicle.getCalcuateSpeedForOrbit(Bike.bikeSpeed, Bike.bikeCarterTime).orbitSpeedTime(orbitOneMaxSpeed,
					orbitTwoMaxSpeed, orbitOneCartes, orbitTwoCartes);

			Vehicles tukTukVehicle = new TukTukAnalysis();
			tukTukVehicle.getCalcuateSpeedForOrbit(TukTuk.tukTukSpeed, TukTuk.tukTukCarterTime)
					.orbitSpeedTime(orbitOneMaxSpeed, orbitTwoMaxSpeed, orbitOneCartes, orbitTwoCartes);

			Vehicles carsVehicle = new CarAnalysis();
			carsVehicle.getCalcuateSpeedForOrbit(SuperCar.superCarSpeed, SuperCar.superCarCarterTime)
					.orbitSpeedTime(orbitOneMaxSpeed, orbitTwoMaxSpeed, orbitOneCartes, orbitTwoCartes);

		} else if (weatherCondition.equalsIgnoreCase(WeatherConditions.WINDY.toString())) {
			// car and bike
			Vehicles bikeVehicle = new BikeAnalysis();
			bikeVehicle.getCalcuateSpeedForOrbit(Bike.bikeSpeed, Bike.bikeCarterTime).orbitSpeedTime(orbitOneMaxSpeed,
					orbitTwoMaxSpeed, orbitOneCartes, orbitTwoCartes);

			Vehicles carsVehicle = new CarAnalysis();
			carsVehicle.getCalcuateSpeedForOrbit(SuperCar.superCarSpeed, SuperCar.superCarCarterTime)
					.orbitSpeedTime(orbitOneMaxSpeed, orbitTwoMaxSpeed, orbitOneCartes, orbitTwoCartes);

		} else if (weatherCondition.equalsIgnoreCase(WeatherConditions.RAINY.toString())) {
			// car and tuktuk
			Vehicles tukTukVehicle = new TukTukAnalysis();
			tukTukVehicle.getCalcuateSpeedForOrbit(TukTuk.tukTukSpeed, TukTuk.tukTukCarterTime)
					.orbitSpeedTime(orbitOneMaxSpeed, orbitTwoMaxSpeed, orbitOneCartes, orbitTwoCartes);

			Vehicles carsVehicle = new CarAnalysis();
			carsVehicle.getCalcuateSpeedForOrbit(SuperCar.superCarSpeed, SuperCar.superCarCarterTime)
					.orbitSpeedTime(orbitOneMaxSpeed, orbitTwoMaxSpeed, orbitOneCartes, orbitTwoCartes);

		} else {
			System.out.println();
		}
		return null;
	}

}
