package exerciciosManzano;

import java.util.Scanner;

public class Ex7_c {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a altura da lata em centimetros: ");
		float altura = sc.nextFloat();
		
		System.out.println("Digite o raio da lata em centímetros: ");
		float raio = sc.nextFloat();
		
		float volume = (float) (Math.PI * (raio * raio) * altura);
		
		System.out.printf("O volume da lata é de %.1fcm³.", volume);
	
		sc.close();
	}
}
