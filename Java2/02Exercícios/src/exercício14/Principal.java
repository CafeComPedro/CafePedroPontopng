package exercício14;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Valor do veículo: "));
		double valordis = valor*0.05;
		double valordis2 = valor*0.10;
		double valordis3 = valor*0.15;
		double valorimp = valor*0.15;
		double valorimp2 = valor*0.20;
		
		
		if((valor < 12000)) {
			System.out.println(valor - valordis);
		}if((valor >= 12000) && ( valor <= 25000)) {
			System.out.println(valor - valordis2 - valorimp);
		}if((valor > 25000)) {
			System.out.println(valor - valordis3 - valorimp2);
		}
		
	}

}
