package exerciciosManzano;

import java.util.Scanner;

public class Ex7_e {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		float valor, taxa, prestacao;
		int tempo;
		
		System.out.println("Digite o valor da presta��o em atraso em reais: ");
		valor = sc.nextFloat();
		
		System.out.println("Digite a taxa da presta��o em porcentagem: ");
		taxa = sc.nextFloat() / 100;
		
		System.out.println("Digite o tempo em atraso da presta��o: ");
		tempo = sc.nextInt();
		
		prestacao = valor + (valor * taxa) / tempo;
		
		System.out.printf("O valor da presta��o ser� de R$ %.2f.", prestacao);
		
		sc.close();
	}

}
