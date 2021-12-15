package exerciciosMar2007;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char tipo;
		int litros;
		float total;
		
		System.out.println("Digite G para gasolina ou A para alcool: ");
		tipo = sc.next().charAt(0);
		
		System.out.println("Digite a quantidade litros que deseja comprar: ");
		litros = sc.nextInt();
		
		
		if (tipo == 'G' || tipo == 'g') {
			
			total = litros * 3.3f;
			
			if (litros > 20) {
				total -= total * 6 / 100;
				System.out.printf("O valor de %d litros de Gasolina é R$ %.2f", litros, total);
			} else {
				total -= total * 4 / 100;
				System.out.printf("O valor de %d litros de Gasolina é R$ %.2f", litros, total);
			}
		} else {
			
			total = litros * 3.3f;
			
			if (litros > 20) {
				total -= total * 5 / 100;
				System.out.printf("O valor de %d litros de Alcool é R$ %.2f", litros, total);
			} else {
				total -= total * 3 / 100;
				System.out.printf("O valor de %d litros de Alcool é R$ %.2f", litros, total);
			}
		}
		
		sc.close();
	}

}
