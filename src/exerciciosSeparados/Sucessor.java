package exerciciosSeparados;

import java.util.Scanner;

public class Sucessor {

		public static void main(String[]args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite um n�mero: ");
			
			int numero = sc.nextInt();
			
			System.out.println("O sucecessor de " + numero + " � " + (numero + 1));
			
			sc.close();
		}
	
}
