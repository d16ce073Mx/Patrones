package com.alejandro.patronesdediseno.decorator;

public abstract class AccountDecorator implements IAccountBank{
	 
	protected IAccountBank account;

	public AccountDecorator(IAccountBank account) {
		this.account = account;
	}
	
	public void openAcount(final AccountModel account) {
		this.account.openAcount(account);
	}
	
}
