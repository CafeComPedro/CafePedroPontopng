package Formulario;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Principal extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Principal() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(106, 57, 243, 23);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 115, 243, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(159, 162, 89, 23);
		add(btnNewButton);

	}
}
