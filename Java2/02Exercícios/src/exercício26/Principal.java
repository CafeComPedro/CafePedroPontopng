package exercício26;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
		
		if((idade >= 0) && (idade <= 4)) {
			System.out.println("Idade bebê");
		}else if((idade >= 5) && (idade <= 11)) {
			System.out.println("Idade criança");
		}else if((idade >= 12) && (idade <= 14)) {
			System.out.println("Idade adolescente");
		}else if((idade >= 15) && (idade <= 30)) {
			System.out.println("Idade jovem");
		}else if((idade >= 31) && (idade <= 45)) {
			System.out.println("Idade madura");
		}else if((idade >= 46) && (idade <= 60)) {
			System.out.println("Idade adulto");
		}else if((idade >= 61) && (idade <= 75)) {
			System.out.println("Idade do idoso I");
		}else if((idade >= 76) && (idade <= 90)) {
			System.out.println("Idade do idoso II");
		}else if((idade > 90)) {
			System.out.println("Idade do idoso III");
		}

	}

}
