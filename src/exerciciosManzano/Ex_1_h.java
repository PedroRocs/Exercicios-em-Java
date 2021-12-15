package exerciciosManzano;

public class Ex_1_h {

	public static void main(String[] args) {
		
		int celsius = 10;
		
		while (celsius < 101) {
			System.out.printf("%dº Celsius equivalem a %.0fº Fahrenheit. \n", celsius, (float) (celsius * 9 + 160) / 5);
			celsius += 10;
		}
	}
}
