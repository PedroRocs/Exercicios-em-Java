package exerciciosMar2007;

import java.util.Scanner;

/*
 Escreva um algoritmo para ler o sal�rio mensal atual de um funcion�rio e o percentual de reajuste.
Calcular e escrever o valor do novo sal�rio. 
 */
public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor atual do sal�rio em Reais: ");

		float salario = sc.nextFloat();
		
		System.out.println("Digite o valor do reajuste em porcentagem: ");
		
		float reajuste = sc.nextFloat();
		
		float salarioFinal = salario + salario * reajuste / 100;
		
		System.out.printf("Um sal�rio de R$:%.2f que recebe um reajuste de %.2f  se torna %.2f . ", salario, reajuste, salarioFinal);
	
		sc.close();
	}

}
