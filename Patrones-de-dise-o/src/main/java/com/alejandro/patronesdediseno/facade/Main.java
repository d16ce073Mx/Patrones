package com.alejandro.patronesdediseno.facade;

public class Main {

	public static void main(String[] args) {
		
		CheckFacade client1 =  new CheckFacade();
		CheckFacade client2 =  new CheckFacade();
		
		client1.search("25/08/2019", "05/09/2019", "Iscaret", 15000.00, "CDMX", "Cncun");
		client2.search("25/08/2019", "05/09/2019", "Cabos", 15000.00, "CDMX", "Baja California");

	}

}
