package com.ejemplo.dao;

import java.sql.*;

public class Conexion {
	  Connection conn = null;
	  ResultSet rset = null;
	  Statement stmt = null;
	public void ObtenenerConexion() {
		
	
		try
		{
			//registro el driver, en realidad, hago que se ejecuten unas pocas líneas de la clase OracleDriver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());// método equivalente al anterior
			//Sea como sea, es, <<oye, si te piden una conexión, se la pides a esa clase!>>
			conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "negralejo3536");
  	        stmt = conn.createStatement();
		}
  	     catch(Exception e)
			{
				e.printStackTrace();
			}
	     }

	public void LiberarRecursos() {
		if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		try { stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }
		try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }
	}
}
