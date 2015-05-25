package ejercicios.repaso;

public class MayorEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MayorEdad esmayor = new MayorEdad();
		if (esmayor.esmayordedad(17)){
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("Es menor de edad");
		}
	}
    static boolean esmayordedad(int edad){
    	boolean mayor = false;
    	if (edad >= 18) {
    		mayor=true;
    	} else {
    		mayor=false;
    	}
    	return mayor;
    }
}
