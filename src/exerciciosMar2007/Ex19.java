package exerciciosMar2007;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		float valor1, valor2;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = sc.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = sc.nextFloat();

		if (valor1 > valor2) {
			System.out.printf("%.1f", valor1);
		} else {
			System.out.printf("%.1f", valor2);
		}
		
		sc.close();
	}

}
