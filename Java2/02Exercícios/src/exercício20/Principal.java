package exerc�cio20;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Object[] est = {"Santa Catarina", "Parana", "S�o Paulo"};
		int estSelc	= JOptionPane.showOptionDialog(null, "Escolha seu estado", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, est, 0);
		Object[] cidSC = {"Blumenau", "Florian�polis", "Timb�"};
		Object[] cidPR = {"Curitiba", "Maring�", "Paranagua"};
		Object[] cidSP = {"S�o Paulo", "Santos", "Campinas"};
		
		

		switch(estSelc) {
		case 0:
		int cidSelcSC	= JOptionPane.showOptionDialog(null, "Escolha uma cidade", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cidSC, 0);
		switch(cidSelcSC) {
		case 0:
			JOptionPane.showMessageDialog(null, "IDH: 0,855");
			JOptionPane.showMessageDialog(null, "Popula��o: 352,460");
			JOptionPane.showMessageDialog(null, "�rea: 	519,837 km�");
			break;
			
		case 1:
			JOptionPane.showMessageDialog(null, "IDH: 0,847");
			JOptionPane.showMessageDialog(null, "Popula��o: 492,977");
			JOptionPane.showMessageDialog(null, "�rea: 675,409 km�");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "IDH: 0,784");
			JOptionPane.showMessageDialog(null, "Popula��o: 42 045");
			JOptionPane.showMessageDialog(null, "�rea: 127,405 km�");
			break;
		}break;
		
		case 1:
		int cidSelcPR = JOptionPane.showOptionDialog(null, "Escolha uma cidade", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE,  null, cidPR, 0);
		switch(cidSelcPR) {
		case 0:
			JOptionPane.showMessageDialog(null, "IDH: 0,823");
			JOptionPane.showMessageDialog(null, "Popula��o: 1.917.85");
			JOptionPane.showMessageDialog(null, "�rea: 435,036 km�");
			break;
			
		case 1:
			JOptionPane.showMessageDialog(null, "IDH: 0,808");
			JOptionPane.showMessageDialog(null, "Popula��o: 417.010");
			JOptionPane.showMessageDialog(null, "�rea: 487,930 km�");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "IDH: 0,750");
			JOptionPane.showMessageDialog(null, "Popula��o: 151.829");
			JOptionPane.showMessageDialog(null, "�rea: 826,675 km�");
			break;
			
		}break;
		case 2:
		int cidSelcSP = JOptionPane.showOptionDialog(null, "Escolha uma cidade", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cidSP, 0);	
		switch(cidSelcSP) {
		case 0:
			JOptionPane.showMessageDialog(null, "IDH: 0,805");
			JOptionPane.showMessageDialog(null, "Popula��o 12.176.866");
			JOptionPane.showMessageDialog(null, "�rea: 1.521,11 km�");
			break;
			
		case 1:
			JOptionPane.showMessageDialog(null, "IDH: 0,840");
			JOptionPane.showMessageDialog(null, "Popula��o: 434.742");
			JOptionPane.showMessageDialog(null, "�rea: 280,674 km�");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "IDH: 0,805");
			JOptionPane.showMessageDialog(null, "Popula��o: 1.194.094");
			JOptionPane.showMessageDialog(null, "�rea: 797,6 km�");
			break;
		}break;
		
		}
	}

}
