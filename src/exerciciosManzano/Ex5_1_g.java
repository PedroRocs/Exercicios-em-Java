package exerciciosManzano;

public class Ex5_1_g {

	public static void main(String[] args) {
		
		
		int antecessor = 0, anterior = 1, atual, contador = 1;
		
		System.out.println(1);
		
		while (contador < 16) {
			atual = antecessor + anterior;
			antecessor = anterior;
			anterior = atual;
			
			System.out.println(atual);
			contador ++;
		}
	}

}
