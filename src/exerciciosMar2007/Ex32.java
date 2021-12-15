package exerciciosMar2007;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String timeA, timeB;
		int placarA, placarB;
		
		System.out.println("Digite o nome do primeiro time: ");
		timeA = sc.next();

		System.out.println("Digite o placar deste time neste jogo: ");
		placarA = sc.nextInt();
		
		System.out.println("Digite o nome do segundo time: ");
		timeB = sc.next();

		System.out.println("Digite o placar deste time neste jogo: ");
		placarB = sc.nextInt();
		
		if (placarA > placarB) {
			System.out.printf("O vencedor é o time %s.", timeA);
		} else if (placarB > placarA) {
			System.out.printf("O vencedor é o time %s.", timeB);
		} else {
			System.out.printf("O jogo terminou em empate.");
		}
		
		sc.close();
	}

}
