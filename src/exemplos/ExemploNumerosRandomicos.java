package exemplos;

public class ExemploNumerosRandomicos {

	public static void main(String[] args) {

		int numeroRandomico;

		int randomizacao = (int) (Math.random() * 1);

		for (int i = 0; i < 100; i++) {
			if (randomizacao == 0) {
				numeroRandomico = (int) (Math.random() * 101);

				System.out.println(numeroRandomico);
				randomizacao = (int) (Math.random() * 1);

			} else {
				numeroRandomico = (int) (Math.random() * -101);

				System.out.println(numeroRandomico);

				randomizacao = (int) (Math.random() * 1);
			}
		}

	}
}
