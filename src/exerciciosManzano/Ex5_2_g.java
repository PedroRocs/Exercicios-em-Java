package exerciciosManzano;

public class Ex5_2_g {

	public static void main(String[] args) {
		
		int contador = 1, fatorial, total;
		
		do {
			fatorial = contador - 1;
			total = contador;
			
			while (fatorial > 1) {
				total = total * fatorial;
				fatorial --;
			}
			
			System.out.println(total);
			
			contador += 2;
		} while (contador < 9);
	}
}
