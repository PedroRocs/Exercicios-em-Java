package exerciciosManzano;

import java.util.Scanner;

public class Ex7_a {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a tempertatura em graus Celsius: ");
		float celsius = sc.nextFloat();

		float fahrenheit = (celsius * 9 + 160) / 5;
		
		System.out.printf("A temperatura %.1fº na escala Celsius corresponde a %.1fº na escala Fahrnheit;", celsius,
				fahrenheit);
		
		sc.close();
	}

}
