package exerciciosManzano;

import java.util.Scanner;

public class Ex3_b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float salarioAtual, reajuste, salarioFinal;
		
		System.out.println("Digite o valor atual correspondente ao sal�rio do funcion�rio em reais: ");
		salarioAtual = sc.nextFloat();
		
		System.out.println("Digite a porcentagem de reajuste no sal�rio: ");
		reajuste = sc.nextFloat();
		
		salarioFinal = salarioAtual + salarioAtual * reajuste / 100;
		
		System.out.printf("O sal�rio de R$ %.2f que recebe um reajuste de %.1f porcento se torna R$ %.2f.", salarioAtual, reajuste, salarioFinal);
		
		sc.close();
	}

}
