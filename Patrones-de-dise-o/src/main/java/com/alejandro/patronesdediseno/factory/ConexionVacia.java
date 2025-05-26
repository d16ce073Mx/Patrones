package com.alejandro.patronesdediseno.factory;

public class ConexionVacia  implements IConexion{

	public void conectar() {
		System.out.println("No se especifico BD");
		
	}

	public void desconectar() {
		System.out.println("No se especifico BD");
		
	}

}
