package exerciciosManzano;

import java.util.Scanner;

public class Ex5_1_l {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int maiorNumero = 0, menorNumero = 0, numeroAtual = 0;

		while (numeroAtual >= 0) {
			System.out.println("Digite um n?mero: ");
			numeroAtual = sc.nextInt();

			if (numeroAtual > maiorNumero) {
				maiorNumero = numeroAtual;
			}

			if (numeroAtual < menorNumero) {
				menorNumero = numeroAtual;
			}
		}

		System.out.printf("O maior n?mero digitado foi %d; \n O menor foi %d", maiorNumero, menorNumero);

		sc.close();
	}
}
