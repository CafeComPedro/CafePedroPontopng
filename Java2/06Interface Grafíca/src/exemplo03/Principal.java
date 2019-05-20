package exemplo03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {

		//Criar um formulario
		JFrame formulario = new JFrame();
		formulario.setTitle("Meu segundo formulário");
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setVisible(true);
		
		//criar um rótulo
		JLabel rotulo = new JLabel();
		rotulo.setBounds(30, 30, 150, 20);
		rotulo.setText("Informe seu nome");
		
		//crair um campo de texto
		JTextField campo = new JTextField();
		campo.setBounds(180, 30, 100, 20);	
		
		//criar um botão
		JButton botao = new JButton();
		botao.setText("Enviar");
		botao.setBounds(180, 70, 100, 30);
		
		//ação no botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {				
				//Obter nome informado
				String nome = campo.getText();
				//Exibir mensagem
				JOptionPane.showMessageDialog(null, "Qualé "+nome);
				//Limpar o campo de texto
				campo.setText("");
				//Deixar o cursor selecionando o campo
				campo.requestFocus();
			}
		});
		
		//add elementos ao formulario
		formulario.add(rotulo);
		formulario.add(campo);
		formulario.add(botao);
		
		//Exibir o formulario e seus componentes internos
		formulario.setVisible(true);
	}

}
