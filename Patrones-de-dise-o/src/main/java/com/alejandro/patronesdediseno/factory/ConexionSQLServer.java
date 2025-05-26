package com.alejandro.patronesdediseno.factory;

public class ConexionSQLServer  implements IConexion{
	
	String host;
	String puerto;
	String usuario;
	String password;
	
	public ConexionSQLServer(String host, String puerto, String usuario, String password) {
		super();
		this.host = host;
		this.puerto = puerto;
		this.usuario = usuario;
		this.password = password;
	}
	
	public ConexionSQLServer() {}

	public void conectar() {
		System.out.println("Se conecto a SQLServer");	
	}

	public void desconectar() {
		System.out.println("Se deconcto de SQLServer");	
	}

}
