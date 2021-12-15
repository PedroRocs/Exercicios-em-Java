package exerciciosManzano;

public class Ex5_2_c {

	public static void main(String[] args) {
		
		int contador = 1;
		
		do {
			if (contador % 4 == 0) {
				System.out.println(contador + " é divisível por 4;");
			}
			contador ++;
		} while (contador < 200);
	}

}
