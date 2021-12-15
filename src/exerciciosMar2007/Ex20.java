package exerciciosMar2007;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		float primeiro, segundo;
		
		System.out.println("Digite o primeiro valor: ");
		primeiro = sc.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		segundo = sc.nextFloat();
		
		if (primeiro < segundo) {
			System.out.printf("%.1f; %.1f", primeiro, segundo);
		} else {
			System.out.printf("%.1f; %.1f", segundo, primeiro);
		}
		
		sc.close();
	}

}
