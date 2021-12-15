package exerciciosManzano;

import java.util.Scanner;

public class Ex6_b {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero, contador;

		System.out.println("Digite um número");
		numero = sc.nextInt();

		for (contador = 1; contador < 11; contador++) {
			System.out.printf("%d x %d = %d \n", numero, contador, numero * contador);
		}
	
		sc.close();
	}

}
