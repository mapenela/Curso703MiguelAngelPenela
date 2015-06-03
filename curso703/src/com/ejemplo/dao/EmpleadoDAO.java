package com.ejemplo.dao;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.*;
import com.ejemplo.dao.Conexion;
import com.ejemplo.dao.InstruccionesSQL;
public class EmpleadoDAO {
	ResultSet rset = null;
	Statement stmt = null;
	String sentencia=null;
	public void RecuperarTodos() {
		// se instancia la nueva conexion a la base de datos
	        ArrayList<EmpleadoDAO> listaempleado=null;
	   		Conexion nueva_conexion = new Conexion();
			nueva_conexion.ObtenenerConexion();
		    InstruccionesSQL sentencia = new InstruccionesSQL();
			//rset = stmt.executeQuery(sentencia.sentencia_sql);
			//rset =nueva_conexion.executeQuery(sentencia.sentencia_sql);
			
                    					
	}
}
