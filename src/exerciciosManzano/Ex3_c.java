package exerciciosManzano;

import java.util.Scanner;

public class Ex3_c {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float nulos, brancos, a, b, c, validos, totalEleitores;

		System.out.println("digite a quantidade de votos nulos: ");
		nulos = sc.nextInt();

		System.out.println("digite a quantidade de votos brancos: ");
		brancos = sc.nextInt();

		System.out.println("digite a quantidade de votos para o candidato A: ");
		a = sc.nextInt();

		System.out.println("digite a quantidade de votos para o candidato B: ");
		b = sc.nextInt();

		System.out.println("digite a quantidade de votos para o candidato C: ");
		c = sc.nextInt();

		validos = a + b + c;
		totalEleitores = validos + brancos + nulos;

		brancos = (brancos / totalEleitores) * 100;
		nulos = (nulos / totalEleitores) * 100;
		validos = (validos / totalEleitores) * 100;
		a = (a / totalEleitores) * 100;
		b = (b / totalEleitores) * 100;
		c = (c / totalEleitores) * 100;

		System.out.printf(
				"O número total de eleitores é %.0f; \n %.1f dos votos foram válidos; \n O candidato A recebeu %.1f porcento dos vontos; \n O candidato B recebeu %.1f porcento dos vontos; \n O candidato C recebeu %.1f porcento dos vontos; \n  %.1f porcento dos vontos foram nulos; \n %.1f porcento dos vontos foram brancos;",
				totalEleitores, validos, a, b, c, nulos, brancos);
		
		sc.close();
	}

}
