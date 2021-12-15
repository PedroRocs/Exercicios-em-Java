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

			System.out.println("Digite o nome do cômodo a ser enserido");

			if (primeiraVez == false) {
				comodos += ", " + sc.next();
			} else {
				comodos = sc.next();
				primeiraVez = false;
			}

			System.out.println("Digite a largura do cômodo em metros: ");
			largura = sc.nextFloat();

			System.out.println("Digite o comprimento do cômodo em metros: ");
			comprimento = sc.nextFloat();

			areaTotal += comprimento * largura;

			System.out.println("Deseja inserir outro cômodo?");
			resposta = sc.next().charAt(0);
		}
		
		comodos += '.';

		System.out.printf("A área total da casa é de %.1f m³. \n Os comodos enseridos foram: %s", areaTotal, comodos);

		sc.close();
	}

}
