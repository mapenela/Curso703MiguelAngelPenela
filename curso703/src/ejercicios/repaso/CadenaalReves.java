package ejercicios.repaso;

public class CadenaalReves {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	CaracterEnCadena caracterencadena = new CaracterEnCadena();	
    String cadena = "La cadena a convertir al revés";
    String cadenaconvertida = "";
    int longitud = (cadena.length())-1;
    for (int j=0;j<longitud;j++) {
    	
  	  cadenaconvertida+=cadena.charAt(longitud-j); 
  		  
  	  
    } 
    System.out.println("cadena al reves : " + cadenaconvertida);
}
}
