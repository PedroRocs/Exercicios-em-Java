package exerciciosMar2007;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int homem1, homem2, mulher1, mulher2, soma1, soma2;
		
		System.out.println("Digite a idade do primeiro homem: ");
		homem1 = sc.nextInt();
		
		System.out.println("Digite a idade do segundo homem: ");
		homem2 = sc.nextInt();
		
		System.out.println("Digite a idade da primeira mulher: ");
		mulher1 = sc.nextInt();
		
		System.out.println("Digite a idade da segunda mulher: ");
		mulher2 = sc.nextInt();
		
		if (homem1 > homem2) {
			soma1 = homem1;
			soma2 = homem2;
			
			if (mulher1 > mulher2) {
				soma1 += mulher2;
				soma2 += mulher1;
			} else {
				soma1 += mulher1;
				soma2 += mulher2;
			}
		} else {
			soma1 = homem2;
			soma2 = homem1;
			
			if (mulher1 > mulher2) {
				soma1 += mulher2;
				soma2 += mulher1;
			} else {
				soma1 += mulher1;
				soma2 += mulher2;
			}
		}
		
		System.out.printf("A soma da idade do homem mais velho com a mulher mais nova é %d; \n A soma da idade do homem mais novo com a mulher mais velha é %d.", soma1, soma2);
	
		sc.close();
	}
}
