package exerciciosMar2007;

/*
 * Uma revendedora de carros usados paga a seus funcion�rios vendedores um sal�rio fixo por m�s,
mais uma comiss�o tamb�m fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o n�mero de carros por ele vendidos, o valor total de suas
vendas, o sal�rio fixo e o valor que ele recebe por carro vendido. Calcule e escreva o sal�rio final do
vendedor
 */

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio fixo do funcion�rio em reais: ");
		float salarioFixo = sc.nextFloat();
		
		System.out.println("Digite o n�mero de carros vendidos: ");
		float carrosVendidos = sc.nextFloat();
		
		System.out.println("Digite o valor fixo adiquirido por ele a cada carro vendido em reais: ");
		float carrosFixo = sc.nextFloat();
		
		System.out.println("Digite o valor total das vendas do funcion�rio em reais: ");
		float totalVendas = sc.nextFloat();
	
		float salarioFinal = salarioFixo + carrosVendidos * carrosFixo + totalVendas * 5/100;
		
		System.out.printf("O Sal�rio final do funcion�rio ser� de R$ %.2f.",salarioFinal);

		sc.close();
	}

}
