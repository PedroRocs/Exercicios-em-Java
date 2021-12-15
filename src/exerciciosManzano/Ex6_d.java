package exerciciosManzano;

public class Ex6_d {

	public static void main(String[] args) {
		
		int contador, soma = 0;

		for (contador = 2; contador < 501; contador += 2) {
			soma += contador;
		}

		System.out.printf("A soma dos valores pares inteiros entre 1 e 500 é %d", soma);
	}

}
