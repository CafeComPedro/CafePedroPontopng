package exercicio04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String produto = JOptionPane.showInputDialog(null, "Qual � o seu produto?");
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Qual � o valor produto?"));
		String pagamento = JOptionPane.showInputDialog(null, "Qual � a forma de pagamento?");
		
		if((pagamento.equals("vista")) && (valor > 500)) {
			System.out.println("Desconto de 10% - R$"+valor*0.9);			
		}else {
			System.out.println("Sem desconto - R$"+valor);
		}
		
			
	
	}

}
