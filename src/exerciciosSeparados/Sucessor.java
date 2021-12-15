package exerciciosSeparados;

import java.util.Scanner;

public class Sucessor {

		public static void main(String[]args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite um número: ");
			
			int numero = sc.nextInt();
			
			System.out.println("O sucecessor de " + numero + " é " + (numero + 1));
			
			sc.close();
		}
	
}
