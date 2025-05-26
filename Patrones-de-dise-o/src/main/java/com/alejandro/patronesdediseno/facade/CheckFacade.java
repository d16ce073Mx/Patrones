package com.alejandro.patronesdediseno.facade;

//This class simulates an intermediary that consumes rest services of hotel and flight APIs

public class CheckFacade {
	
	private FlightAPI flightAPI;
	private HotelAPI hotelAPI;
	
	public CheckFacade() {
		flightAPI = new FlightAPI();
		hotelAPI =  new HotelAPI();
	}
	
	public void search(String dateGo, String dateBack, String place, Double price, String origin, String destiny) {
		flightAPI.searchFlight(dateGo, dateBack, origin, destiny);
		hotelAPI.searchHotel(dateGo, dateBack, place, price);
	}

}
