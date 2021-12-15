package javaSwing;

import javax.swing.JButton;
import javax.swing.JFrame;
import src.javSwing.Teste01;

public class Exemplo01 {

	public static void main(String[] args) {
	
		JFrame f = new JFrame("Botão validar"); // A partir da classe JFrame criar um objeto chamado f que é = a um novo objeto JFrame.
	
		JButton b = new JButton("Clique aqui (Confia)"); // botão

		b.setBounds(0, 100, 100, 10); // (x, y, largura, altura)
		
		f.add(b);
		
		f.setSize(400, 500); //tamanho da tela
		f.setLayout(null);
		f.setVisible(true);
	}

}
