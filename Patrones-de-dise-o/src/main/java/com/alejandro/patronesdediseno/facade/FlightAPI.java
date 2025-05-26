package com.alejandro.patronesdediseno.facade;

//Simulate a flight reservation api
public class FlightAPI {
	
	public void searchFlight(String dateGo, String dateBack, String origin, String destiny) {
		System.out.println("*********************");
		System.out.println("flights found from"  + origin + " to " + destiny + " in "+ dateGo + dateBack );
		System.out.println("*********************");
	}
	
}
