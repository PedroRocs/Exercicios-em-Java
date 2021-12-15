package exerciciosManzano;

import java.util.Scanner;

public class Ex5_1_f {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int base, expoente, contador, resultado;
		
		System.out.println("Digite a base da potência: ");
		base = sc.nextInt();
		
		System.out.println("Digite o expoente da potência: ");
		expoente = sc.nextInt();
		
		resultado = base;
		contador = expoente;
		
		
		while (contador > 1) {
			resultado = resultado * base;
			contador --;
		}
		
		System.out.printf("%d ^ %d = %d", base, expoente, resultado);
		
		sc.close();
	}

}
