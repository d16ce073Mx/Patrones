package com.alejandro.patronesdediseno.proxy;

public class AcountProxy implements IAcount{

	private AcountImpl realAcount;
	@Override
	public Acount getMoney(Acount acount, double quantity) {
		if(realAcount == null) {
			realAcount = new AcountImpl();
			return realAcount.getMoney(acount, quantity);
		}else {
			return realAcount.getMoney(acount, quantity);
		}
	}

	@Override
	public Acount putMoney(Acount acount, double quantity) {
		if(realAcount == null) {
			realAcount = new AcountImpl();
			return realAcount.putMoney(acount, quantity);
		}else {
			return realAcount.putMoney(acount, quantity);
		}
	}

	@Override
	public void showAcount(Acount acount) {
		if(realAcount == null) {
			realAcount = new AcountImpl();
			 realAcount.showAcount(acount);
		}else {
			 realAcount.showAcount(acount);
		}
	}
}
