package com.alejandro.patronesdediseno.facade;

//Simulate a hotel reservation api
public class HotelAPI {
	
	public void searchHotel(String dateGo, String dateBack, String place, Double price) {
		System.out.println("*********************");
		System.out.println("hotels found in " + place + " between " + dateGo + "-" + dateBack
				+ " with price of " + price);
		System.out.println("*********************");
	}

}
