package exerc�cio29;

import javax.swing.JOptionPane;

public class Principla {
	public static void main(String[] args) {
		
	

	
	Object[] pais = {"Europa", "�sia", "Am�rica"};
	int paisSelc = JOptionPane.showOptionDialog(null, "Escolha um continente", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, pais, 0);
	int hora = Integer.parseInt(JOptionPane.showInputDialog("Que horas s�o?"));
	
	
	switch(paisSelc) { 
	
	case 0:
	JOptionPane.showMessageDialog(null, hora +4 + ":00 na Europa");
	break;
	
	case 1:
	JOptionPane.showMessageDialog(null, hora +11 + ":00 a �sia");
	break;
	
	case 2:
	JOptionPane.showMessageDialog(null, hora +2 + ":00 na Am�rica");
	break;
	
	}
}
}	