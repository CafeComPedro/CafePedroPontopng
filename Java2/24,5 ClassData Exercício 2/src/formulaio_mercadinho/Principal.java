package formulaio_mercadinho;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class Principal extends JPanel{
	public static Object vetorProdutos;
	private JTextField textNome;
	private JTextField txtQuantidade;
	private JTextField txtValor;

	/**
	 * Create the panel.
	 */
	public Principal() {
		setLayout(null);
		
		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblProduto.setBounds(42, 42, 88, 28);
		add(lblProduto);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		textNome.setBounds(145, 46, 274, 28);
		add(textNome);
		textNome.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblQuantidade.setBounds(10, 81, 120, 28);
		add(lblQuantidade);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		txtQuantidade.setBounds(145, 81, 274, 28);
		add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		txtValor.setBounds(145, 120, 274, 28);
		add(txtValor);
		txtValor.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblValor.setBounds(70, 120, 60, 28);
		add(lblValor);

	}
}
