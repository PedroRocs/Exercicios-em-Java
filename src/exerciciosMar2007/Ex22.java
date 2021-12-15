package exerciciosMar2007;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float salarioHora, salarioMensal;
		int horasTrabalhadas;

		System.out.println("Digite o sal�rio / hora do funcion�rio em reais: ");
		salarioHora = sc.nextFloat();

		System.out.println("Digite a quantidade de horas trabalhadas no m�s: ");
		horasTrabalhadas = sc.nextInt();

		if (horasTrabalhadas > 160) {
			salarioMensal = (160 + (horasTrabalhadas - 160) * 1.5f) * salarioHora;
		} else {
			salarioMensal = horasTrabalhadas * salarioHora;
		}

		System.out.printf("O sal�rio a receber do funcion�rio neste m�s � de R$ %.2f ;", salarioMensal);
		
		sc.close();
	}

}
