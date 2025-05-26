package com.alejandro.patronesdediseno.dependencyinjection;

public class BMW implements IBrand{

	@Override
	public void showBrandName() {
		System.out.println("BMW");
	}
}
