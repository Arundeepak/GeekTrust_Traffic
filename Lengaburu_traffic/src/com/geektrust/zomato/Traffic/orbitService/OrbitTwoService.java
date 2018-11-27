package com.geektrust.zomato.Traffic.orbitService;

import java.io.Serializable;

import com.geektrust.zomato.Traffic.orbit.dto.OrbitTwoDTO;

public class OrbitTwoService implements Paths, Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1648258994686232331L;
	public static OrbitTwoService orbitTwoService = null;

	private OrbitTwoService() {

	}

	public static OrbitTwoService getInstanceOfOrbit() throws CloneNotSupportedException {
		if (orbitTwoService == null) {
			return new OrbitTwoService();
		} else {
			return orbitTwoService;
		}
	}

	public int getOrbitSpeed() {
		// TODO Auto-generated method stub
		return new OrbitTwoDTO().getOrbitsSpeed();
	}
}
