import javax.swing.JOptionPane;

public class exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//vetor ou Array = Variavel que engloba varios dados
		String[] nomes = new String[3];
		
		//Obter os 3 nomes
		nomes[0] = JOptionPane.showInputDialog("1 nome");
		nomes[1] = JOptionPane.showInputDialog("2 nome");
		nomes[2] = JOptionPane.showInputDialog("3 nome");
		
		
		//Exibir os três nomes
		JOptionPane.showMessageDialog(null, nomes[0]);
		JOptionPane.showMessageDialog(null, nomes[1]);
		JOptionPane.showMessageDialog(null, nomes[2]);
	}

}
