package exemplos;

import java.util.Scanner;

public class TerceiroProgramaJava {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		
		int valor1 = sc.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		
		int valor2 = sc.nextInt();
		
		System.out.println(valor1 + " - " + valor2 + " = " + (valor1 - valor2));
		
		sc.close();
	}
}