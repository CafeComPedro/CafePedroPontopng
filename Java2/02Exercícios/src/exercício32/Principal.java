package exerc�cio32;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		int or� = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu or�amento?"));
		
	if((or� > 0)) {
		System.out.println(or�*0.05+or�);
		System.out.println(or�*0.1+or�);
		System.out.println(or�*0.2+or�);
		System.out.println(or�*0.3+or�);
		System.out.println(or�*0.4+or�);
		System.out.println(or�*0.5+or�);
	}
	}

}
