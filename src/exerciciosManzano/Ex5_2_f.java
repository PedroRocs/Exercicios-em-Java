package exerciciosManzano;

import java.util.Scanner;

public class Ex5_2_f {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int valor = 0, contador = 0, total = 0;
		
		do {
			System.out.println("Digite uma nota do aluno: ");
			valor = sc.nextInt();
			
			if (valor >= 0) {
				total += valor;
				contador ++;
			}
			
		} while (valor >= 0);
		
		System.out.printf("A soma das notas do aluno é %d \n O total de notas digitadas foi %d \n a média do aluno é %.0f.", total, contador, (float) total / contador);
		
		sc.close();
	}

}

/* Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o
total do somatório, a média aritmética e o total de valores lidos. O programa deve fazer as leituras
dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve
parar quando o usuário fornecer um valor negativo. Não se esqueça que o usuário pode entrar
como primeiro número um número negativo, portanto, cuidado com a divisão por zero no cálculo da
média. */