package exerciciosMar2007;

import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nota1, nota2, nota3, mediaExercicios;
		float mediaFinal;
		char conceito;
		
		System.out.println("Digite a primeira nota do aluno: ");
		nota1 = sc.nextInt();
		
		System.out.println("Digite a segunda nota do aluno: ");
		nota2 = sc.nextInt();
		
		System.out.println("Digite a terceira nota do aluno: ");
		nota3 = sc.nextInt();
		
		System.out.println("Digite media dos exercícios do aluno: ");
		mediaExercicios = sc.nextInt();
	
		mediaFinal = (nota1 + nota2 * 3 + nota3 * 5 + mediaExercicios) / 10;
		
		if (mediaFinal >= 9) {
			conceito = 'A';
		} else if (mediaFinal >= 7.5f) {
			conceito = 'B';
		} else if (mediaFinal >= 6) {
			conceito = 'C';
		} else {
			conceito = 'D';
		}
		
		System.out.printf("O conceito final do anulo é %s.", conceito);

		sc.close();
	}

}
