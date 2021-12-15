package exemplos;

public class TiposDeDados {

	public static void main(String[] args) {
	
		float a, b, c;
		a = 0.1f;
		b = 0.2f;
		c = 0.3f;
		
		if(a + b == c) {
			System.out.printf("%f é igual a %f", a, b);
		} else {
			System.out.printf("%f não é igual a %f", a, b);
		}
	}
}
