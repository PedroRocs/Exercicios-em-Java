package exerciciosSeparados;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura do ret�ngulo em metros: ");
		
		float largura = sc.nextFloat();
		
		System.out.println("Digite a altura do ret�ngulo em metros: ");
		
		float altura = sc.nextFloat();
		
		System.out.println("A �rea do Ret�ngulo � de " + (altura * largura / 2)+ "m�");
		sc.close();
	}
}
