package com.alejandro.patronesdediseno.decorator;

public class Main {

	public static void main(String[] args) {
		
		AccountModel c = new AccountModel(1, "Alejandro");
		
		IAccountBank account = new AcountSave();
		IAccountBank protectionAcount = new ProtectionDecorator(account);
		
		protectionAcount.openAcount(c);
		
	}

}
