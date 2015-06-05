package evaluacion.primera;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

public class RegionDAO {
	
	private static Logger log = Logger.getLogger("mylog");
	
	private static RegionDTO componerObjeto (ResultSet rs) throws SQLException
	{
		RegionDTO region = null;
		
		int region_Id = rs.getInt(1);
		String region_Name = rs.getString(2);
		
		
		region = new RegionDTO(region_Id, region_Name);
		
		return region;
	}
	
	public static List<RegionDTO> obtenerTodos () throws SQLException
	{
		List<RegionDTO> lista_regiones = null;
		Connection conexion = null;
		Statement stmt = null;
		ResultSet rs = null;
		RegionDTO regionDTO = null;
		
		
		try {
		
		conexion = Conexion.obtenerConexion();
		stmt = conexion.createStatement();
		rs = stmt.executeQuery(InstruccionesSQL.CONSULTAR_TODOS);
		lista_regiones = new ArrayList<RegionDTO>();
		while (rs.next())
		{
			regionDTO = componerObjeto(rs);
			lista_regiones.add(regionDTO);
		}
		} catch (SQLException e) {
			e.printStackTrace();
			log.error("Error al recuperar la base de datos");
			lista_regiones = null;
			throw e;
		}
		finally{
			Conexion.liberarRecursos(conexion, stmt, rs);
		}
		
		return lista_regiones;
		
	}
	public static List<RegionDTO> ConsultaRegion () throws SQLException
	{		
		List<RegionDTO> lista_regiones = null;
		Connection conexion = null;
		Statement stmt = null;
		ResultSet rs = null;
		RegionDTO regionDTO = null;
		
		
		try {
		
		conexion = Conexion.obtenerConexion();
		stmt = conexion.createStatement();
		rs = stmt.executeQuery(InstruccionesSQL.CONSULTAR_UNO);
		lista_regiones = new ArrayList<RegionDTO>();
		while (rs.next())
		{
			regionDTO = componerObjeto(rs);
			lista_regiones.add(regionDTO);
		}
		} catch (SQLException e) {
			e.printStackTrace();
			log.error("Error al recuperar la base de datos");
			lista_regiones = null;
			throw e;
		}
		finally{
			Conexion.liberarRecursos(conexion, stmt, rs);
		}
		
		return lista_regiones;
		
	}
	public static List<RegionDTO> InsertarRegion () throws SQLException
	{		
		List<RegionDTO> lista_regiones = null;
		Connection conexion = null;
		Statement stmt = null;
		ResultSet rs = null;
		RegionDTO regionDTO = null;
		
		
		try {
		
		conexion = Conexion.obtenerConexion();
		stmt = conexion.createStatement();
		rs = stmt.executeQuery(InstruccionesSQL.INSERTAR_UNO);
		rs = stmt.executeQuery(InstruccionesSQL.CONSULTAR_TODOS);
		lista_regiones = new ArrayList<RegionDTO>();
		while (rs.next())
		{
			regionDTO = componerObjeto(rs);
			lista_regiones.add(regionDTO);
		}
		} catch (SQLException e) {
			e.printStackTrace();
			log.error("Error al recuperar la base de datos");
			lista_regiones = null;
			throw e;
		}
		finally{
			Conexion.liberarRecursos(conexion, stmt, rs);
		}
		
		return lista_regiones;
		
	}
}