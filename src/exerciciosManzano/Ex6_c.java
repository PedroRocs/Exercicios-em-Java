package exerciciosManzano;

public class Ex6_c {

	public static void main(String[] args) {
		
		int total = 0;
		
		for (int contador = 1; contador <= 100; contador ++) {
			total += contador;
		}
		
		System.out.printf("A soma de todos os n�meros inteiros de 1 a 100 � %d", total);
	}

}
