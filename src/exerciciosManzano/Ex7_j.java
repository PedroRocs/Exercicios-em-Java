package exerciciosManzano;

import java.util.Scanner;

public class Ex7_j {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor atual do dolar em reais: ");
		float valorDolar = sc.nextFloat();
		
		System.out.println("Digite a quantidade de dólares que deseja converter: ");
		int dolares = sc.nextInt();
		
		float reais = dolares * valorDolar;
		
		System.out.printf("%d,00 dólares correspondem a %.2f reais.", dolares, reais);
		
		sc.close();
	}

}
