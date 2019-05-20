package exercício04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
	 String[] gabarito = new String[10];
	 int indice = 0;
	 boolean valida;
	 
	 while(indice < 10) {
		 valida = false;
		 while(valida == false) {
			 gabarito[indice] = JOptionPane.showInputDialog(indice+1);
			 if ((gabarito[indice].equals("a")) || (gabarito[indice].equals("b")) || (gabarito[indice].equals("c")) || (gabarito[indice].equals("d")));
			 valida = true;
		 			}} 
	 
}
}
