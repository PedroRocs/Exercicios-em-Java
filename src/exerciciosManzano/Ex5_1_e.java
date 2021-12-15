package exerciciosManzano;

import java.util.Scanner;

public class Ex5_1_e {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double contador = 0;
		
		while (contador < 16) {
			System.out.printf("3 ^ %.0f = %.0f \n", contador, Math.pow(3, contador));
			contador ++;
		}
		
		sc.close();
	}
}
