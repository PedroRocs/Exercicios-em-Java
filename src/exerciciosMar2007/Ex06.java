package exerciciosMar2007;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o valor do lado do retângulo em metros: ");
		float lado = sc.nextFloat();
		
		System.out.printf("Digite o valor da altura do retângulo em metros: ");
		float altura = sc.nextFloat();
		
		float area = altura * lado;
		
		System.out.printf("A área de um retângulo de %.2fm lado e %.2fm altura é de %.2fm².", lado, altura, area);
		
		sc.close();
	}
}
