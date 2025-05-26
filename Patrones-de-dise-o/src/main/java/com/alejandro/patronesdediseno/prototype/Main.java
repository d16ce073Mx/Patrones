package com.alejandro.patronesdediseno.prototype;

public class Main {

	public static void main(String[] args) {
		
		//Instancia de la cuenta
		CuentaAhorroImpl cuentaAhorroImpl = new CuentaAhorroImpl();
		cuentaAhorroImpl.setMonto(500000.00f);
		
		//Cuenta Clonada
		CuentaAhorroImpl cuentaAhorroImplClon = new CuentaAhorroImpl();
		cuentaAhorroImplClon = (CuentaAhorroImpl) cuentaAhorroImpl.clonar();
		
		System.out.println("Cuenta original => " + cuentaAhorroImpl.toString()  
										+ " \n Cuenta clonada => " + cuentaAhorroImplClon.toString());
		

	}

}
