package exempo09;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Principal {

	public static void main(String[] args) {

		//Criar um formulario
		JFrame formulario = new JFrame();
		formulario.setTitle("Meu oitavo formulário");
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setVisible(true);
		
		//DefaultTableModel (englobar os dados)
		DefaultTableModel dados = new DefaultTableModel();
		dados.addColumn("nome");
		dados.addColumn("idade");
		dados.addRow(new Object[] {"Yara", "	26"});
		dados.addRow(new Object[] {"tailer", "	16"});
		dados.addRow(new Object[] {"vanessa", "	14"});
		dados.addRow(new Object[] {"carla", "	22"});

		//JTable (exibir texto)
		JTable tabela = new JTable(dados);
		
		//JScronnPane (Barra de rolagem)
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(10, 10, 465, 230);
		
		//Add formulario
		formulario.add(barraRolagem);
		
		//Exibir componentes
		formulario.setVisible(true);
	}

}
