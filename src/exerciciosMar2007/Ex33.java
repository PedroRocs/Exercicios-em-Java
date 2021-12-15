package exerciciosMar2007;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		b = sc.nextInt();
		
		if (a > b) {
			System.out.println("O primeiro valor é maior.");
		} else if (b > a) {
			System.out.println("O segundo valor é maior.");
		} else {
			System.out.println("Os valores digitados são iguais.");
		}
		
		sc.close();
	}

}
