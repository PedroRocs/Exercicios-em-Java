package exerciciosSeparados;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura do retângulo em metros: ");
		
		float largura = sc.nextFloat();
		
		System.out.println("Digite a altura do retângulo em metros: ");
		
		float altura = sc.nextFloat();
		
		System.out.println("A área do Retângulo é de " + (altura * largura / 2)+ "m²");
		sc.close();
	}
}
