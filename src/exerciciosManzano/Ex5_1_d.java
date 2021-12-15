package exerciciosManzano;

import java.util.Scanner;

public class Ex5_1_d {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int contador = 0;
		
		while (contador < 21) {
			if (contador % 2 != 0) {
				System.out.printf("%d \n", contador);
			}
			
			contador ++;
		}
		
		sc.close();
	}

}
