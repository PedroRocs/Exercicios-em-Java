package exerciciosManzano;

import java.util.Scanner;

public class Ex5_2_i {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maiorNumero = 0, menorNumero = 0, numeroAtual = 0;

		do  {
			System.out.println("Digite um número: ");
			numeroAtual = sc.nextInt();

			if (numeroAtual > maiorNumero) {
				maiorNumero = numeroAtual;
			}

			if (numeroAtual < menorNumero) {
				menorNumero = numeroAtual;
			}
		} while (numeroAtual >= 0);

		System.out.printf("O maior número digitado foi %d; \n O menor foi %d", maiorNumero, menorNumero);

		sc.close();
	}

}
