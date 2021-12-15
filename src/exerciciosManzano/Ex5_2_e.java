package exerciciosManzano;

import java.util.Scanner;

public class Ex5_2_e {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int contador = 0, fatorial;
		
		int numero[];
		numero = new int[15];

		do {
			System.out.println("Digite um número: ");
			numero[contador] = sc.nextInt();
			
			fatorial = numero[contador] - 1;
			
			while (fatorial > 1) {
				numero[contador] = numero[contador] * fatorial;
				fatorial --;
			}
			
			contador++;
		} while (contador < 15);

		contador = 0;

		do {
			System.out.println(numero[contador]);
			contador ++;
		} while (contador < 15);

		sc.close();
	}
}
