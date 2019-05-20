package Exercício33;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		String mes = JOptionPane.showInputDialog(null, "Qual é o mês do seu aniversário?");
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Que dia que você nasceu?"));
		
		if ((mes.equals("janeiro") && (dia >= 1) && (dia <=20))){
			System.out.println("Capricórnio!");
		}if ((mes.equals("dezembro") && (dia >= 20) && (dia <=31))){
			System.out.println("Capricórnio!");
			
		}if ((mes.equals("janeiro") && (dia >= 21) && (dia <=31))){
				System.out.println("Aquário!");
		}if ((mes.equals("fevereiro") && (dia >= 1) && (dia <=19))){
			System.out.println("Aquário!");
			
	    }if ((mes.equals("fevereiro") && (dia >= 20) && (dia <= 28))){
			System.out.println("Peixes!");
	    }if((mes.equals("março") && (dia >= 1) && (dia <= 20))){
			System.out.println("Peixes!");
			
	    }if ((mes.equals("março") && (dia >= 21) && (dia <= 31))){
			System.out.println("Áries!");
	    }if((mes.equals("abril") && (dia >= 1) && (dia <= 20))){
			System.out.println("Áries!");
			
	    }if ((mes.equals("abril") && (dia >= 20) && (dia <= 28))){
			System.out.println("Touro!");
	    }if((mes.equals("maio") && (dia >= 1) && (dia <= 20))){
			System.out.println("Touro!");	
	    
	    }if ((mes.equals("maio") && (dia >= 20) && (dia <= 28))){
			System.out.println("Gêmeos!");
	    }if((mes.equals("junho") && (dia >= 1) && (dia <= 20))){
			System.out.println("Gêmeos!");
			
	    }if ((mes.equals("junho") && (dia >= 20) && (dia <= 28))){
			System.out.println("Câncer!");
	    }if((mes.equals("julho") && (dia >= 1) && (dia <= 20))){
			System.out.println("Câncer!");
			
	    }if ((mes.equals("julho") && (dia >= 20) && (dia <= 28))){
			System.out.println("Câncer!");
	    }if((mes.equals("agosto") && (dia >= 1) && (dia <= 20))){
			System.out.println("Câncer!");
			
	    }if ((mes.equals("agosto") && (dia >= 20) && (dia <= 28))){
			System.out.println("Leão!");
	    }if((mes.equals("setembro") && (dia >= 1) && (dia <= 20))){
			System.out.println("Leão!");
			
	    }if ((mes.equals("setembro") && (dia >= 20) && (dia <= 28))){
			System.out.println("Virjem!");
	    }if((mes.equals("outubro") && (dia >= 1) && (dia <= 20))){
			System.out.println("Virjem!");
			
	    }if ((mes.equals("Outubro") && (dia >= 20) && (dia <= 28))){
			System.out.println("Libra!");
	    }if((mes.equals("novembro") && (dia >= 1) && (dia <= 20))){
			System.out.println("Libra!");
			
	    }if ((mes.equals("novembro") && (dia >= 20) && (dia <= 28))){
			System.out.println("Escorpião!");
	    }if((mes.equals("dezembro") && (dia >= 1) && (dia <= 20))){
			System.out.println("Escorpião!");
		
		
	    }if((mes.equals("dezembro") && (dia >= 1) && (dia <= 20))){
	    	System.out.println("Sagitário!");
	    }if((mes.equals("janeiro") && (dia >= 1) && (dia <= 20))){
	        System.out.println("Sagitário!");
}else {
	System.out.println("Data inválida...");
}
	}
}
