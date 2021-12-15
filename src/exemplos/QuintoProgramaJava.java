package exemplos;

import java.util.Scanner;

public class QuintoProgramaJava {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		
		float valor1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		
		float valor2 = sc.nextInt();
		
		System.out.println(valor1  + " ÷ " + valor2 + " = " + (valor1 / valor2));
		
		sc.close();
	}
}
