package exerciciosMar2007;

import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantidade;
		float preco, total;
		
		System.out.println("Digite o preço unitário do produto: ");
		preco = sc.nextFloat();
		
		System.out.println("Digite quantas unidades deseja comprar: ");
		quantidade = sc.nextInt();
		
		total = quantidade * preco;
		
		if (quantidade > 10) {
			total -= total * 0.05f;
		} else if (quantidade <= 5) {
			total -= total * 0.02f;
		} else {
			total -= total * 0.03f;
		}
		
		System.out.printf("O total a pagar será R$ %.2f", total);
		
		sc.close();
	}

}
