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
		
		System.out.printf("A soma das notas do aluno � %d \n O total de notas digitadas foi %d \n a m�dia do aluno � %.0f.", total, contador, (float) total / contador);
		
		sc.close();
	}

}

/* Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e apresente no final o
total do somat�rio, a m�dia aritm�tica e o total de valores lidos. O programa deve fazer as leituras
dos valores enquanto o usu�rio estiver fornecendo valores positivos. Ou seja, o programa deve
parar quando o usu�rio fornecer um valor negativo. N�o se esque�a que o usu�rio pode entrar
como primeiro n�mero um n�mero negativo, portanto, cuidado com a divis�o por zero no c�lculo da
m�dia. */