package exerciciosManzano;

import java.util.Scanner;

public class Ex7_h {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float lado, altura, profundidade, volume;
		
		System.out.println("Digite o lado do paralelepipedo em cent�metros: ");
		lado = sc.nextFloat();
		
		System.out.println("Digite a altura do paralelepipedo em cent�metros: ");
		altura = sc.nextFloat();
		
		System.out.println("Digite profundidade do paralelepipedo em cent�metros: ");
		profundidade = sc.nextFloat();
		
		volume = lado * altura * profundidade;
		
		System.out.printf("O volume do paralelepipedo � %.1fcm�.", volume);
		
		sc.close();
		
	}

}
