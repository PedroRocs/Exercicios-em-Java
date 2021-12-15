package exerciciosMar2007;

/*
 * Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
vendedor
 */

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário fixo do funcionário em reais: ");
		float salarioFixo = sc.nextFloat();
		
		System.out.println("Digite o número de carros vendidos: ");
		float carrosVendidos = sc.nextFloat();
		
		System.out.println("Digite o valor fixo adiquirido por ele a cada carro vendido em reais: ");
		float carrosFixo = sc.nextFloat();
		
		System.out.println("Digite o valor total das vendas do funcionário em reais: ");
		float totalVendas = sc.nextFloat();
	
		float salarioFinal = salarioFixo + carrosVendidos * carrosFixo + totalVendas * 5/100;
		
		System.out.printf("O Salário final do funcionário será de R$ %.2f.",salarioFinal);

		sc.close();
	}

}
