package com.alejandro.patronesdediseno.dependencyinjection;
/*
 *  Inyection of dependencies in contructor
 */

public class App {

	public static void main(String[] args) {
		
		Driver driverReach = new Driver(new BMW());
		driverReach.showBrand();
		
		Driver driverBasic= new Driver(new Seat());
		driverBasic.showBrand();
		
		Driver driverExotic = new Driver(new Lamborghini());
		driverExotic.showBrand();

	}
}
