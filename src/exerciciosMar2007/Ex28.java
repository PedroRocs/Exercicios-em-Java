package exerciciosMar2007;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, valor3;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = sc.nextInt();

		System.out.println("Digite o segundo valor: ");
		valor2 = sc.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		valor3 = sc.nextInt();
		
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("O maior valor digitad foi " + valor1);
		} else if (valor2 > valor3) {
			System.out.println("O maior valor digitad foi " + valor2);
		} else {
			System.out.println("O maior valor digitad foi " + valor3);
		}
		
		sc.close();
	}

}
