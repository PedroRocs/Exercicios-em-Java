package exerciciosSeparados;

import java.util.Scanner;

public class AreaQuadrado {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura do quadrado em metros: ");
		float largura = sc.nextFloat();
		System.out.println("A �rea do quadrado � de " + Math.pow(largura, 2) + "m�");
		
		sc.close();
	}
}
