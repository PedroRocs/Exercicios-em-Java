package exerciciosMar2007;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int numero = sc.nextInt();

		if (numero > 0) {
			System.out.println(numero + "é  positivo.");
		} else if (numero < 0) {
			System.out.println(numero + "é negativo.");
		} else {
			System.out.println("zero é neutro.");
		}

		sc.close();
	}

}
