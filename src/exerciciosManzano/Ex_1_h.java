package exerciciosManzano;

public class Ex_1_h {

	public static void main(String[] args) {
		
		int celsius = 10;
		
		while (celsius < 101) {
			System.out.printf("%d� Celsius equivalem a %.0f� Fahrenheit. \n", celsius, (float) (celsius * 9 + 160) / 5);
			celsius += 10;
		}
	}
}
