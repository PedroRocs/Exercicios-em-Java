package exerciciosManzano;

import java.util.Scanner;

public class Ex3_a {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.println("Digite o valor de a: ");
		a = sc.nextInt();

		System.out.println("Digite o valor de b: ");
		b = sc.nextInt();

		System.out.println("Digite o valor de c: ");
		c = sc.nextInt();

		System.out.println("Digite o valor de d: ");
		d = sc.nextInt();
		
		System.out.printf("O produto de a com c é %d", a * c);
		System.out.printf("A soma de b com d é %d", b * d);

		sc.close();
	}

}
