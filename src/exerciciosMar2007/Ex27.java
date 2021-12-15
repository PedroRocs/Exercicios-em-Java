package exerciciosMar2007;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		
		if (valor > 0) {
			System.out.println("Essa valor é positivo.");
		} else if (valor < 0) {
			System.out.println("Essa valor é negativo.");
		} else {
			System.out.println("Essa valor é neutro.");
		}
		
		sc.close();
	}

}
