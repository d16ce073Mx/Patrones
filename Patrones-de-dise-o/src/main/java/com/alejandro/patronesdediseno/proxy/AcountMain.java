package com.alejandro.patronesdediseno.proxy;

public class AcountMain {

	public static void main(String[] args) {
		
		Acount acount = new Acount(1, "Alejandro", 100000000);
		IAcount acountProxy = new AcountProxy();
		
		acountProxy.showAcount(acount);
		acountProxy.putMoney(acount, 100000);
		acountProxy.getMoney(acount, 70000);
		acountProxy.showAcount(acount);
	}
}
