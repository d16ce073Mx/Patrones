package com.alejandro.patronesdediseno.factory;

public class ConexionPosgreSQL implements IConexion{
	
	String host;
	String puerto;
	String usuario;
	String password;
	
	public ConexionPosgreSQL(String host, String puerto, String usuario, String password) {
		super();
		this.host = host;
		this.puerto = puerto;
		this.usuario = usuario;
		this.password = password;
	}
	
	public ConexionPosgreSQL() {}
	
	public void conectar() {
		System.out.println("Se conecto a PosgreSQL");	
	}

	public void desconectar() {
		System.out.println("Se deconcto de PosgreSQL");	
	}
	

}
