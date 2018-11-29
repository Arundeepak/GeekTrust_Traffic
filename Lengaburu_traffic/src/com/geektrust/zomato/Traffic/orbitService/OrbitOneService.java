package com.geektrust.zomato.Traffic.orbitService;

import java.io.Serializable;

import com.geektrust.zomato.Traffic.orbit.dto.OrbitOneDTO;

public class OrbitOneService implements Paths, Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9101050059976321554L;
	public static OrbitOneService orbitOneService = null;

	private OrbitOneService() {

	}

	public static OrbitOneService getInstanceOfOrbit() throws CloneNotSupportedException {
		if (orbitOneService == null) {
			return new OrbitOneService();
		} else {
			return orbitOneService;
		}
	}

}
