package exerciciosManzano;

import java.util.Scanner;

public class Ex7_g {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.println("digite o valor de A: ");
		a = sc.nextInt();
		
		System.out.println("digite o valor de B: ");
		b = sc.nextInt();
		
		System.out.println("digite o valor de C: ");
		c = sc.nextInt();
		
		System.out.println("digite o valor de D: ");
		d = sc.nextInt();
		
		System.out.printf("%d + %d = %d, %d + %d = %d, %d + %d = %d, %d + %d = %d, %d + %d = %d\n", a, b, a+b, a, c, a+c, a, d, a+d, b, c, b+c, c, d, c+d);
		System.out.printf("%d x %d = %d, %d x %d = %d, %d x %d = %d, %d x %d = %d, %d x %d = %d", a, b, a*b, a, c, a*c, a, d, a*d, b, c, b*c, c, d, c*d);
		
		sc.close();
	}

}
