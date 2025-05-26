package com.alejandro.patronesdediseno.factory;

public class FactoryMain {

	public static void main(String[] args) {
		
		ConexionFactory cf = new ConexionFactory();
		
		IConexion conexionUno = cf.getConection("posgresql");
		conexionUno.conectar();
		conexionUno.desconectar();
		
		IConexion conexionDos = cf.getConection("oracle");
		conexionDos.conectar();
		conexionDos.desconectar();
		
		IConexion conexionTres = cf.getConection("sqlserver");
		conexionTres.conectar();
		conexionTres.desconectar();
		
		IConexion conexionCuatro = cf.getConection("");
		conexionCuatro.conectar();
		conexionCuatro.desconectar();

	}

}
