package exercício02;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
	int[] numeros = new int[10];
		
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
		
		System.out.println(numeros[9]);
		System.out.println(numeros[8]);
		System.out.println(numeros[7]);
		System.out.println(numeros[6]);
		System.out.println(numeros[5]);
		System.out.println(numeros[4]);
		System.out.println(numeros[3]);
		System.out.println(numeros[2]);
		System.out.println(numeros[1]);
		System.out.println(numeros[0]);
		
		
}
}