package exerciciosMar2007;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o custo de fábrica do carro em reais: ");
		double custoFabrica = sc.nextDouble();

		double custoTotal = custoFabrica + custoFabrica * 63 / 100;

		System.out.printf("O custo total do carro é de R$ %.2f", custoTotal);

		sc.close();
	}

}
