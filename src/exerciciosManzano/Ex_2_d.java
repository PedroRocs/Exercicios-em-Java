package exerciciosManzano;

public class Ex_2_d {

	public static void main(String[] args) {
		
		double total;
		
		total = (Math.pow(2, 64)) - 1; // Nas aulas de JavaScript eu quebrei a cabe�a com esse exerc�cio, at� olhar pro resultado � perceber que era sempre (2 elevado ao n�mero de casas) menos 1. ;^)
		
		System.out.printf("O numero total de gr�os de trigo ser� %.0f", total);
	}

}

/*Elaborar um programa que efetue o c�lculo e no final apresente o somat�rio do n�mero de gr�os de
trigo que se pode obter num tabuleiro de xadrez, obedecendo � seguinte regra: colocar um gr�o de
trigo no primeiro quadro e nos quadros seguintes o dobro do quadro anterior. Ou seja, no primeiro
quadro coloca-se 1 gr�o, no segundo quadro colocam-se 2 gr�os (neste momento t�m-se 3 gr�os),
no terceiro quadro colocam-se 4 gr�os (tendo neste momento 7 gr�os), no quarto colocam-se 8
gr�os (tendo-se ent�o 15 gr�os) at� atingir o sexag�simo quarto (64o
) quadro. Utilize vari�veis do
tipo real como acumuladores.*/