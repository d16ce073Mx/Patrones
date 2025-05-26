package com.alejandro.patronesdediseno.decorator;

public class AcountSave implements IAccountBank{
	
	public void openAcount(final AccountModel acount) {
		System.out.println("New acount " + acount.getClient());
	}

}
