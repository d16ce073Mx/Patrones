package com.alejandro.patronesdediseno.proxy;

public class Acount {
	
	private int idAcount;
	private String user;
	private double moneyStart;
	
	public Acount(int idAcount, String user, double moneyStart) {
		super();
		this.idAcount = idAcount;
		this.user = user;
		this.moneyStart = moneyStart;
	}
	public int getIdAcount() {
		return idAcount;
	}
	public void setIdAcount(int idAcount) {
		this.idAcount = idAcount;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public double getMoneyStart() {
		return moneyStart;
	}
	public void setMoneyStart(double moneyStart) {
		this.moneyStart = moneyStart;
	} 
}
