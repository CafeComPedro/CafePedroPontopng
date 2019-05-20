package formulario;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Formulario {

//Contrutor
	public Formulario() {
		JFrame f = new JFrame("Projeto base");
		f.setSize(400, 500);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(painelCadadstro);
		f.add(painelListarDados());
		f.setVisible(true);
		
	}
	//Método de painel para cadastro
	private JPanel painelCadastro() {
		
		JPanel p = new JPanel();
		p.setBounds(10, 10, 362, 100);
		p.setLayout(null);;
		p.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		
		JLabel lblnome = new JLabel("Nome");
		lblnome.setBounds(10, 10, 100, 20);
		JLabel lblIdade = new JLabel("idade");
		lblIdade.setBounds(10, 50, 50, 20);
		JLabel lblCidade = new JLabel("Nome");
		lblCidade.setBounds(10, 90, 50, 20);

		JTextField txtNome = new JTextField();
		txtNome.setBounds(70, 10, 280, 20);
		JTextField txtIdade = new JTextField();
		txtIdade.setBounds(70, 50, 280, 20);
		JTextField txtCidade = new JTextField();
		txtCidade.setBounds(70, 90, 280, 20);

		JButton btn = new JButton("Cadastrar");
		btn.setBounds(130, 130, 100, 20);

	};
	//Método de painel para ista os dados
		private JPanel painelListarDados() {
			
			JPanel p = new JPanel();
			p.setBounds(10, 200, 362, 250);
			p.setLayout(null);
			p.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			
			JScrollPane barra = new JScrollPane(tabela());
			barra.setSize(362, 250);
			
			p.add(barra);
			return p;
		}
		
		//Metodo de tabela
		
		private JTable tabela() {
			
			//Dados
			DefaultTableModel dados = new DefaultTableModel();
			dados.addColumn("nome");
			dados.addColumn("idade");
			dados.addColumn("Cidade");
			dados.addRow(new Object[] {"Ana", 16, "Blumenau"});
			dados.addRow(new Object[] {"Douglas", 32, "Blumenau"});
			dados.addRow(new Object[] {"Rebeca", 19, "Gaspar"});

			//Tabela
			JTable tabela = new JTable(dados);
			return tabela;
			

		}
		
	}


