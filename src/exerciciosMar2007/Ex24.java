package exerciciosMar2007;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		float salarioFixo, salarioFinal, valorVendas;
		
		System.out.println("Digite o sal�rio fixo do funcion�rio em reais: ");
		salarioFixo = sc.nextFloat();
		
		System.out.println("Digite as vendas do m�s do funcion�rio em reais: ");
		valorVendas = sc.nextFloat();
		
		if (valorVendas > 1500) {
			salarioFinal = salarioFixo + 1500 * 0.03f + (valorVendas - 1500) * 0.05f; 
		} else {
			salarioFinal = salarioFixo + valorVendas * 0.03f;
		}
		
		System.out.printf("O sal�rio deste m�s do funcion�rio ser� de R$ %.2f.", salarioFinal);
	
		sc.close();
	}

}
