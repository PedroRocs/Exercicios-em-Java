package exerciciosSeparados;

import java.util.Scanner;

public class Soma {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		
		int valor = sc.nextInt();
		
		System.out.println("Digite um n�mero: ");
		
		int valor2 = sc.nextInt();
		
		int soma = valor + valor2;
		
		System.out.println("A soma dos valores � "+ soma);
		
		sc.close();
	}
}