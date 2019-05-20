package exercício09;

import javax.swing.JOptionPane; 

public class Principal {

	public static void main(String[] args) {

	int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
	int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
		
		if((num1 < num2)) {					
			do {	
				System.out.println(num1);	
				num1++;		
				
				System.out.println(num2);
				num2--;
			}while (num1 > num2);
			
    	}else if ((num1 > num2)) {
			do {
				
				System.out.println(num2);
				num2++;
				
				System.out.println(num1 );
				num1--;
			}while (num2 < num1);
			}
}
}


