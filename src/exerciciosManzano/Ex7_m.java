package exerciciosManzano;

import java.util.Scanner;

public class Ex7_m {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a, b, c, resultado;
		
		System.out.println("Digite o valor de A: ");
		a = sc.nextFloat();
		
		System.out.println("Digite o valor de B: ");
		b = sc.nextFloat();
		
		System.out.println("Digite o valor de C: ");
		c = sc.nextFloat();
		
		resultado = Math.pow(a + b + c, 2);
		
		System.out.printf("O quadrado da soma de A, B e C � %.1f", resultado);
		
		sc.close();
	}

}
