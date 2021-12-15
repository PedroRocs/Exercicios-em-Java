package exerciciosMar2007;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		float a, b, c;
		
		System.out.println("digite o valor do primeiro lado do triângulo: ");
		a = sc.nextFloat();
		
		System.out.println("digite o valor do segundo lado do triângulo: ");
		b = sc.nextFloat();
		
		System.out.println("digite o valor do terceiro lado do triângulo: ");
		c = sc.nextFloat();

		if (a < b + c && b < c + a && c < a + b) {
			System.out.println("Essas lados podem formar um triângulo.");
		} else {
			System.out.println("Esses lados não podem formar um triângulo.");
		}
		
		sc.close();
	}

}
