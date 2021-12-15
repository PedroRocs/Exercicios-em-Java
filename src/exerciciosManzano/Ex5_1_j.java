package exerciciosManzano;

public class Ex5_1_j {

	public static void main(String[] args) {
		
		int contador = 50, total = 0, pares = 0;
		
		while (contador < 71) {
			if (contador % 2 == 0) {
				total += contador;
				pares += 1;
			}
			contador ++;
		}
		
		System.out.printf("A média aritimétrica dos valores pares entre 50 e 70 é %d e sua soma é %d", total / pares, total);
	}
}
