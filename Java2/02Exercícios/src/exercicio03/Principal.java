package exercicio03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double nota1 = Integer.parseInt(JOptionPane.showInputDialog("Qual sua 1 Nota?"));
		double nota2 = Integer.parseInt(JOptionPane.showInputDialog("Qual sua 2 Nota?"));
		double nota3 = Integer.parseInt(JOptionPane.showInputDialog("Qual sua 3 Nota"));
		double nota4 = Integer.parseInt(JOptionPane.showInputDialog("Qual sua 4 Nota"));
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		JOptionPane.showMessageDialog(null, media);
		
		if(media >= 7) {
			JOptionPane.showMessageDialog(null, "Parabens, Aprovado!");
		
		}
		if (media >=5 && media <= 6.9) {
			JOptionPane.showMessageDialog(null, "EM EXAME VAI ESTUDAR!");
		}
		if (media <= 5) {
			JOptionPane.showMessageDialog(null, "Reprovado, tenta de novo ano que vem.");
		}
	}

}