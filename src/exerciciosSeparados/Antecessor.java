package exerciciosSeparados;

import java.util.Scanner;

public class Antecessor {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		
		int numero = sc.nextInt();
		
		System.out.println("O antecessor de " + numero + " � " + (numero - 1));
		
		sc.close();
	}
}

 