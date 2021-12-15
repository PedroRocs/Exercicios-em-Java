package exerciciosMar2007;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int macas, morangos;
		float total;
		
		System.out.println("Quantos quilos de maçã deseja comprar?"); 
		macas = sc.nextInt();
		
		System.out.println("Quantos quilos de morangos deseja comprar?"); 
		morangos = sc.nextInt();
		
		if (macas > 5) {
			total = macas * 1.5f;
		} else {
			total = macas * 1.8f;
		}
		
		if (morangos > 5) {
			total = morangos * 2.2f;
		} else {
			total = morangos * 2.5f;
		}
		
		if (morangos + macas > 8 || total > 25) {
			total -= total * 0.1f;
		}
	
		System.out.printf("O total da compra será de R$ %.2f.", total);
		
		sc.close();
	}

}
