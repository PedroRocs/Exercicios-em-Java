package exerciciosManzano;

import java.util.Scanner;

public class Ex7_k {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor atual do real em d�lares: ");
		float valorReal = sc.nextFloat();
		
		System.out.println("Digite a quantidade de reais que deseja converter: ");
		Float reais = sc.nextFloat();
		
		float dolares = reais * valorReal;
		
		System.out.printf("%.2f reais correspondem a %.2f d�lares.", reais, dolares);
		
		sc.close();
	}

}
