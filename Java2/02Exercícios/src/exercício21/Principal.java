package exerc�cio21;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String Prod = JOptionPane.showInputDialog("Qual produto voc� deseja?");
		String Pagm = JOptionPane.showInputDialog("Voc� deseja pagar � vista, a prazo de 30 dias ou a prazo de 60 dias?");
		
		if((Prod.equals("cal�a")) && (Pagm.equals("vista")))  {
			System.out.println("Produto: cal�a");
			System.out.println("Pre�o: R$150,00");
		}else if((Prod.equals("camisa")) && (Pagm.equals("vista"))) {
			System.out.println("Produto: camisa");
			System.out.println("pre�o: R$300,00");
		}else if((Prod.equals("casaco")) && (Pagm.equals("vista"))) {
			System.out.println("Produto: casaco");
			System.out.println("pre�o: R$250,00");
		}else if((Prod.equals("meias")) && (Pagm.equals("vista"))) {
			System.out.println("Produto: meias");
			System.out.println("Pre�o: R$30,00");
		}else if((Prod.equals("palet�")) && (Pagm.equals("vista"))) {
			System.out.println("Produto: palet�");
			System.out.println("Pre�o: R$450,00");
		}else if((Prod.equals("cal�a")) && (Pagm.equals("prazo de 30 dias")))  {
			System.out.println("Produto: cal�a");
			System.out.println("Pre�o: R$165,00");
		}else if((Prod.equals("camisa")) && (Pagm.equals("prazo de 30 dias"))) {
			System.out.println("Produto: camisa");
			System.out.println("pre�o: R$330,00");
		}else if((Prod.equals("casaco")) && (Pagm.equals("prazo de 30 dias"))) {
			System.out.println("Produto: casaco");
			System.out.println("pre�o: R$275,00");
		}else if((Prod.equals("meias")) && (Pagm.equals("prazo de 30 dias"))) {
			System.out.println("Produto: meias");
			System.out.println("Pre�o: R$33,00");
		}else if((Prod.equals("palet�")) && (Pagm.equals("prazo de 30 dias"))) {
			System.out.println("Produto: palet�");
			System.out.println("Pre�o: R$495,00");
		}else if((Prod.equals("cal�a")) && (Pagm.equals("prazo de 60 dias")))  {
			System.out.println("Produto: cal�a");
			System.out.println("Pre�o: R$180,00");
		}else if((Prod.equals("camisa")) && (Pagm.equals("prazo de 60 dias"))) {
			System.out.println("Produto: camisa");
			System.out.println("pre�o: R$360,00");
		}else if((Prod.equals("casaco")) && (Pagm.equals("prazo de 60 dias"))) {
			System.out.println("Produto: casaco");
			System.out.println("pre�o: R$300,00");
		}else if((Prod.equals("meias")) && (Pagm.equals("prazo de 60 dias"))) {
			System.out.println("Produto: meias");
			System.out.println("Pre�o: R$36,00");
		}else if((Prod.equals("palet�")) && (Pagm.equals("prazo de 60 dias"))) {
			System.out.println("Produto: palet�");
			System.out.println("Pre�o: R$540,00");
		}else {
			JOptionPane.showMessageDialog(null, "Tente novamente");
		}
		

	}

}
