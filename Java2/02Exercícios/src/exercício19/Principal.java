package exercício19;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		String Calculo = JOptionPane.showInputDialog(null, "Você deseja saber a Vm, S ou T?");
		int S = Integer.parseInt(JOptionPane.showInputDialog("Espaço percorrido: "));
		int T = Integer.parseInt(JOptionPane.showInputDialog("Tempo da viajem: "));
		int Vm = Integer.parseInt(JOptionPane.showInputDialog("Velocidade média: "));
		
		if((Calculo.equals("Vm"))) {
			System.out.println("Vm="+S/T);
		}if((Calculo.equals("S"))) {
			System.out.println("S="+T*Vm);
		}if((Calculo.equals("T"))) {
			System.out.println("T="+S/Vm);
		}
				
				
	}

}
