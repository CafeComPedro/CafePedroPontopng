package exercício20;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Object[] est = {"Santa Catarina", "Parana", "São Paulo"};
		int estSelc	= JOptionPane.showOptionDialog(null, "Escolha seu estado", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, est, 0);
		Object[] cidSC = {"Blumenau", "Florianópolis", "Timbó"};
		Object[] cidPR = {"Curitiba", "Maringá", "Paranagua"};
		Object[] cidSP = {"São Paulo", "Santos", "Campinas"};
		
		

		switch(estSelc) {
		case 0:
		int cidSelcSC	= JOptionPane.showOptionDialog(null, "Escolha uma cidade", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cidSC, 0);
		switch(cidSelcSC) {
		case 0:
			JOptionPane.showMessageDialog(null, "IDH: 0,855");
			JOptionPane.showMessageDialog(null, "População: 352,460");
			JOptionPane.showMessageDialog(null, "Área: 	519,837 km²");
			break;
			
		case 1:
			JOptionPane.showMessageDialog(null, "IDH: 0,847");
			JOptionPane.showMessageDialog(null, "População: 492,977");
			JOptionPane.showMessageDialog(null, "Área: 675,409 km²");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "IDH: 0,784");
			JOptionPane.showMessageDialog(null, "População: 42 045");
			JOptionPane.showMessageDialog(null, "Área: 127,405 km²");
			break;
		}break;
		
		case 1:
		int cidSelcPR = JOptionPane.showOptionDialog(null, "Escolha uma cidade", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE,  null, cidPR, 0);
		switch(cidSelcPR) {
		case 0:
			JOptionPane.showMessageDialog(null, "IDH: 0,823");
			JOptionPane.showMessageDialog(null, "População: 1.917.85");
			JOptionPane.showMessageDialog(null, "Área: 435,036 km²");
			break;
			
		case 1:
			JOptionPane.showMessageDialog(null, "IDH: 0,808");
			JOptionPane.showMessageDialog(null, "População: 417.010");
			JOptionPane.showMessageDialog(null, "Área: 487,930 km²");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "IDH: 0,750");
			JOptionPane.showMessageDialog(null, "População: 151.829");
			JOptionPane.showMessageDialog(null, "Área: 826,675 km²");
			break;
			
		}break;
		case 2:
		int cidSelcSP = JOptionPane.showOptionDialog(null, "Escolha uma cidade", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cidSP, 0);	
		switch(cidSelcSP) {
		case 0:
			JOptionPane.showMessageDialog(null, "IDH: 0,805");
			JOptionPane.showMessageDialog(null, "População 12.176.866");
			JOptionPane.showMessageDialog(null, "Área: 1.521,11 km²");
			break;
			
		case 1:
			JOptionPane.showMessageDialog(null, "IDH: 0,840");
			JOptionPane.showMessageDialog(null, "População: 434.742");
			JOptionPane.showMessageDialog(null, "Área: 280,674 km²");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "IDH: 0,805");
			JOptionPane.showMessageDialog(null, "População: 1.194.094");
			JOptionPane.showMessageDialog(null, "Área: 797,6 km²");
			break;
		}break;
		
		}
	}

}
