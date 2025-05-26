package com.alejandro.patronesdediseno.decorator;

public class AcountBasic implements IAccountBank{

	public void openAcount(final AccountModel account) {
		System.out.println("New acount " + account.getClient());
	}
	
}
