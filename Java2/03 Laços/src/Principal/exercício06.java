package Principal;

import javax.swing.JOptionPane;

public class exercício06 {

	public static void main(String[] args) {
		
		Object[] sexo = {"Masculino", "Feminino"};
		String nome;
		int  Masculino = 0, Feminino = 0;
		int gen;
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double mediaTop = 0;
		double mediaBoa = 0;
		double mediaMeh = 0;
		double mediaEh = 0;
		double mediaRuim = 0;
		double mediaPutz = 0;
		
		do {
			nome = JOptionPane.showInputDialog("Nome: ");
			if(!nome.equals("sair")) {
			gen = JOptionPane.showOptionDialog(null, "Sexo: ", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sexo,0);
			switch(gen) {
			case 0:
				Masculino++;
			break;
			
			case 1:
				Feminino++;
			break;}
			
			nota1 = Double.parseDouble(JOptionPane.showInputDialog("Primeira nota: "));
			nota2 = Double.parseDouble(JOptionPane.showInputDialog("Segunda nota: "));
			nota3 = Double.parseDouble(JOptionPane.showInputDialog("Terceira nota: "));
			nota4 = Double.parseDouble(JOptionPane.showInputDialog("Quarta nota: "));
			double media = (nota1+nota2+nota3+nota4)/4;
			
			if((media == 10)) {
				mediaTop++;
			}else if((media <= 9.9) && (media >= 9)) {
				mediaBoa++;
			}else if((media <= 8.9) && (media >= 8)) {
				mediaMeh++;
			}else if((media <= 7.9) && (media >= 7)) {
				mediaEh++;
			}else if((media <= 6.9) && (media >= 5)) {
				mediaRuim++;
			}else if((media < 5)) {
				mediaPutz++;
			}
			}
	}while((!nome.equals("sair")));
		
		String resultado = "Quantidade de pessoas do sexo: ";
				resultado+= "\nMasculino: "+Masculino;
				resultado+= "\nFeminino: "+Feminino;
				JOptionPane.showMessageDialog(null, resultado);
				
		String resultad = "Quantidade de medias: ";
    	resultad+= "\nNota 10: "+mediaTop+" Aí ss gato(a)!";
    	resultad+= "\nNota 9.9 - 9: "+mediaBoa+"  Boa mano!";
    	resultad+= "\nNota 8.9 - 8: "+mediaMeh+"  Boa!";
    	resultad+= "\nNota 7.9 - 7:  "+mediaEh+"  Meh, podia se melhor!";
    	resultad+= "\nNota 6.9 - 5:  "+mediaRuim+"  Recuperação! (Ja va) estudar!!";
    	resultad+= "\nNota 5 - 0:  "+mediaPutz+"  REPROVAADOO!";
    	JOptionPane.showMessageDialog(null, resultad);		
}
}

