package exerciciosMar2007;

import java.util.Scanner;

/*
 Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
Calcular e escrever o valor do novo salário. 
 */
public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor atual do salário em Reais: ");

		float salario = sc.nextFloat();
		
		System.out.println("Digite o valor do reajuste em porcentagem: ");
		
		float reajuste = sc.nextFloat();
		
		float salarioFinal = salario + salario * reajuste / 100;
		
		System.out.printf("Um salário de R$:%.2f que recebe um reajuste de %.2f  se torna %.2f . ", salario, reajuste, salarioFinal);
	
		sc.close();
	}

}
