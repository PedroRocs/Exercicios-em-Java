package exerciciosMar2007;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char sexo;
		String nome;
		float altura, pesoIdeal;
		
		System.out.println("Digite o seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Digite o seu sexo (M/F): ");
		sexo = sc.next().charAt(0);
		
		System.out.println("Digite a sua altura em metros: ");
		altura = sc.nextFloat();
		
		if (sexo == 'm' || sexo == 'M')  {
			pesoIdeal = (72.7f * altura) - 58; 
		} else {
			pesoIdeal = (62.1f * altura) - 44.7f;
		}
		
		System.out.printf("O seu peso ideal é %.2fkg.", pesoIdeal);
		
		sc.close();
	}
}
