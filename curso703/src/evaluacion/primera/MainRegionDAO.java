package evaluacion.primera;

import java.sql.SQLException;
import java.util.List;

import evaluacion.primera.RegionDAO;
import evaluacion.primera.RegionDTO;

public class MainRegionDAO {

	
	public static void main(String[] args) {
		try {
			  //******************************
			 // obtener todas las regiones ***
			 //*******************************
			List<RegionDTO> lista_regiones = RegionDAO.obtenerTodos();
			System.out.println(lista_regiones);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al recuperar la lista de regiones de la base de datos");
			
		}
		try {
			 //************************
			 // obtener una region ****
			//*************************
			List<RegionDTO> lista_region = RegionDAO.ConsultaRegion(1);
			System.out.println(lista_region);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al recuperar la lista de regiones de la base de datos");
			
		}
		try {
			  //*************************
			 // insertar una region *****
			//***************************
			List<RegionDTO> lista_regiones = RegionDAO.InsertarRegion(5,"Africa");
			System.out.println(lista_regiones);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al recuperar la lista de regiones de la base de datos");
			
		}
	}
	

}