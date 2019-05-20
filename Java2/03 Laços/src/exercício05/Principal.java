package exercício05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String prod = JOptionPane.showInputDialog(null, "Digite o seu produto: ");
		int preç = Integer.parseInt(JOptionPane.showInputDialog("Digite o preço do produto: "));
		double prom1 = preç - (preç*0.05);
		double prom2 = preç - (preç*0.10);
		double prom3 = preç - (preç*0.15);
		double prom4 = preç - (preç*0.20);
		double prom5 = preç - (preç*0.25);
		double prom6 = preç - (preç*0.30);
		double prom7 = preç - (preç*0.35);
		double prom8 = preç - (preç*0.40);
		double prom9 = preç - (preç*0.45);
		double prom10 = preç - (preç*0.50);
		
		System.out.println("Produto: "+prod);
		System.out.println("");
		System.out.println("Preço de seu produto: R$"+preç);
		System.out.println("");
		System.out.println("Promoções: ");
		System.out.println("1x: R$"+prom1+" | Total: "+1*prom1);
		System.out.println("2x: R$"+prom2+" | Total: "+2*prom2);
		System.out.println("3x: R$"+prom3+" | Total: "+3*prom3);
		System.out.println("4x: R$"+prom4+" | Total: "+4*prom4);
		System.out.println("5x: R$"+prom5+" | Total: "+5*prom5);
		System.out.println("6x: R$"+prom6+" | Total: "+6*prom6);
		System.out.println("7x: R$"+prom7+" | Total: "+7*prom7);
		System.out.println("8x: R$"+prom8+" | Total: "+8*prom8);
		System.out.println("9x: R$"+prom9+" | Total: "+9*prom9);
		System.out.println("10x: R$"+prom10+" | Total: "+10*prom10);
		
		
		
				
				

	}

}
