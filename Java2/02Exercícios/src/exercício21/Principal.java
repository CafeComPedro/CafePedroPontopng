package exercício21;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String Prod = JOptionPane.showInputDialog("Qual produto você deseja?");
		String Pagm = JOptionPane.showInputDialog("Você deseja pagar á vista, a prazo de 30 dias ou a prazo de 60 dias?");
		
		if((Prod.equals("calça")) && (Pagm.equals("vista")))  {
			System.out.println("Produto: calça");
			System.out.println("Preço: R$150,00");
		}else if((Prod.equals("camisa")) && (Pagm.equals("vista"))) {
			System.out.println("Produto: camisa");
			System.out.println("preço: R$300,00");
		}else if((Prod.equals("casaco")) && (Pagm.equals("vista"))) {
			System.out.println("Produto: casaco");
			System.out.println("preço: R$250,00");
		}else if((Prod.equals("meias")) && (Pagm.equals("vista"))) {
			System.out.println("Produto: meias");
			System.out.println("Preço: R$30,00");
		}else if((Prod.equals("paletó")) && (Pagm.equals("vista"))) {
			System.out.println("Produto: paletó");
			System.out.println("Preço: R$450,00");
		}else if((Prod.equals("calça")) && (Pagm.equals("prazo de 30 dias")))  {
			System.out.println("Produto: calça");
			System.out.println("Preço: R$165,00");
		}else if((Prod.equals("camisa")) && (Pagm.equals("prazo de 30 dias"))) {
			System.out.println("Produto: camisa");
			System.out.println("preço: R$330,00");
		}else if((Prod.equals("casaco")) && (Pagm.equals("prazo de 30 dias"))) {
			System.out.println("Produto: casaco");
			System.out.println("preço: R$275,00");
		}else if((Prod.equals("meias")) && (Pagm.equals("prazo de 30 dias"))) {
			System.out.println("Produto: meias");
			System.out.println("Preço: R$33,00");
		}else if((Prod.equals("paletó")) && (Pagm.equals("prazo de 30 dias"))) {
			System.out.println("Produto: paletó");
			System.out.println("Preço: R$495,00");
		}else if((Prod.equals("calça")) && (Pagm.equals("prazo de 60 dias")))  {
			System.out.println("Produto: calça");
			System.out.println("Preço: R$180,00");
		}else if((Prod.equals("camisa")) && (Pagm.equals("prazo de 60 dias"))) {
			System.out.println("Produto: camisa");
			System.out.println("preço: R$360,00");
		}else if((Prod.equals("casaco")) && (Pagm.equals("prazo de 60 dias"))) {
			System.out.println("Produto: casaco");
			System.out.println("preço: R$300,00");
		}else if((Prod.equals("meias")) && (Pagm.equals("prazo de 60 dias"))) {
			System.out.println("Produto: meias");
			System.out.println("Preço: R$36,00");
		}else if((Prod.equals("paletó")) && (Pagm.equals("prazo de 60 dias"))) {
			System.out.println("Produto: paletó");
			System.out.println("Preço: R$540,00");
		}else {
			JOptionPane.showMessageDialog(null, "Tente novamente");
		}
		

	}

}
