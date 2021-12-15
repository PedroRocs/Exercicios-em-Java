package exemplos;

public class ExemploJavaString1 {

	public static void main(String[] args) {

		String saudacao = "Boa tarde";

		System.out.println(saudacao);

		// Contagem de numeros de caracteres

		System.out.println("A quantidade de caracteres da String é: " + saudacao.length());

		// Deixar uma string só com minusculas

		System.out.println(saudacao.toLowerCase());

		// Deixar tudo maiusculo

		System.out.println(saudacao.toUpperCase());

		// Localizar primeira letra da palavra

		String frase = "Os últimos serão os primeiros";
		String palavra = "Os";

		System.out.println(frase.indexOf(palavra));

		// Localizar última letra da palavra

		System.out.println(frase.indexOf(palavra) + palavra.length() - 1);

		// concatenação

		String nome = "Jailson";
		String sobreNome = "Costa dos Santos";

		System.out.println(nome + "" + sobreNome); // ou
		System.out.println(nome.concat(sobreNome));

		// maior e menor entre dois números

		System.out.println(Math.max(1, 2));
		System.out.println(Math.min(1, 2));
		
		//Raiz quadrada (Square root = sqrt)
		
		System.out.println(Math.sqrt(64));
	
		//Valor absoluto (absolute = abs) = retirar 
		
		System.out.println(Math.abs(-12));
		
		//Aleatório ou randômico (random)
		
		int aleatorio = (int) (Math.random() * 101); //numero aleatorios de 0 a 100
		
		System.out.println(aleatorio);
	}

}
