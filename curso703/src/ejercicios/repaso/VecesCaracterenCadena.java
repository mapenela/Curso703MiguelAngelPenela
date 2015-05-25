package ejercicios.repaso;

public class VecesCaracterenCadena {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		char caracter = 'm';
		String micadena = "esta es mi cadena";
		for (int x=0;x<micadena.length();x++){
			//System.out.println(micadena.charAt(x));
			if (micadena.charAt(x) == caracter ){
				System.out.println("he encontrado el caracter " + caracter + " en la posicion " + (x+1));
				break;
			}
		}
	}

}
