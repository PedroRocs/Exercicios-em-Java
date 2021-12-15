package exerciciosManzano;

import java.util.Scanner;

public class Ex7_f {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;

		System.out.println("Digite o valor de A: ");
		a = sc.nextInt();

		System.out.println("Digite o valor de B: ");
		b = sc.nextInt();

		a = a - b;
		b = b + a;
		a = b - a;

		System.out.printf("O valor de A se tornou %d e o valor de B se tornou %d.", a, b);

		sc.close();
	}
}
