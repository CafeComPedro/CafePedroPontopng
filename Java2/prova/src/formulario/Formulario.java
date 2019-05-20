package formulario;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JSpinner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import acao.acao;
import prova.beans;
import java.awt.Font;

public class Formulario extends JPanel {

	private JTable table;
	/**
	 * Create the panel.
	 */
	public Formulario() {
		
		//Instanciar um objeto da classe Acao
				acao a = new acao();
		
				//Desing, window maker
		JComboBox cbxProdutos = new JComboBox();
		setLayout(null);
		
		JSpinner spnQntdM = new JSpinner();
		spnQntdM.setBounds(122, 82, 30, 20);
		add(spnQntdM);
		
		JSpinner spnQntdTom = new JSpinner();
		spnQntdTom.setBounds(247, 82, 30, 20);
		add(spnQntdTom);
		
		JSpinner spnQntdAl = new JSpinner();
		spnQntdAl.setBounds(358, 82, 30, 20);
		add(spnQntdAl);
		
		JSpinner spnQntdAç = new JSpinner();
		spnQntdAç.setBounds(122, 169, 30, 20);
		add(spnQntdAç);
		
		JSpinner spnQntdTem = new JSpinner();
		spnQntdTem.setBounds(247, 169, 30, 20);
		add(spnQntdTem);
		
		JSpinner spnQntdC = new JSpinner();
		spnQntdC.setBounds(358, 169, 30, 20);
		add(spnQntdC);
		
		
		
		JLabel lblMacarro = new JLabel("Macarr\u00E3o");
		lblMacarro.setBounds(122, 37, 45, 14);
		add(lblMacarro);
		
		JLabel lblTomate = new JLabel("Tomate");
		lblTomate.setBounds(247, 37, 37, 14);
		add(lblTomate);
		
		JLabel lblAlma = new JLabel("Alma");
		lblAlma.setFont(new Font("OCR-A BT", Font.BOLD, 14));
		lblAlma.setBounds(358, 47, 43, 24);
		add(lblAlma);
		
		JLabel lblNewLabel = new JLabel("A\u00E7ucar");
		lblNewLabel.setFont(new Font("Sylfaen", Font.ITALIC, 14));
		lblNewLabel.setBounds(122, 130, 45, 20);
		add(lblNewLabel);
		
		JLabel lblTempero = new JLabel("Tempero");
		lblTempero.setBounds(234, 130, 43, 14);
		add(lblTempero);
		
		JLabel lblCocaCola = new JLabel("Coca - cola");
		lblCocaCola.setBounds(347, 127, 54, 20);
		add(lblCocaCola);
		
		//Função no botão
		JButton btnLista = new JButton("Lista");
		btnLista.setBounds(530, 11, 55, 23);
		btnLista.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				beans c = new beans();
				c.setQntdM(Integer.parseInt(null, spnQntdM.getX()));
				c.setQntdTom(Integer.parseInt(null, spnQntdTom.getX()));
				c.setQntdAl(Integer.parseInt(null, spnQntdAl.getX()));
				c.setQntdAç(Integer.parseInt(null, spnQntdAç.getX()));
				c.setQntdTem(Integer.parseInt(null, spnQntdTem.getX()));
			}
		});
		add(btnLista);
		
		//Tabela
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(488, 37, 133, 220);
		add(scrollPane);
		
		table = new JTable(a.Listar());
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("pou pou pou triste comigo estou");
		lblNewLabel_1.setBounds(0, 0, 194, 18);
		add(lblNewLabel_1);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});
			}
	}

