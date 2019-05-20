package prova;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		//variaveis, muitas variaveis
		Object[] genero = {"Masculino", "Feminino"};
		Object[] comprar = {"Sim", "Não"};
		Object[] departamentos = { "Áudio/Vídeo", "Informática", "Vestuário"}; 
		Object[] subdepartaudio = { "TV's", "Aparelhos de som"};
		Object[] subdepartinfo = {"Hardware", "Software"};
		Object[] subdepartvest = {"Masculino", "Feminino"};
		Object[] produtotv = {"Smart TV Led 49 Samsung - R$ 4.999,99 ", "Smart TV 4k LG 60 - R$7.499,00  ", "Smart TV Full HD 32 Samsung - R$ 1.710,00 "};
		Object[] produtoaparelho = { "Semp Toshiba Áudio Bright - R$ 599,99 ", "Mini System LG - R$ 512,00", "Mini System Philco - R$ 499,99 "};
		Object[] produtohardware = { "Placa Mãe Asus - R$ 2.000,00 ", "", ""};
		Object[] produtosoftware = {"", "", "" };
		Object[] produtomasculino = {"", "", "" };
		Object[] produtofeminino = {"", "", "" };
		Object[] pagamentoo = {"Vista", "Prazo"};
		String nome;
		int idade, continuar = 0, Sim = 0, Não = 0, Feminino = 0, Masculino = 0, Audio = 0, Informatica = 0, Vestiario = 0, totalgen = 0;
		int gen, compra,comprado, depart, subaud, prodtv, prodapare, subinf, prodhard, prodsoft, subves, prodmasc, prodfemn, contador = 0, audioselc;
		int pagamento;
		double valor = 0;
		
	compra = JOptionPane.showOptionDialog(null, "Deseja realizar uma compra?", "", JOptionPane.PLAIN_MESSAGE,  JOptionPane.PLAIN_MESSAGE, null, comprar, 0);
	switch(compra) {
	case 0:
		comprado = 0;
		break;
	case 1:
		comprado = 1;
	}
	
			
		do {
	JOptionPane.showInputDialog("Nome:");
	//informe genero
	gen = JOptionPane.showOptionDialog(null, "Sexo: ", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, genero,0);
	switch(gen) {
		case 0:
			Masculino++;
			break;
	
		case 1 :
			Feminino++;
			break;}
	//informe idade
	idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
	//escolha um departamento
	depart = JOptionPane.showOptionDialog(null, "Escolha  departamento em que deseja comprar: ", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, departamentos, 0);
	switch(depart) {
	//escolhendo o subdepartamento 1
	case 0:
		Audio++;
		
		subaud = JOptionPane.showOptionDialog(null, "Escolha um subdepartamento", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, subdepartaudio, 0);
		switch(subaud) {
		case 0:
			prodtv = JOptionPane.showOptionDialog(null, "Escolha um produto: ", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, produtotv, 0);
			switch(prodtv) {
			case 0:
				valor+=4999.99;
				break;
			case 1:
				valor+=7499;
				break;
			case 2:
				valor+=1710;
				break;
			}
			break;

		case 1 :
			prodapare = JOptionPane.showOptionDialog(null, "Escolha um produto: ", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, produtoaparelho, 0);
			switch(prodapare) {
			case 0:
				valor+=599.99;
				break;
			case 1:
				valor+=512;
				break;
			case 2:
				valor+=499.99;
				break;
			}
			break;}
		break;

	case 1:
		Informatica++;
		//escolhendo o subdepartamento 2
		subinf = JOptionPane.showOptionDialog(null, "Escolha um subdepartamento", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, subdepartinfo, 0);
		switch(subinf) {
		case 0:
			prodhard = JOptionPane.showOptionDialog(null, "Escolha um produto: ", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, produtohardware, 0);
			switch(prodhard) {
			case 0:
				valor+=2000;
				break;
			case 1:
				valor+=500;
				break;
			case 2:
				valor+=59.90;
				break;}
			break;
	
		case 1 :
			prodsoft = JOptionPane.showOptionDialog(null, "Escolha um produto: ", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, produtosoftware, 0);
			switch(prodsoft) {
			case 0:
				valor+=500;
				break;
			case 1:
				valor+=399.99;
				break;
			case 2:
				valor+=899.50;
				break;
			}
			break;}
		break;

	case 2:
		Vestiario++;
		//escolhendo o subdepartamento 3
		subves = JOptionPane.showOptionDialog(null, "Escolha um subdepartamento", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, subdepartvest, 0);
		switch(subves) {
		case 0:
			prodtv = JOptionPane.showOptionDialog(null, "Escolha um produto: ", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, produtotv, 0);;
			break;
	
		case 1 :
			prodtv = JOptionPane.showOptionDialog(null, "Escolha um produto: ", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, produtotv, 0);;
			break;}
		break;}
	//pagamento
	pagamento = JOptionPane.showOptionDialog(null, "Escolha uma forma de pagamento", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, pagamentoo, 0);
	switch(pagamento) {
	case 0:
		break;
	case 1:
		break;
	}
	
	totalgen= Masculino + Feminino;
	//confirmação
	JOptionPane.showConfirmDialog(null, "Deseja realizar mais uma compra?");
		}while (continuar == 0);
		
		//dados
		String resultado = "Dados da(s) compra(s): ";		
		resultado+="\nMulheres que efetuaram uma compra: "+Feminino+"  ("+100/totalgen*Feminino+"%)";
		resultado+="\nHomens que efetuaram uma compra: "+Masculino+"  ("+100/totalgen*Masculino+"%)";
		resultado+="\n";
		
				JOptionPane.showMessageDialog(null, resultado);
		//pelamordedeusralphoqfoiqvcfez
				//eu fiz o meu melhor


}
}
