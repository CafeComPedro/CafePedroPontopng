package exerc�cio11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Object[] cargo = {"Desenvolvedor Java J�nior", "Desenvolvedor Java Pleno", "Desenvolvedor Java S�nior", "Administrador de Banco de Dados", "Analista J�nior", "Analista Pleno", "Analista S�nior", "Arquiteto de Software", "Gerente de Projetos"};
		Object[] genero = {"Masculino", "Feminino"};
		Object[] clube = {"Sim", "N�o"};
		String nome, liquidname = null;
		int idade;
		int horast = 0;
		int horase;
		int horaset;
		int faltas;
		int filhos, filhosbon;
		int cadastrados = 1;
		int Sim = 0, N�o = 0, Masculino = 0, Feminino = 0,DesenvolvedorJavaJ�nior = 0, DesenvolvedorJavaPleno = 0, DesenvolvedorJavaS�nior = 0, AdministradordeBancodeDados = 0, AnalistaJ�nior = 0, AnalistaPleno = 0, AnalistaS�nior =  0, ArquitetodeSoftware = 0, GerentedeProjetos = 0;
		int carg, gen, club, continuar = 0, contador = 0;
		double valhora, INSS = 0, bigliquid = 0;
		int idade26 = 0, idade40 = 0, idade50 = 0, idade51 = 0; 
		int totalgen = 0, totalfuncio = 0, totalclub = 0;
		
		do {
			
			nome = JOptionPane.showInputDialog("Nome: ");
			carg = JOptionPane.showOptionDialog(null, "Qual desses � o seu cargo?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cargo, 0);
			switch(carg) {
				case 0:
					DesenvolvedorJavaJ�nior++;
					break;
			
				case 1:
					DesenvolvedorJavaPleno++;
					break;
			
				case 2:
					DesenvolvedorJavaS�nior++;
					break;
			
				case 3:
					AdministradordeBancodeDados++;
					break;
			
				case 4:
					AnalistaJ�nior++;
					break;
			
				case 5:
					AnalistaPleno++;
					break;
			
				case 6:
					AnalistaS�nior++;
					break;
			
				case 7:
					ArquitetodeSoftware++;
					break;
			
				case 8:
					GerentedeProjetos++;
					break;}
		    horast = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de horas trabalhas:"));
		    
		    horase = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de horas extras trabalhas"));
		    
		   
			gen = JOptionPane.showOptionDialog(null, "Sexo: ", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, genero,0);
				switch(gen) {
					case 0:
						Masculino++;
						break;
				
					case 1 :
						Feminino++;
						break;}
				do {
				idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
					if ((idade >= 18) && (idade <= 26)) {
						idade26++;
					}else if ((idade >= 27) && (idade >= 40)) {
						idade40++;	
					}else if ((idade >= 41) && (idade >= 50)) {
					    idade50++;	
					}else if ((idade >= 51)) {
			    		idade51++;
					}
				}while (idade < 18);
			
			faltas = Integer.parseInt(JOptionPane.showInputDialog("Faltas: "));
				
			filhos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de filhos: "));
			
			filhosbon = filhos*50;
			
			valhora = Double.parseDouble(JOptionPane.showInputDialog("Valor por hora trabalhada: "));
			horast = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de horas trabalhas: "));
			horase = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de horas extras (de 50%) trabalhas: "));
			horaset = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de horas extras (de 100%) trabalhas: "));
			
			club = JOptionPane.showOptionDialog(null, "� associado ao grupo fidelidade?: ", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, clube,0);
				switch(club) {
					case 0:
						Sim++;
						break;
					case 1:
						N�o++;
						break;}
				
				double valhorase = valhora*horast;
				double valhorasce = valhora*horase*1.5;
				double valhorascet = valhora*horaset*2;
				double valhoraextra = valhorasce+valhorascet;
				double valbruto = valhoraextra + valhorase;
				
				if ((valbruto <= 2000)) {
					INSS = 0.05;
				}else if ((valbruto > 2000) && (valbruto <= 3500)) {
					INSS = 0.07;
				}else if ((valbruto >3500) && (valbruto <= 5600)) {
					INSS = 0.08;
				}else if ((valbruto > 5600)) {
					INSS = 0.1;
				}
				if ((faltas == 0)) {
					valbruto+=200; 
				}
				if ((club == 0)) {
					valbruto-=110; 
				}
				
				
				double liquid = valbruto*0.06*INSS+filhosbon;
				
				if(bigliquid > liquid) {
					bigliquid = liquid;
					liquidname = nome;}
				
				
				totalgen = Masculino + Feminino;
				totalfuncio = DesenvolvedorJavaJ�nior + DesenvolvedorJavaPleno + DesenvolvedorJavaS�nior + AdministradordeBancodeDados + AnalistaJ�nior + AnalistaPleno + AnalistaS�nior + ArquitetodeSoftware + GerentedeProjetos;
				totalclub = Sim + N�o;		
			    
			    JOptionPane.showMessageDialog(null, "Sal�rio liqu�do: "+liquid);
				
			continuar = JOptionPane.showConfirmDialog(null, "Voc� deseja cadastrar mais um colaborador?");
				if ((continuar == 0)) {
					cadastrados++;}
		}while (continuar == 0);
		
		String resultado = "Dados: ";
		resultado+= "\nCadastramentos: "+cadastrados;
		resultado+= "\nQuantidade de Homens: "+Masculino+" ("+100/totalgen*Masculino+"%)";
		resultado+= "\nQuantidade de Mulheres: "+Feminino+" ("+100/totalgen*Feminino+"%)";
		resultado+= "\nFuncionarios com idade entre 18 - 26: "+idade26;
		resultado+= "\nFuncionarios com idade entre 27 - 40: "+idade40;
		resultado+= "\nFuncionarios com idade entre 41 - 50: "+idade50;
		resultado+= "\nFuncionarios com idade +50: "+idade51;
		resultado+= "\nQuantidade de Desenvolvedores Java J�nior: "+DesenvolvedorJavaJ�nior+"  ("+100/totalfuncio*DesenvolvedorJavaJ�nior+"%)";
		resultado+= "\nQuantidade de Desenvolvedores Java Pleno: "+DesenvolvedorJavaPleno+" ("+100/totalfuncio*DesenvolvedorJavaPleno+"%)";
		resultado+= "\nQuantidade de Desenvolvedores Java S�nior: "+DesenvolvedorJavaS�nior+" ("+100/totalfuncio*DesenvolvedorJavaS�nior+"%)";
		resultado+= "\nQuantidade de Administradorese de Banco de Dados: "+AdministradordeBancodeDados+" ("+100/totalfuncio*AdministradordeBancodeDados+"%)";
		resultado+= "\nQuantidade de Analistas J�nior: "+AnalistaJ�nior+" ("+100/totalfuncio*AnalistaJ�nior+"%)";
		resultado+= "\nQuantidade de Analistas Pleno: "+AnalistaPleno+" ("+100/totalfuncio*AnalistaPleno+"%)";
		resultado+= "\nQuantidade de Analistas S�nior: "+AnalistaS�nior+"  ("+100/totalfuncio*AnalistaS�nior+"%)";
		resultado+= "\nQuantidade de Arquitetos de Software : "+ArquitetodeSoftware+" ("+100/totalfuncio*ArquitetodeSoftware+"%)";
		resultado+= "\nQuantidade de Gerentes de Projetos: "+GerentedeProjetos+" ("+100/totalfuncio*GerentedeProjetos+"%)";
		resultado+= "\nFuncionario com o maior sal�rio liqu�do: "+liquidname+"  Sal�rio: "+bigliquid;
		resultado+= "\nFuncionarios que aderem ao Clube Fidelidade"+Sim+" ("+100/totalclub*Sim+"%)";
						JOptionPane.showMessageDialog(null, resultado);
}
}
