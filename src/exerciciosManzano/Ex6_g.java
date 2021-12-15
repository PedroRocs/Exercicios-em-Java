package exerciciosManzano;

public class Ex6_g {

	public static void main(String[] args) {
		
		System.out.println("3 ^ 0 = 1");
		
		for (int contador = 1; contador <= 15; contador ++) {
			int total = 3;
			
			for (int expoente = contador; expoente > 1; expoente --) {
				total = total * 3;
			}
			
			System.out.printf("3 ^ %d = %d \n", contador, total);
		}

	}

}
