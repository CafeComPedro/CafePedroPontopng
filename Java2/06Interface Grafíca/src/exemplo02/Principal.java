package exemplo02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		//Criar um formulario
				JFrame formulario = new JFrame();
				formulario.setTitle("Meu segundo formul�rio");
				formulario.setSize(500, 300);
				formulario.setLocationRelativeTo(null);
				formulario.setLayout(null);
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				formulario.setVisible(true);
				
		//Bot�o
 		JButton botao = new JButton();
 		botao.setText("Enviar");
 		//botao.setSize(100, 30);
 		botao.setBounds(190, 110, 100, 30);
 		
 		//A��o no bot�o
 		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ol�!");
			}
		});
 		
 		//Add bot�o no formul�rio
 		formulario.add(botao);
 		
	}

}
