package formularios;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import acao.acao;
import beans.jogo;
import beans.jogo;
import principal.Principal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtValor;
	private JTextField txtClassificacao;
	private JTable table;

	public FormularioPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Instanciar um objeto da classe Acao
		acao a = new acao();
		
		JLabel lblNomeDoJogo = new JLabel("Nome do Jogo ");
		lblNomeDoJogo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNomeDoJogo.setBounds(10, 23, 123, 25);
		contentPane.add(lblNomeDoJogo);
		
		JLabel lblGnero = new JLabel("G�nero");
		lblGnero.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblGnero.setBounds(10, 74, 123, 25);
		contentPane.add(lblGnero);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblValor.setBounds(10, 214, 123, 25);
		contentPane.add(lblValor);
		
		JLabel lblCk = new JLabel("Classifica��o");
		lblCk.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblCk.setBounds(10, 167, 123, 25);
		contentPane.add(lblCk);
		
		txtNome = new JTextField();
		txtNome.setBounds(143, 27, 314, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(143, 218, 314, 20);
		contentPane.add(txtValor);
		
		txtClassificacao = new JTextField();
		txtClassificacao.setColumns(10);
		txtClassificacao.setBounds(143, 171, 314, 20);
		contentPane.add(txtClassificacao);
		
		JLabel lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblPlataforma.setBounds(10, 117, 123, 25);
		contentPane.add(lblPlataforma);
		
		JComboBox cbxGenero = new JComboBox();
		cbxGenero.addItem("A��o");
		cbxGenero.addItem("Aventura");
		cbxGenero.addItem("Suspense");
		
		cbxGenero.setBounds(143, 77, 314, 22);
		contentPane.add(cbxGenero);
		
		JComboBox cbxPlataforma = new JComboBox();
		cbxPlataforma.setBounds(143, 120, 314, 22);
		cbxPlataforma.addItem("PC");
		cbxPlataforma.addItem("Xbox One");
		cbxPlataforma.addItem("Playstation 4");

		
		
		contentPane.add(cbxPlataforma);
		
		
		JButton btnCadastrar = new JButton("Cadastrar\r\n");
		btnCadastrar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//Criar um objeto da classe jogo
			try {
				jogo j = new jogo();
				j.setNomeJogo(txtNome.getText());
				j.setGenero(cbxGenero.getSelectedItem().toString());
				j.setPlataforma(cbxPlataforma.getSelectedItem().toString());
				j.setClasssificac�o(Integer.parseInt(txtClassificacao.getText()));
				j.setValor(Double.parseDouble(txtValor.getText()));
			
			//Instanciar um objeto da classe Acao e realizar o cadastro
				a.cadastrar(j);
			
				//Atualizar a tabela
				table.setModel(a.selecionar());
			
				//Mensagem
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso !!");
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null, "Falha ao cadastrar, tente novamente");
			}
				
			
			//Limpar os campos
				txtNome.setText("");
				cbxGenero.setSelectedIndex(0);
				cbxPlataforma.setSelectedIndex(0);
				txtClassificacao.setText("");
				txtValor.setText("");
				
				//Cursor no campo nome jogo
				txtNome.requestFocus();
			
				
			}
		});
		btnCadastrar.setBounds(10, 262, 123, 23);
		contentPane.add(btnCadastrar);
		
		JLabel lblIndic = new JLabel("");
		lblIndic.setBounds(0, 0, 48, 14);
		contentPane.add(lblIndic);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Obter o �ndice a ser alterado
				int indice = Integer.parseInt(lblIndic.getText());
			
				//Instanciar um objeto da classe jogo
				jogo j = new jogo();
				
				j.setNomeJogo(txtNome.getText());
				j.setGenero(cbxGenero.getSelectedItem().toString());
				j.setPlataforma(cbxPlataforma.getSelectedItem().toString());
				j.setClasssificac�o(Integer.parseInt(txtClassificacao.getText()));
				j.setValor(Double.parseDouble(txtValor.getText()));
				
				//Realizar a altera��o
				a.alterar(indice, j);

				//Altualizar a tabela
				table.setModel(a.selecionar());
			}
		});
		btnAlterar.setEnabled(false);
		btnAlterar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnAlterar.setBounds(176, 262, 123, 23);
		contentPane.add(btnAlterar);
		
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Obter o indice
				int indice = Integer.parseInt(lblIndic.getText());
				
				//Chamar o m�todo de exclus�o
				a.excluir(indice);
			
				
				//Atualizar Tabela
				table.setModel(a.selecionar());
				
				//Limpar os campos
				txtNome.setText("");
				cbxGenero.setSelectedIndex(0);
				cbxPlataforma.setSelectedIndex(0);
				txtClassificacao.setText("");
				txtValor.setText("");
				lblIndic.setText("");
				
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
		
		table = new JTable(a.selecionar());
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
			
				//Obter o �ndice selecionado
				int indice = table.getSelectedRow();
				
				
				//Obtendo os dados de cada coluna
				String nome = table.getValueAt(indice, 0).toString();
				String genero = table.getValueAt(indice, 1).toString();
				String plataforma = table.getValueAt(indice, 2).toString();
				int classificacao = Integer.parseInt(table.getValueAt(indice, 3).toString());
				double valor  = Double.parseDouble(table.getValueAt(indice, 4).toString());
				
				
				
				//Enviando dados ao formul�rio
				lblIndic.setText(String.valueOf(indice));
				txtNome.setText(nome);
				cbxGenero.addItem(genero);
				cbxPlataforma.addItem(plataforma);
				txtClassificacao.setText(String.valueOf(classificacao));
				txtValor.setText(String.valueOf(valor));
				
				
				switch(genero) {
				case "A��o":
					cbxGenero.setSelectedIndex(0);
				case "Aventura":
					cbxGenero.setSelectedIndex(1);
				case "Suspense":
					cbxGenero.setSelectedIndex(2);		
				}
				
				switch(plataforma) {
				case "PC":
					cbxPlataforma.setSelectedIndex(0);
				case "Xbox One":
					cbxPlataforma.setSelectedIndex(1);
				case "Playstation 4":
					cbxPlataforma.setSelectedIndex(2);		
				}
				
				
				//Ativar bot�es de alterar e excluir e desatiar o bot�o cadastrar
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
				
			}
		});

	}
}
