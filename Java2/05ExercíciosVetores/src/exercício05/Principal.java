package exerc�cio05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
int[] numeros = new int[15];
		
		numeros[0] = Integer.parseInt(JOptionPane.showInputDialog("1 numero"));
		numeros[1] = Integer.parseInt(JOptionPane.showInputDialog("2 numero"));
		numeros[2] = Integer.parseInt(JOptionPane.showInputDialog("3 numero"));
		numeros[3] = Integer.parseInt(JOptionPane.showInputDialog("4 numero"));
		numeros[4] = Integer.parseInt(JOptionPane.showInputDialog("5 numero"));
		numeros[5] = Integer.parseInt(JOptionPane.showInputDialog("6 numero"));
		numeros[6] = Integer.parseInt(JOptionPane.showInputDialog("7 numero"));
		numeros[7] = Integer.parseInt(JOptionPane.showInputDialog("8 numero"));
		numeros[8] = Integer.parseInt(JOptionPane.showInputDialog("9 numero"));
		numeros[9] = Integer.parseInt(JOptionPane.showInputDialog("10 numero"));		
		numeros[10] = Integer.parseInt(JOptionPane.showInputDialog("11 numero"));
		numeros[11] = Integer.parseInt(JOptionPane.showInputDialog("12 numero"));
		numeros[12] = Integer.parseInt(JOptionPane.showInputDialog("13 numero"));
		numeros[13] = Integer.parseInt(JOptionPane.showInputDialog("14 numero"));
		numeros[14] = Integer.parseInt(JOptionPane.showInputDialog("15 numero"));
		int Soma = numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4]+numeros[5]+numeros[6]+numeros[7]+numeros[8]+numeros[9]+numeros[10]+numeros[11]+numeros[12]+numeros[13]+numeros[14];
		double Media = Soma/15;
		int NumerosMedia = 0, MaiorMedia = 0, NumerosNeg = 0, NumerosPos = 0, NumerosNeu = 0, MaiorNum=0, MenorNum=0, par = 0, impar = 0;
		
		for(int i=0; i<15; i++) {
			if (numeros[i] > Media) {
			MaiorMedia++;
			}
			if (numeros[i] == Media) {
				NumerosMedia++;
			}
			if (numeros[i] < 0) {
				NumerosNeg++;
			}
			if (numeros[i] > 0) {
				NumerosPos++;
			}
			if (numeros[i] == 0) {
				NumerosNeu++;
			}
			if(MaiorNum < numeros[i]) {
				MaiorNum=numeros[i];
			}
			if (MenorNum > numeros[i]) {
				MenorNum=numeros[i];
			}
			if(numeros[i] % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Soma: \n"+Soma);
		JOptionPane.showMessageDialog(null, "Media: \n"+Media);
		JOptionPane.showMessageDialog(null, "N�meros iguais que a m�dia: \n"+NumerosMedia+"\n");
		JOptionPane.showMessageDialog(null, "N�meros maiores a m�dia: \n"+MaiorMedia+"\n");
		JOptionPane.showMessageDialog(null, "Numeros Negativos: \n"+NumerosNeg);
		JOptionPane.showMessageDialog(null, "N�meros Positivos: \n"+NumerosPos);
		JOptionPane.showMessageDialog(null, "N�meros Neutros: \n"+NumerosNeu);
		JOptionPane.showMessageDialog(null, "Maior n�mero: \n"+MaiorNum);
		JOptionPane.showMessageDialog(null, "Menor n�mero: \n"+MenorNum);
		JOptionPane.showMessageDialog(null, "N�meros pares: \n"+par);
		JOptionPane.showMessageDialog(null, "N�meros impares: \n"+impar);
}
}


