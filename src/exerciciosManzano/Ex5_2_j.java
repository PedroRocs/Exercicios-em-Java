package exerciciosManzano;

import java.util.Scanner;

public class Ex5_2_j {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int dividendo, divisor, quociente = 0;
		
		System.out.println("Digite o valor a ser divido: ");
		dividendo = sc.nextInt();
		
		System.out.println("Digite o valor que dividirá: ");
		divisor = sc.nextInt();
		
		do {
			dividendo -= divisor;
			quociente ++;
		} while (dividendo >= 0);
		
		if (dividendo < 0){
			quociente --;
		}
		
		System.out.printf("O resultado é %d", quociente);
		
		sc.close();
	}

}
