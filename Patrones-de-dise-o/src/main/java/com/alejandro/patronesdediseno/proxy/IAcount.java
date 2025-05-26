package com.alejandro.patronesdediseno.proxy;

public interface IAcount {
	
	Acount getMoney(Acount acount, double quantity);
	Acount putMoney(Acount acount, double quantity);
	void showAcount(Acount acount);
}
