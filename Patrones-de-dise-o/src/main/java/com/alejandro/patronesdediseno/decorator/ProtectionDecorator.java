package com.alejandro.patronesdediseno.decorator;

public class ProtectionDecorator extends AccountDecorator{
	
	public ProtectionDecorator(IAccountBank account) {
		super(account);
	}
	
	public void addProtection(final AccountModel c) {
		System.out.println("added protection a " + c.getClient());
	}
	
	public void openAcount(final AccountModel c) {
		account.openAcount(c);
		addProtection(c);
	}

}
