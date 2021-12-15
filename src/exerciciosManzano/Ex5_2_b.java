package exerciciosManzano;

public class Ex5_2_b {

	public static void main(String[] args) {
	
		int contador = 2, soma = 0;

		do {
			soma += contador;
			contador += 2;
		} while (contador < 501);

		System.out.printf("A soma dos valores pares inteiros entre 1 e 500 é %d", soma);
	}

}
