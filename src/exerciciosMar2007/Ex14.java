package exerciciosMar2007;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int numero = sc.nextInt();
		
		if (numero > 10) {
			System.out.println("O n�mero digitado � maior que 10.");
		} else if (numero < 10) {
			System.out.println("O n�mero digitado menor que 10.");
		} else {
			System.out.println("O n�mero digitado � 10.");
		}
		
		sc.close();
	}
}
