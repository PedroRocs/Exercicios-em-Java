package exerciciosMar2007;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int estoqueAtual, estoqueMaximo, estoqueMinimo, estoqueMedio;
		
		System.out.println("Digite a quantida atual em estoque: ");
		estoqueAtual = sc.nextInt();
		
		System.out.println("Digite a quantida m�xima em estoque: ");
		estoqueMaximo = sc.nextInt();
		
		System.out.println("Digite a quantida m�nima em estoque: ");
		estoqueMinimo = sc.nextInt();
		
		estoqueMedio = (estoqueMinimo + estoqueMaximo) / 2;
		
		if (estoqueAtual >= estoqueMedio) {
			System.out.println("N�o efetuar compra");
		} else {
			System.out.println("Efetuar compra");
		}
	
		sc.close();
	}

}
