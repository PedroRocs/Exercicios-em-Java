package exerciciosMar2007;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int usuario, senha;
	
		System.out.println("Digite o usuário: ");
		usuario = sc.nextInt();
		
		if (usuario == 1234) {
			System.out.println("Digite a senha: ");
			senha = sc.nextInt();
			
			if (senha == 9999) {
				System.out.println("Acesso permitido.");
			} else {
				System.out.println("senha incorreta.");
			}
		} else {
			System.out.println("Usuário inválido.");
		}
		
		sc.close();
	}
}