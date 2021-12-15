package exerciciosManzano;

import java.util.Scanner;

public class Ex5_1_i {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int total = 0, contador = 1;

		while (contador < 11) {
			System.out.printf("Digite o %dº número: ", contador);
			total += sc.nextInt();
			contador ++;
		}
		
		System.out.printf("A soma de todos os números digitados é %d e a média aritimétrica dele é %.1f.", total,(float) total / 10);
		
		sc.close();
	}

}
