package exerc�cio09;

import javax.swing.JOptionPane;

public class Principal {public static void main(String[] args) {
	int numero1 = Integer.parseInt(JOptionPane.showInputDialog("N�mero 1"));
	int numero2 = Integer.parseInt(JOptionPane.showInputDialog("N�mero 2"));
	int numero3 = Integer.parseInt(JOptionPane.showInputDialog("N�mero 3"));
	
	if((numero1 < numero2) && (numero1 < numero3)) {
		System.out.println(numero1);
	}if((numero2 < numero1) && (numero2 < numero3)) {
		System.out.println(numero2);
	}if((numero3 < numero1) && (numero3 < numero2)) {
		System.out.println(numero3);
	}
}	
}
