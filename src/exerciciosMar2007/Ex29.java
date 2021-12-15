package exerciciosMar2007;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor1, valor2, valor3, resultado;

		System.out.println("Digite o primeiro valor: ");
		valor1 = sc.nextInt();

		System.out.println("Digite o segundo valor: ");
		valor2 = sc.nextInt();

		System.out.println("Digite o terceiro valor: ");
		valor3 = sc.nextInt();

		resultado = 0;
		
		if (valor1 > valor2 || valor1 > valor3) {
			resultado += valor1;
			
			if (valor2 > valor3) {
				resultado += valor2;
			} else {
				resultado += valor3;
			}
		} else {
			resultado = valor2 + valor3;
		}
		
		System.out.println("A soma dos dois maiores valores é " + resultado);
		
		sc.close();
	}
}
