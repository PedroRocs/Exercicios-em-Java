package exerciciosManzano;

import java.util.Scanner;

public class Ex5_1_a {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int contador = 1;
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		while (contador < 11) {
			System.out.printf("%d x %d = %d \n", numero, contador, contador * numero);
			contador ++;
		}
		
		sc.close();
	}

}
