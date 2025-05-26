package com.alejandro.patronesdediseno.factory;

public class ConexionFactory {
	
	public IConexion getConection(final String provedor) {
		
		if(provedor.equals("") || provedor == null) {
			return new ConexionVacia();
		}else if(provedor.equalsIgnoreCase("oracle")){
			return new ConexionOracle();
		}else if(provedor.equalsIgnoreCase("posgresql")){
			return new ConexionPosgreSQL();
		}else if(provedor.equalsIgnoreCase("SQLServer")){
			return new ConexionSQLServer();
		}else {
			return new ConexionVacia();
		}
		
	}

}
