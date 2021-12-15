package exerciciosManzano;

import java.util.Scanner;

public class Ex7_i {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, resultado;
		
		System.out.println("Digite o valor de A: ");
		a = sc.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = sc.nextInt();
	
		resultado = (a - b) * (a - b);
		
		System.out.printf("O quadrado da diferença de %d por %d é %d.", a, b, resultado);
		
		sc.close();
	}

}
