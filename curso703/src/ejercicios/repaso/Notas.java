package ejercicios.repaso;

public class Notas {
	public enum TipoNota {SUSPENSO, APROBADO, BIEN, NOTABLE, SOBRESALIENTE};	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota = 9;
		TipoNota devuelvo;
		devuelvo = TipoNota.SUSPENSO;
		switch (nota) {
		case 10:
		case 9: devuelvo = TipoNota.SOBRESALIENTE;
			break;

		case 8:
		case 7: devuelvo = TipoNota.NOTABLE;
			break;
		case 6: devuelvo = TipoNota.BIEN;
			break;
		case 5: devuelvo = TipoNota.APROBADO;
			break;
		case 4: 
		case 3:
		case 2:
		case 1:
		case 0: devuelvo = TipoNota.SUSPENSO;
			break;
		}
		System.out.println("nota : " + devuelvo);
}
}