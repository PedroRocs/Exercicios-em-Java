package exerciciosMar2007;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o número de votos em branco da votação: ");
		int brancos = sc.nextInt();
		
		System.out.printf("Digite o número de votos nulos da votação: ");
		int nulos = sc.nextInt();

		System.out.printf("Digite o número de votos válidos da votação: ");
		int validos = sc.nextInt();
		
		float total = brancos + nulos + validos;
		
		float pbrancos = brancos / (total / 100);
		float pnulos = nulos / (total / 100);
		float pvalidos = validos / (total / 100);
		
		System.out.printf("O total de votos foi %.0f;\n Os votos em branco representam %.2f porcento do total; \n Os votos nulos representam %.2f porcento do total; \n E os votos válidos representam %.2f porcento do total", total, pbrancos, pnulos, pvalidos);

		sc.close();
	}
}
