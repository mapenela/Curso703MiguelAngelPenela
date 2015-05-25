package ejercicios.repaso;

public class ParoImpar {

	public static void main(String[] args) {
	ParoImpar esparoimpar = new ParoImpar();
	if (esparoimpar.calcularParidad(11, 2))
	{
		System.out.println("El número es par");
	} else
		{
		System.out.println ("El número es impar");
		}
	}
	static boolean calcularParidad(int dividendo,int divisor) {
		boolean paridad = false;
		int resto = dividendo % divisor;
		if (resto==0) {
		   paridad=true;
		} else {
		   paridad=false;
		}
		return paridad;
}
}
