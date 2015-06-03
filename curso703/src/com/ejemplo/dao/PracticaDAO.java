package com.ejemplo.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import com.ejemplo.dao.Conexion;


public class PracticaDAO {

	public static void main(String[] args) throws Exception {
						
			
			ArrayList<EmpleadoDTO> listaempleado=null;
			// se instancia la nueva conexion a la base de datos
			Conexion nueva_conexion = new Conexion();
			nueva_conexion.ObtenenerConexion();
			
			//ahora instancio la instruccion de sql para seleccionar base de datos
		
				rset = stmt.executeQuery("select * FROM EMPLOYEES where salary > 3000");
				listaempleado = new ArrayList<EmpleadoDTO>();
				while (rset.next()){
				         //System.out.println (rset.getString(1));
					
					
				    EmpleadoDTO empleado = new EmpleadoDTO(rset.getInt(1),rset.getString(2),rset.getString(3),rset.getString(4),rset.getString(5),rset.getString(6),rset.getString(7),rset.getInt(8),rset.getInt(9),rset.getInt(10),rset.getInt(11));
				    
				    listaempleado.add(empleado);
				}
				
				for (EmpleadoDTO empleado_encurso: listaempleado)
				{
					System.out.println(empleado_encurso.toString());
				}
			        //// se liberan las conexiones
				    nueva_conexion.LiberarRecursos();	
			}
	        
		}

	
