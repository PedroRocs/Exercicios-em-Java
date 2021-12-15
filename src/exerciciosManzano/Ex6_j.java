package exerciciosManzano;

public class Ex6_j {

	public static void main(String[] args) {
		
		for (int celsius = 10; celsius <= 100; celsius += 10) {
			System.out.printf("%dº Ceilsius equivalem a %.0fº Fahrenheit \n", celsius, (float) (celsius * 9 + 160) / 5);
		}
	}
}
