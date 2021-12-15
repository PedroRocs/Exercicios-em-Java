package exerciciosManzano;

public class Ex5_1_h {

	public static void main(String[] args) {
		int celsius = 10;
		
		while (celsius <= 100) {
			System.out.printf("%dº Ceilsius equivalem a %.0fº Fahrenheit \n", celsius, (float) (celsius * 9 + 160) / 5);
			celsius += 10;
		}

	}

}
