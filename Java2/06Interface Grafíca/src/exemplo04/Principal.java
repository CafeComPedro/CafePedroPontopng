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
				formulario.setTitle("Meu segundo formulário");
				formulario.setSize(500, 100);
				formulario.setLocationRelativeTo(null);
				formulario.setLayout(null);
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				formulario.setVisible(true);
				
			//caixa de combinação
				JComboBox<String> opçoes = new JComboBox<String>();
				opçoes.setBounds(10, 10, 300, 30);
				opçoes.addItem("Opção 1");
				opçoes.addItem("Opção 2");
				opçoes.addItem("Opção 3");
				
			//Botão
				JButton botao = new JButton();
				botao.setText("enviar");
				botao.setBounds(330, 10, 140, 30);
				
			//ação do botão
				botao.addActionListener(new ActionListener() {
					
					
					@Override
					public void actionPerformed(ActionEvent e) {

						//Obter a opçao seecionada
						String opçao = opçoes.getSelectedItem().toString();
						
						//Exibir a opção selecionada
						JOptionPane.showMessageDialog(null, opçao);
					}
				});
				
				//add elemento ao formulario
				formulario.add(opçoes);
				formulario.add(botao);
				
				//Exibir componentes
				formulario.setVisible(true);
				
	}

}
