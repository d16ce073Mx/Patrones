package com.alejandro.patronesdediseno.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		Conexion conexion = Conexion.getInstancia();
		
		conexion.conectar();
		conexion.desconectar();
		
		

	}

}
