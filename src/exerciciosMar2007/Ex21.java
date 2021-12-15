package exerciciosMar2007;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicio, horaFinal, duracao;
		
		System.out.println("Digite a hora de início do jogo: ");
		horaInicio = sc.nextInt();
		
		System.out.println("Digite a hora de fim do jogo: ");
		horaFinal = sc.nextInt();
		
		if (horaInicio >= horaFinal) {
			duracao = (horaFinal - horaInicio) + 24;
		} else {
			duracao = horaFinal - horaInicio;
		}
		
		System.out.printf("A partida durou %d horas.", duracao);
	
		sc.close();
	}

}
