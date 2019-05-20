package exercício31;

import javax.swing.JOptionPane;

public class Princpial {
	public static void main(String[] args) {
		
		String nome1 = JOptionPane.showInputDialog("Nome pessoa I ");
		int idade1 = Integer.parseInt(JOptionPane.showInputDialog("Idade pessoa I: "));
		String nome2 = JOptionPane.showInputDialog("Nome pessoa II: ");
		int idade2 = Integer.parseInt(JOptionPane.showInputDialog("Idade pessoa II: "));
		String nome3 = JOptionPane.showInputDialog("Nome pessoa III: ");
		int idade3 = Integer.parseInt(JOptionPane.showInputDialog("Idade pessoa III: "));
		
		if((idade1 > idade2) && (idade1 > idade3)) {
			System.out.println("Pessoa mais velha: "+ nome1 );
			System.out.println("Idade: "+ idade1);
		}else if((idade2 > idade3) && (idade2 > idade1)) {
			System.out.println("Pessoa mais velha: "+ nome2 );
			System.out.println("Idade: "+ idade2);
		}else if((idade3 > idade2) && (idade3 > idade1)) {
			System.out.println("Pessoa mais velha: "+ nome3 );
			System.out.println("Idade: "+ idade3);
		}else {
			System.out.println("como?");
		}
		
	}

}
