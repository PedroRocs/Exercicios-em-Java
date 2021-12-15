package exerciciosSeparados;

import java.util.Scanner;

public class Multiplicacao {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int valor1 = sc.nextInt();
		
		System.out.println("Digite outro número: ");
		
		int valor2 = sc.nextInt();
		
		System.out.println(valor1 + " x " + valor2 + " = " + (valor1 * valor2));
		
		sc.close();
	}
}