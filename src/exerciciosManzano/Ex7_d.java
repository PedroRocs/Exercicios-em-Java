package exerciciosManzano;

import java.util.Scanner;

public class Ex7_d {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tempo, velocidade, distancia;

		System.out.println("Digite o tempo gasto na viagem em horas: ");
		tempo = sc.nextInt();

		System.out.println("Digite a velocidade média durante a viagem em km/hora: ");
		velocidade = sc.nextInt();

		distancia = tempo * velocidade;

		float litrosUsados = distancia / 12;

		System.out.printf("A velocidade média do carro durante a viagem foi %d km/h; \n O tempo gasto durante a viagem foi %d horas; \n A distância percorrida foi de %d quilometros; \n A quantida de litros gastos durante a viagem foi de %.1f", velocidade, tempo, distancia, litrosUsados);
	
		sc.close();
	}

}
