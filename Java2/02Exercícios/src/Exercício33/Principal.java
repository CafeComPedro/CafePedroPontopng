package Exerc�cio33;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		String mes = JOptionPane.showInputDialog(null, "Qual � o m�s do seu anivers�rio?");
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Que dia que voc� nasceu?"));
		
		if ((mes.equals("janeiro") && (dia >= 1) && (dia <=20))){
			System.out.println("Capric�rnio!");
		}if ((mes.equals("dezembro") && (dia >= 20) && (dia <=31))){
			System.out.println("Capric�rnio!");
			
		}if ((mes.equals("janeiro") && (dia >= 21) && (dia <=31))){
				System.out.println("Aqu�rio!");
		}if ((mes.equals("fevereiro") && (dia >= 1) && (dia <=19))){
			System.out.println("Aqu�rio!");
			
	    }if ((mes.equals("fevereiro") && (dia >= 20) && (dia <= 28))){
			System.out.println("Peixes!");
	    }if((mes.equals("mar�o") && (dia >= 1) && (dia <= 20))){
			System.out.println("Peixes!");
			
	    }if ((mes.equals("mar�o") && (dia >= 21) && (dia <= 31))){
			System.out.println("�ries!");
	    }if((mes.equals("abril") && (dia >= 1) && (dia <= 20))){
			System.out.println("�ries!");
			
	    }if ((mes.equals("abril") && (dia >= 20) && (dia <= 28))){
			System.out.println("Touro!");
	    }if((mes.equals("maio") && (dia >= 1) && (dia <= 20))){
			System.out.println("Touro!");	
	    
	    }if ((mes.equals("maio") && (dia >= 20) && (dia <= 28))){
			System.out.println("G�meos!");
	    }if((mes.equals("junho") && (dia >= 1) && (dia <= 20))){
			System.out.println("G�meos!");
			
	    }if ((mes.equals("junho") && (dia >= 20) && (dia <= 28))){
			System.out.println("C�ncer!");
	    }if((mes.equals("julho") && (dia >= 1) && (dia <= 20))){
			System.out.println("C�ncer!");
			
	    }if ((mes.equals("julho") && (dia >= 20) && (dia <= 28))){
			System.out.println("C�ncer!");
	    }if((mes.equals("agosto") && (dia >= 1) && (dia <= 20))){
			System.out.println("C�ncer!");
			
	    }if ((mes.equals("agosto") && (dia >= 20) && (dia <= 28))){
			System.out.println("Le�o!");
	    }if((mes.equals("setembro") && (dia >= 1) && (dia <= 20))){
			System.out.println("Le�o!");
			
	    }if ((mes.equals("setembro") && (dia >= 20) && (dia <= 28))){
			System.out.println("Virjem!");
	    }if((mes.equals("outubro") && (dia >= 1) && (dia <= 20))){
			System.out.println("Virjem!");
			
	    }if ((mes.equals("Outubro") && (dia >= 20) && (dia <= 28))){
			System.out.println("Libra!");
	    }if((mes.equals("novembro") && (dia >= 1) && (dia <= 20))){
			System.out.println("Libra!");
			
	    }if ((mes.equals("novembro") && (dia >= 20) && (dia <= 28))){
			System.out.println("Escorpi�o!");
	    }if((mes.equals("dezembro") && (dia >= 1) && (dia <= 20))){
			System.out.println("Escorpi�o!");
		
		
	    }if((mes.equals("dezembro") && (dia >= 1) && (dia <= 20))){
	    	System.out.println("Sagit�rio!");
	    }if((mes.equals("janeiro") && (dia >= 1) && (dia <= 20))){
	        System.out.println("Sagit�rio!");
}else {
	System.out.println("Data inv�lida...");
}
	}
}
