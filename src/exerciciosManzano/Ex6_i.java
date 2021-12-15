package exerciciosManzano;

public class Ex6_i {

	public static void main(String[] args) {
		
		int antecessor = 0, anterior = 1, atual, contador;

		System.out.println(1);

		for (contador = 1;contador < 16; contador ++) {
			atual = antecessor + anterior;
			antecessor = anterior;
			anterior = atual;

			System.out.println(atual);
		}
	}

}
