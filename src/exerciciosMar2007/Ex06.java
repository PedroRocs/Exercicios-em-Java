package exerciciosMar2007;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o valor do lado do ret�ngulo em metros: ");
		float lado = sc.nextFloat();
		
		System.out.printf("Digite o valor da altura do ret�ngulo em metros: ");
		float altura = sc.nextFloat();
		
		float area = altura * lado;
		
		System.out.printf("A �rea de um ret�ngulo de %.2fm lado e %.2fm altura � de %.2fm�.", lado, altura, area);
		
		sc.close();
	}
}
