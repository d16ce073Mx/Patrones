package com.alejandro.patronesdediseno.dependencyinjection;

public class Driver {
	
	private IBrand brand;
	
	public Driver(IBrand brand) {
		this.brand = brand;
	}

	public void showBrand() {
		brand.showBrandName();
	}
}
