package exemplo04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Criar um formulario
				JFrame formulario = new JFrame();
				formulario.setTitle("Meu segundo formul�rio");
				formulario.setSize(500, 100);
				formulario.setLocationRelativeTo(null);
				formulario.setLayout(null);
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				formulario.setVisible(true);
				
			//caixa de combina��o
				JComboBox<String> op�oes = new JComboBox<String>();
				op�oes.setBounds(10, 10, 300, 30);
				op�oes.addItem("Op��o 1");
				op�oes.addItem("Op��o 2");
				op�oes.addItem("Op��o 3");
				
			//Bot�o
				JButton botao = new JButton();
				botao.setText("enviar");
				botao.setBounds(330, 10, 140, 30);
				
			//a��o do bot�o
				botao.addActionListener(new ActionListener() {
					
					
					@Override
					public void actionPerformed(ActionEvent e) {

						//Obter a op�ao seecionada
						String op�ao = op�oes.getSelectedItem().toString();
						
						//Exibir a op��o selecionada
						JOptionPane.showMessageDialog(null, op�ao);
					}
				});
				
				//add elemento ao formulario
				formulario.add(op�oes);
				formulario.add(botao);
				
				//Exibir componentes
				formulario.setVisible(true);
				
	}

}
