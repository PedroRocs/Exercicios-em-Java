package exerciciosMar2007;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a tempertatura em graus Fahrenheit: ");
		float fahrenheit = sc.nextFloat();

		float celsius = ((fahrenheit - 32) / 9) * 5;

		System.out.printf("A temperatura %.1fº na escala Fahrenheit corresponde a %.1fº na escala Celsius;", fahrenheit,
				celsius);
		
		sc.close();
	}

}
