package exerc�cio01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		//Array #2
		int[] numeros1 = new int[10];
		int[] numeros2 = new int [10];
				
		for(int i=0; i<10; i++) {
			numeros1[i] = Integer.parseInt(JOptionPane.showInputDialog("linha "+i+"   coluna "+0));
			numeros2[i] = Integer.parseInt(JOptionPane.showInputDialog("linha "+i+"   coluna "+1));		
		}
		
		
		
		int conta;
		conta = Integer.parseInt(JOptionPane.showInputDialog("Qual conta voc� deseja realizar?\n"+"1)Soma\n"+"2)Subtra��o\n"+"3)Divis�o\n"+"4)Multiplica��o\n"));
		
		 if((conta == 1)) {
			for(int i=0; i<10; i++)
			System.out.println(numeros1[i] + numeros2[i]);
		}else if((conta == 2)) {
			for(int i=0; i<10; i++)
				System.out.println(numeros1[i] - numeros2[i]);
		}else if((conta == 3)) {
			for(int i=0; i<10; i++)
				System.out.println(numeros1[i] / numeros2[i]);
		}else if((conta == 4)) {
			for(int i=0; i<10; i++)
				System.out.println(numeros1[i] * numeros2[i]);
		}
			
	
		
}
}
