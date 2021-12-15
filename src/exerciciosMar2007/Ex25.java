package exerciciosMar2007;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int conta;
		
		double saldo, debito, credito, saldoAtual;
		
		System.out.println("Digite o número da conta: ");
		conta = sc.nextInt();
		
		System.out.println("Digite o saldo em reais: ");
		saldo = sc.nextDouble();

		System.out.println("Digite o debito em reais: ");
		debito = sc.nextDouble();

		System.out.println("Digite o credito em reais: ");
		credito = sc.nextDouble();

		saldoAtual = saldo - debito + credito;
		
		if (saldoAtual < 0) {
		 System.out.println("Saldo negativo");
		} else {
			System.out.println("Saldo positivo");
		}
		
		sc.close();
	}

}
