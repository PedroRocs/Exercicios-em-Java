package exerciciosManzano;

import java.util.Scanner;

public class Ex5_1_b {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int contador = 1, total = 0;
		
		while (contador < 101) {
			total += contador;
			contador ++;
		}
		
		System.out.printf("A soma de todos os número interios entre 1 e 100 é %d", total);
		
		sc.close();
	}

}
