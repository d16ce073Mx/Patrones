package com.alejandro.patronesdediseno.proxy;

public class AcountImpl implements IAcount{

	@Override
	public Acount getMoney(Acount acount, double quantity) {
		double moneyCurrent = acount.getMoneyStart() - quantity;
		acount.setMoneyStart(moneyCurrent);
		System.out.println("Current money: " + moneyCurrent);
		return acount;
	}

	@Override
	public Acount putMoney(Acount acount, double quantity) {
		double moneyCurrent = acount.getMoneyStart() + quantity;
		acount.setMoneyStart(moneyCurrent);
		System.out.println("Current money: " + moneyCurrent);
		return acount;
	}

	@Override
	public void showAcount(Acount acount) {
		System.out.println("Current money: +" + acount.getMoneyStart());
		
	}
}
