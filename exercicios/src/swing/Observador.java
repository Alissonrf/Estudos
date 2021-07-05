package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); 
		// como ta nullo ele centraliza de acordo com a tela do computador
		
		JButton botao = new JButton("Clicar");
		janela.add(botao);
		
		botao.addActionListener(e -> {
			// interface funcional por isso posso usar lambdas
			System.out.println("Evento ocorreu!!!"); 
		});
	
			
		
		janela.setVisible(true);
	}
}
