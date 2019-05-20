package exercício02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		
		//Variaveis
				int limiteMinimo = 0;
				int limiteMaximo = 100;
				int advinho;
				int tentativas = 0;
				
				//Gerar random (Irá gerar um número random quebrado)
				double ran =  Math.random();
				
				//Atribuir um numero entre 0 e 100
				int numero = (int) Math.round(limiteMinimo + ran * limiteMaximo);
												
			do {
				tentativas++;
				//System.out.println(numero);
			advinho = Integer.parseInt(JOptionPane.showInputDialog("Tente adivinhar o numero!!"));

			if ((advinho <= numero+10 ) && (advinho > numero) && (advinho > numero+1) || (advinho >= numero-10) && (advinho < numero) && (advinho < numero-1)) {
				JOptionPane.showMessageDialog(null, "Ta perto meu mano");
			}else if ((advinho <= numero+20 ) && (advinho > numero+10) || (advinho >= numero-20) && (advinho < numero-10)) {
				JOptionPane.showMessageDialog(null, "Ta meio longe");
			}else if ((advinho > numero+20) || (advinho < numero-20)) {
				JOptionPane.showMessageDialog(null, "Ta muito longe");
			}else if ((advinho == numero+1) || (advinho == numero-1)) {
				JOptionPane.showMessageDialog(null, "TA DO LADO");
			}
							
	}while((advinho > numero) || (advinho < numero));

		if((tentativas == 1)) {
			JOptionPane.showMessageDialog(null, "DE PRIMA");
		}else if((tentativas > 1) && (tentativas <= 5)) {
			JOptionPane.showMessageDialog(null, "boa boa");
		}else if((tentativas > 5) && (tentativas <= 10)) {
			JOptionPane.showMessageDialog(null, "pelo menos vc acertou");
		}else if((tentativas > 10) && (tentativas <= 20)) {
			JOptionPane.showMessageDialog(null, "paciencia é uma dadiva");
		}else if((tentativas > 20)) {
			JOptionPane.showMessageDialog(null, "pelamor men");
		}	
}
}
