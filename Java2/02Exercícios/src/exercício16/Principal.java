package exercício16;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		int cod =Integer.parseInt(JOptionPane.showInputDialog("Digite o código de seu produto: "));
	    int valor = Integer.parseInt(JOptionPane.showInputDialog("Pagamento do cliente:"));
	    
	    if ((cod == 1) && (valor >= 5)) {
	    	System.out.println("código:"+cod );
	    	System.out.println("R$5,00");
	    	System.out.println(valor - 5);
	    }if ((cod == 2) && (valor >= 4.5)) {
	    	System.out.println(cod);
	    	System.out.println("R$4,50");
	    	System.out.println(valor - 4.5);
	    }if ((cod == 3) && (valor >= 8)) {
	    	System.out.println("código:"+cod);
	    	System.out.println("R$8,00");
	    	System.out.println(valor - 8);
	    }if ((cod == 4) && (valor >= 12)) {
	    	System.out.println("código:"+cod);
	    	System.out.println("R$12,00");
	    	System.out.println(valor - 12);
	    }if ((cod == 5) && (valor >= 16.5)) {
	    	System.out.println("código:"+cod);
	    	System.out.println("R$16,00");
	    	System.out.println(valor - 16.5);
	    }if ((cod == 6) && (valor >= 1)) {
	    	System.out.println("código:"+cod);
	    	System.out.println("R$1,00");
	    	System.out.println(valor - 1);
	    }if ((cod == 7) && (valor >= 2.5)) {
	    	System.out.println("código:"+cod);
	    	System.out.println("R$2,50");
	    	System.out.println(valor - 2.5);
	    }
}
}
