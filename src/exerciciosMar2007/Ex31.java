package exerciciosMar2007;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		float a, b, c;
		
		System.out.println("digite o valor do primeiro lado do tri�ngulo: ");
		a = sc.nextFloat();
		
		System.out.println("digite o valor do segundo lado do tri�ngulo: ");
		b = sc.nextFloat();
		
		System.out.println("digite o valor do terceiro lado do tri�ngulo: ");
		c = sc.nextFloat();

		if (a < b + c && b < c + a && c < a + b) {
			System.out.println("Essas lados podem formar um tri�ngulo.");
		} else {
			System.out.println("Esses lados n�o podem formar um tri�ngulo.");
		}
		
		sc.close();
	}

}
