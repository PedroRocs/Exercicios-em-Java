package exerciciosMar2007;

import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int anoIngresso, anoNascimento, anoAtual;

		System.out.println("Digite o ano em que o contribuinte entrou na organização: ");
		anoIngresso = sc.nextInt();

		System.out.println("Digite o ano em que o contribuinte nasceu: ");
		anoNascimento = sc.nextInt();

		System.out.println("Digite o ano atual: ");
		anoAtual = sc.nextInt();

		if (anoAtual - anoIngresso >= 30 || anoAtual - anoNascimento >= 65
				|| (anoAtual - anoIngresso >= 25 && anoAtual - anoNascimento >= 60)) {
			System.out.println("Requerer aposentadoria.");
		} else {
			System.out.println("Não requerer aposentadoria.");
		}
		
		sc.close();
	}

}
