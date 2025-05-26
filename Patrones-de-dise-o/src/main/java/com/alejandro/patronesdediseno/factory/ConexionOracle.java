package com.alejandro.patronesdediseno.factory;

public class ConexionOracle implements IConexion{
	
	String host;
	String puerto;
	String usuario;
	String password;
	
	public ConexionOracle(String host, String puerto, String usuario, String password) {
		super();
		this.host = host;
		this.puerto = puerto;
		this.usuario = usuario;
		this.password = password;
	}
	
	public ConexionOracle() {}

	public void conectar() {
		System.out.println("Se conecto a Oracle");	
	}

	public void desconectar() {
		System.out.println("Se deconcto de Oracle");	
	}
	
	

}
