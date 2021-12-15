package exerciciosManzano;

import java.util.Scanner;

public class Ex5_1_k {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float areaTotal = 0, largura, comprimento;
		char resposta = ' ';
		String comodos = "";
		boolean primeiraVez = true;

		while (Character.compare(resposta, 'n') != 0 && Character.compare(resposta, 'N') != 0) {

			System.out.println("Digite o nome do c�modo a ser enserido");

			if (primeiraVez == false) {
				comodos += ", " + sc.next();
			} else {
				comodos = sc.next();
				primeiraVez = false;
			}

			System.out.println("Digite a largura do c�modo em metros: ");
			largura = sc.nextFloat();

			System.out.println("Digite o comprimento do c�modo em metros: ");
			comprimento = sc.nextFloat();

			areaTotal += comprimento * largura;

			System.out.println("Deseja inserir outro c�modo?");
			resposta = sc.next().charAt(0);
		}
		
		comodos += '.';

		System.out.printf("A �rea total da casa � de %.1f m�. \n Os comodos enseridos foram: %s", areaTotal, comodos);

		sc.close();
	}

}
