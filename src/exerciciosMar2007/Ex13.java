package exerciciosMar2007;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		int nota1 = sc.nextInt();
		
		System.out.println("Digite a segunda nota do aluno: ");
		int nota2 = sc.nextInt();
		
		System.out.println("Digite a terceira nota do aluno: ");
		int nota3 = sc.nextInt();
		
		float media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
		
		System.out.printf("A média do aluno é %.1f.", media);

		sc.close();
	}

}
