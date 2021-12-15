package exerciciosManzano;

import java.util.Scanner;

public class Ex5_1_c {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 1, total = 0;
		
		while (contador < 500) {
			if (contador % 2 == 0) {
				total += contador;
			}
			
			contador ++;
		}
		
		System.out.printf("A somatória dos valores de 0 a 500 é %d", total);
		
		sc.close();
	}

}
