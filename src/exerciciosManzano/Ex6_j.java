package exerciciosManzano;

public class Ex6_j {

	public static void main(String[] args) {
		
		for (int celsius = 10; celsius <= 100; celsius += 10) {
			System.out.printf("%d� Ceilsius equivalem a %.0f� Fahrenheit \n", celsius, (float) (celsius * 9 + 160) / 5);
		}
	}
}
