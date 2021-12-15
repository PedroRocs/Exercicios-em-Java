package exerciciosManzano;

public class Ex6_k {

	public static void main(String[] args) {

		int fatorial, total;

		for (int contador = 1; contador < 9; contador += 2) {
			fatorial = contador - 1;
			total = contador;

			while (fatorial > 1) {
				total = total * fatorial;
				fatorial--;
			}

			System.out.println(total);
		}
	}
}
