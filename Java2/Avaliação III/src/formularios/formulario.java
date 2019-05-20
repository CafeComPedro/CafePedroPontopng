package formularios;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument.Content;

import acao.acao;

import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class formulario extends JPanel {
	private JTextField txtColab;
	private JTextField txtSalab;
	private JTextField txtVale;
	private JTextField txtTax;
	private JTextField txtSalal;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		acao a = new acao();
		contentPane.setLayout(null);
		setLayout(null);
		
		JLabel lblFaltasNoMs = new JLabel("Faltas no m\u00EAs");
		lblFaltasNoMs.setBounds(44, 195, 68, 14);
		add(lblFaltasNoMs);
		
		txtColab = new JTextField();
		txtColab.setBounds(110, 25, 96, 20);
		add(txtColab);
		txtColab.setColumns(10);
		
		txtSalab = new JTextField();
		txtSalab.setBounds(402, 25, 96, 20);
		txtSalab.setEnabled(false);
		add(txtSalab);
		txtSalab.setColumns(10);
		
		txtVale = new JTextField();
		txtVale.setBounds(422, 104, 96, 20);
		txtVale.setEnabled(false);
		add(txtVale);
		txtVale.setColumns(10);
		
		JCheckBox cbxVale = new JCheckBox("Vale Transporte");
		cbxVale.setBounds(302, 103, 103, 23);
		add(cbxVale);
		
		
		JSpinner chckbxFaltas = new JSpinner();
		chckbxFaltas.setBounds(133, 192, 30, 20);
		add(chckbxFaltas);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(65, 69, 29, 14);
		add(lblCargo);
		
		JLabel lblImpostoDeRenda = new JLabel("Imposto de renda");
		lblImpostoDeRenda.setBounds(26, 107, 86, 14);
		add(lblImpostoDeRenda);
		
		JLabel lblSalarioLiquido = new JLabel("Salário Liquido");
		lblSalarioLiquido.setBounds(302, 69, 72, 14);
		add(lblSalarioLiquido);
		
		JCheckBox chckbxClub = new JCheckBox("Clube Fidelidade");
		chckbxClub.setBounds(187, 191, 107, 23);
		add(chckbxClub);
		
		txtTax = new JTextField();
		txtTax.setBounds(142, 104, 96, 20);
		add(txtTax);
		txtTax.setColumns(10);
		
		txtSalal = new JTextField();
		txtSalal.setBounds(412, 66, 96, 20);
		add(txtSalal);
		txtSalal.setColumns(10);
		
		JButton btnCadastrarColaborador = new JButton("Cadastrar Colaborador");
		btnCadastrarColaborador.setBounds(355, 259, 143, 23);
		add(btnCadastrarColaborador);
		
		JButton btnStatistic = new JButton("Mostrar Estatisticas");
		btnStatistic.setBounds(68, 259, 129, 23);
		add(btnStatistic);
		

		JLabel lblColaborador = new JLabel("Colaborador");
		lblColaborador.setBounds(34, 28, 60, 14);
		add(lblColaborador);
		
		JCheckBox chckbxPlanoDeSaude = new JCheckBox("Plano de saúde");
		chckbxPlanoDeSaude.setBounds(324, 191, 99, 23);
		add(chckbxPlanoDeSaude);
		
		
		JLabel lblSalrioBruto = new JLabel("Sal\u00E1rio Bruto");
		lblSalrioBruto.setBounds(302, 28, 63, 14);
		add(lblSalrioBruto);
		
		JComboBox cbxCargo = new JComboBox();
		cbxCargo.setBounds(110, 66, 159, 20);
		cbxCargo.addItem("Estagiário");					//Salab = 900   Vale = 6%   Imposto de renda=0%
		cbxCargo.addItem("Desenvolvedor Jr.");			//Salab = 1300		'		Imposto de renda=4%
		cbxCargo.addItem("Desenvolvedor Pleno");		//Salab = 1800		'		Imposto de renda=5,5%
		cbxCargo.addItem("Desenvolvedor sênior");		//Salab = 2400		'		Imposto de renda=6%
		cbxCargo.addItem("Analista de sistemas Jr.");	//Salab = 2700		'		Imposto de renda=6,5%
		cbxCargo.addItem("Anaista de sistemas Pleno");	//Salab = 3200		'		Imposto de renda=7%
		cbxCargo.addItem("Analista de sistemas Sênior");//Salab = 3600		'		Imposto de renda=7,5%
		cbxCargo.addItem("Arquiteto de Software");
		
		cbxCargo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				double salab = a.salab(cbxCargo.getSelectedIndex());
				double faltas = a.faltas(Integer.parseInt(chckbxFaltas.getValue().toString()));
						
						
				txtSalab.setText(String.valueOf(salab));
				txtSalal.setText(String.valueOf(salab+faltas));
				
			}
		});
		
		


		
	

	}

	private void setContentPane(JPanel contentPane2) {
		// TODO Auto-generated method stub
		
	}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}
}
