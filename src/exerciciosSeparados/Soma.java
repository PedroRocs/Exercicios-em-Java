package exerciciosSeparados;

import java.util.Scanner;

public class Soma {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int valor = sc.nextInt();
		
		System.out.println("Digite um número: ");
		
		int valor2 = sc.nextInt();
		
		int soma = valor + valor2;
		
		System.out.println("A soma dos valores é "+ soma);
		
		sc.close();
	}
}