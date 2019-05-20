package exercício23;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int peso = Integer.parseInt(JOptionPane.showInputDialog("Seu peso:"));
		double alt = 1.80; 
		double IMC = peso/Math.pow(alt,alt);
		
		if((IMC < 17)) {
			System.out.println("MUITO abaixo do peso D:");
		}if((IMC >= 17) && (IMC <= 18.49)) {
			System.out.println("Abaixo do peso :(");
		}if((IMC >= 18.5) && (IMC <= 24.99)) {
			System.out.println("Peso normal :D");
		}if((IMC >= 25) && (IMC <= 29.99)) {
			System.out.println("Acima do peso :/");
		}if((IMC >= 30) && (IMC <= 34.99)) {
			System.out.println("Obesidade I :(");
		}if((IMC >= 35) && (IMC <= 39.99)) {
			System.out.println("Obesidade II D:");
		}if((IMC >= 40)) {
			System.out.println("Obesidade III D':");
		}
				

	}

}
