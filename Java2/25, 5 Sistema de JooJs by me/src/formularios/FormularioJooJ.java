package formularios;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


import beans.Jogo;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JButton;
import a��o.A��o;
import javax.swing.JTextArea;
import java.awt.ScrollPane;

public class FormularioJooJ extends JPanel {

	private JTextField txtNome;
	private JTextField txtValor;
	private JTextField txtClassifica��o;
	private JPanel contentPane;
	private JTable table;
	
	public FormularioJooJ() {

	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		//Instanciar objeto da classe a��o
		A��o a = new A��o();
			
		JLabel lblNewLabel = new JLabel("Jogo");
		lblNewLabel.setBounds(126, 41, 30, 21);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gen�ro");
		lblNewLabel_1.setBounds(109, 79, 47, 21);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Classifica��o");
		lblNewLabel_2.setBounds(69, 155, 87, 21);
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Valor");
		lblNewLabel_3.setBounds(121, 176, 35, 21);
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Plataforma");
		lblNewLabel_4.setBounds(82, 117, 74, 21);
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		contentPane.add(lblNewLabel_4);
		
		txtNome = new JTextField();
		txtNome.setBounds(191, 38, 116, 27);
		txtNome.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		add(txtNome);
		txtNome.setColumns(10);
		
		JComboBox cbxPlataforma = new JComboBox();
		cbxPlataforma.setBounds(191, 114, 140, 27);
		cbxPlataforma.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		cbxPlataforma.addItem("PC");
		cbxPlataforma.addItem("Xbox One");
		cbxPlataforma.addItem("Playstation 4");
		cbxPlataforma.addItem("Nintendo Switch");
		
		JComboBox cbxGenero = new JComboBox();
		cbxGenero.setBounds(191, 76, 108, 27);
		cbxGenero.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		cbxGenero.addItem("Suspense");
		cbxGenero.addItem("A��o");
		cbxGenero.addItem("Puzzle");
		cbxGenero.addItem("RPG");
		cbxGenero.addItem("Luta");
		cbxGenero.addItem("Light-Novel");
		cbxGenero.addItem("Aventura");

		
		contentPane.add(cbxGenero);
		
		txtValor = new JTextField();
		txtValor.setBounds(191, 173, 116, 27);
		txtValor.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		add(txtValor);
		txtValor.setColumns(10);
		
		txtClassifica��o = new JTextField();
		txtClassifica��o.setBounds(191, 152, 116, 27);
		txtClassifica��o.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		add(txtClassifica��o);
		txtClassifica��o.setColumns(10);
		
		JButton btnCadastrarJogo = new JButton("Cadastrar jogo");
		btnCadastrarJogo.setBounds(144, 247, 163, 35);
		btnCadastrarJogo.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnCadastrarJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Criar um objeto da classe jogo
				try {
					Jogo j = new Jogo();
					j.setJogo(txtNome.getText());
					j.setGenero(cbxGenero.getSelectedItem().toString());
					j.setPlataforma(cbxGenero.getSelectedItem().toString());
					j.setClassifica��o(Integer.parseInt(txtClassifica��o.getText()));
					j.setValor(Double.parseDouble(txtValor.getText()));
					
					//realizar o cadastro				
					a.Cadastrar(j);
				
					//Atualizar a tabela
					table.setModel(a.selecionar());
	
					//Mensagem
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso !!");
				}catch(Exception erro) {
					JOptionPane.showMessageDialog(null, "Erro ao cadastrar jogo");
				}
				//Limpr campos
				txtNome.setText("");
				txtValor.setText("");
				txtClassifica��o.setText("");
				cbxGenero.setSelectedIndex(0);
				cbxPlataforma.setSelectedIndex(0);
				
				//Ativar o bot�o de cadastramentio e desativar os demais
				btnCadastrarJogo.setEnabled(true);
				//btnAlterar
				//???
				
				//crusor no nome do jogo
				txtNome.requestFocus();
				
			}
		});
		btnCadastrarJogo.setBounds(10, 262, 123, 23);
		contentPane.add(btnCadastrarJogo);
		
		JLabel lblIndice = new JLabel ("pou pou pou depressivo estou");
		lblIndice.setBounds(0, 0, 48, 14);
		contentPane.add(lblIndice);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Obter o �ndice a ser alterado
				int indice = Integer.parseInt(lblIndice.getText());
				
				//Instanciar um objeto da classe jogo
				Jogo j = new Jogo();
				
				j.setJogo(txtNome.getText());
				j.setGenero(cbxGenero.getSelectedItem().toString());
				j.setPlataforma(cbxPlataforma.getSelectedItem().toString());
				j.setClasssificac�o(Integer.parseInt(txtClassifica��o.getText()));
				j.setValor(Double.parseDouble(txtValor.getText()));
				
				//Realizar a altera��o
				a.alterar(indice, j);

				//Altualizar a tabela
				table.setModel(a.selecionar());
			}
		});
		btnAlterar.setEnabled(false);
		btnAlterar.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnAlterar.setBounds(172, 293, 97, 35);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				//Obter o indice
				int indice = Integer.parseInt(lblIndice.getText());
				
				//Chamar o m�todo de exclus�o
				a.excluir(indice);
			
				
				//Atualizar Tabela
				table.setModel(a.selecionar());
				
				//Limpar os campos
				txtNome.setText("");
				cbxGenero.setSelectedIndex(0);
				cbxPlataforma.setSelectedIndex(0);
				txtClassifica��o.setText("");
				txtValor.setText("");
				lblIndice.setText("");
				
				//Cursor no campo Nome
				txtNome.requestFocus();
				
				//Mensagem
				JOptionPane.showMessageDialog(null, "Jogo exclu�do com sucesso!");
				
				
				
			}

		});
		btnExcluir.setEnabled(false);
		btnExcluir.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnExcluir.setBounds(334, 262, 123, 23);
		contentPane.add(btnExcluir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 325, 447, 188);
		contentPane.add(scrollPane);
		
		table = new JTable (a.selecionar());
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
			
				//Obter o indice selecionado
				int Indice = table.getSelectedRow();
					
				//Obtendo os dados de cada coluna
				String nome = table.getValueAt(Indice, 0).toString();
				String genero = table.getValueAt(Indice, 1).toString();
				String plataforma = table.getValueAt(Indice, 2).toString();
				int classificacao = Integer.parseInt(table.getValueAt(Indice, 3).toString());
				double valor  = Double.parseDouble(table.getValueAt(Indice, 4).toString());
				
				//Enviando dados ao formul�rio
				lblIndice.setText(String.valueOf(Indice));
				txtNome.setText(nome);
				cbxGenero.addItem(genero);
				cbxPlataforma.addItem(plataforma);
				txtClassifica��o.setText(String.valueOf(classificacao));
				txtValor.setText(String.valueOf(valor));

				
			}
		});
		btnExcluir.setEnabled(false);
		btnExcluir.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnExcluir.setBounds(289, 239, 111, 23);
		contentPane.add(btnExcluir);

		JScrollPane scrollpane = new JScrollPane();
		
		scrollpane.setBounds(10, 325, 447, 188);
		contentPane.add(scrollpane);
		
		table = new JTable(a.selecionar());
		scrollpane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				//Obter o indice selecionada
				int indice = table.getSelectedRow();
				
				//Obtendo os dados de cada coluna
				String nome = table.getValueAt(indice, 0).toString();
				String genero = table.getValueAt(indice, 1).toString();
				String plataforma = table.getValueAt(indice, 2).toString();
				int classifica��o = Integer.parseInt(table.getValueAt(indice, 3).toString());
				double valor = Double.parseDouble(table.getValueAt(indice, 4).toString());
				
				//Enviando dados ao formulario
				
				lblIndice.setText(String.valueOf(indice));
				txtNome.setText(nome);
				txtClassifica��o.setText(String.valueOf(classifica��o));
				txtValor.setText(String.valueOf(valor));
				
				switch(genero) {
				case "Suspense":
					cbxGenero.setSelectedIndex(0);
				break;
				
				case "A��o":
					cbxGenero.setSelectedIndex(1);
				break;	
				
				case "Puzzle":
					cbxGenero.setSelectedIndex(2);
				break;
				
				case "RPG":
					cbxGenero.setSelectedIndex(3);
				break;
				
				case "Luta":
					cbxGenero.setSelectedIndex(4);
				break;
				
				case "Light-Novel":
					cbxGenero.setSelectedIndex(5);
				break;
				}
				
				switch (plataforma) {
				case "PC":
					cbxPlataforma.setSelectedIndex(0);
					break;
				case "Xbox One":
					cbxPlataforma.setSelectedIndex(1);
					break;
				case "PlayStation 4":
					cbxPlataforma.setSelectedIndex(2);
					break;
				case "Nintendo Switch":
					cbxPlataforma.setSelectedIndex(3);
					break;
				}
				//Ativar bot�es de alterar e excluir e desatiar o bot�o cadastrar
				btnCadastrarJogo.setEnabled(false);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(true);
			}
		});

	}
}
