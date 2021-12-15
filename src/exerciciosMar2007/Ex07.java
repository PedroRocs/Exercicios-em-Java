package exerciciosMar2007;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite sua idade em anos: ");
		byte anos = sc.nextByte();
		
		System.out.printf("Digite sua idade em meses: ");
		byte meses = sc.nextByte();
		
		System.out.printf("Digite sua idade em dias:");
		byte dias = sc.nextByte();
		
		int diasTotais = anos * 365 + meses * 30 + dias;
		System.out.printf("A os dias de vida totais de uma pessoa com %d anos, %d meses e %d dias de vida é de %d dias.", anos, meses, dias, diasTotais);
		
		sc.close();
	}

}
