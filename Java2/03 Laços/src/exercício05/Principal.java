package exerc�cio05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String prod = JOptionPane.showInputDialog(null, "Digite o seu produto: ");
		int pre� = Integer.parseInt(JOptionPane.showInputDialog("Digite o pre�o do produto: "));
		double prom1 = pre� - (pre�*0.05);
		double prom2 = pre� - (pre�*0.10);
		double prom3 = pre� - (pre�*0.15);
		double prom4 = pre� - (pre�*0.20);
		double prom5 = pre� - (pre�*0.25);
		double prom6 = pre� - (pre�*0.30);
		double prom7 = pre� - (pre�*0.35);
		double prom8 = pre� - (pre�*0.40);
		double prom9 = pre� - (pre�*0.45);
		double prom10 = pre� - (pre�*0.50);
		
		System.out.println("Produto: "+prod);
		System.out.println("");
		System.out.println("Pre�o de seu produto: R$"+pre�);
		System.out.println("");
		System.out.println("Promo��es: ");
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
