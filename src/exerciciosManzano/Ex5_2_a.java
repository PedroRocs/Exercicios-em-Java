package exerciciosManzano;

public class Ex5_2_a {

	public static void main(String[] args) {

		int contador = 15;
		
		do {
			System.out.printf("%d ^ 2 = %.0f \n", contador, Math.pow(contador, 2));
			
			contador ++;
		} while ( contador < 200);
	}

}
