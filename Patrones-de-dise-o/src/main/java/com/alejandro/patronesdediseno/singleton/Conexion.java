package com.alejandro.patronesdediseno.singleton;

public class Conexion {
	
	private static Conexion instancia;
	
	private Conexion() {}
	
	public static Conexion getInstancia() {
		if(instancia == null) {
			instancia =   new Conexion();
		}
		
		return instancia;
	}
	
	public void conectar() {
		System.out.println("Conectando a BD");
	}
	
	public void desconectar() {
		System.out.println("Desconectando de lBD");
	}

}
