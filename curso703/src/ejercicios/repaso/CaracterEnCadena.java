package ejercicios.repaso;

public class CaracterEnCadena {

	
	public static void main(String[] args) {
		/*int i;
		char caracter = 'm';
		String micadena = "esta es mi cadena";
		for (int x=0;x<micadena.length();x++){
			//System.out.println(micadena.charAt(x));
			if (micadena.charAt(x) == caracter ){
				System.out.println("he encontrado el caracter " + caracter + " en la posicion " + (x+1));
				break;
			}
		}
		
		for (int j = 0; j < args.length; j++) {
			System.out.println(args[j]);
		}
		
		*/
		CaracterEnCadena caracterencadena = new CaracterEnCadena();
		if (caracterencadena.estaCaracterEncadena('a', "Juna"))
		{
			System.out.println("El caracter está");
		} else
			{
			System.out.println ("No está");
			}
        		
		if (CaracterEnCadena.estaCaracterEncadenaStatic('a', "Juna"))
		{
			System.out.println("El caracter está");
		} else
			{
			System.out.println ("No está");
			}

        int cuantos=caracterencadena.numerocaracteresencadena('m',"Miguel Angel Penela y muchas mmm mas");
        System.out.println("hay en la cadena "+cuantos+" repeticiones de m");
	} 
	/**
	 * Este método te dice si se encuentra un caracter en una cadena.
	 * @param c
	 * @param cadena
	 * @return un boolean indicando si c está en cadena;
	 */
	boolean estaCaracterEncadena(char c,String cadena) {
		boolean encontrado = false;
		
		int posicion = 0;
		int longitud = cadena.length();
		
		while ((!encontrado)&&(posicion<longitud))
		{
			encontrado = (cadena.charAt(posicion) == c);
			posicion++;
		}
		
		
		return encontrado;
	}
	
	static boolean estaCaracterEncadenaStatic(char c,String cadena) {
		boolean encontrado = false;
		
		int posicion = 0;
		int longitud = cadena.length();
		
		while ((!encontrado)&&(posicion<longitud))
		{
			encontrado = (cadena.charAt(posicion) == c);
			posicion++;
		}
		
		
		return encontrado;
	}
	
   static int numerocaracteresencadena(char c,String cadena) {
	   int cuantosencontrados=0;
	   for (int x=0;x<cadena.length();x++){
		   if (cadena.charAt(x) == c ){
			   cuantosencontrados++;
		   }
	   }
	   return cuantosencontrados;
   }
}
