package com.alejandro.patronesdediseno.dependencyinjection;

public class Seat implements IBrand {

	@Override
	public void showBrandName() {
		System.out.println("Seat");
	}
}
