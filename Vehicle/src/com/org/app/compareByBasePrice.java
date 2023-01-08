package com.org.app;

import java.util.Comparator;

public class compareByBasePrice implements Comparator<Vehicle>{

	@Override
	public int compare(Vehicle v1, Vehicle v2) {	
		
		return Double.valueOf(v1.getBaseprice()).compareTo(v2.getBaseprice());
	}
	
	

}
