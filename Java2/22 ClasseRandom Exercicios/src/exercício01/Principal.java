package exerc�cio01;

import java.util.Random;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String secret;
		String secret2;
		String secret3;
		
		
		//Instanciando um objeto
			Random gerador = new Random();
				
		
			
		//Perguntas
			int pergunta1;
			int pergunta2;
			int pergunta3;
			int pergunta4;
			int pergunta5;
			int pergunta6;
			int pergunta7;
			int pergunta8;
			int pergunta9;
			int pergunta10;
			int pergunta11;
			int pergunta12;
			int pergunta13;
			int pergunta14;
			int pergunta15;
			
		//Perguntas repeti��o/gambiarra
			int perguntaG1 = 0;
			int perguntaG2 = 0;
			int perguntaG3 = 0;
			int perguntaG4 = 0;
			int perguntaG5=0;
			int perguntaG6=0;
			int perguntaG7=0;
			int perguntaG8=0;
			int perguntaG9=0;
			int perguntaG10=0;
			int perguntaG11=0;
			int perguntaG12=0;
			int perguntaG13=0;
			int perguntaG14=0;
			int perguntaG15=0;
			int confirm;
			//Placar
			String nick;
			String Placar;
			
			
			
//Pontua��o e quantidade de perguntas
			int pontos = 0;
			int maiorpontos = 0;
			int qntdPerg = 0;

do {			
			do {
				
				//Criando uma variavel e add um valor numerico randomico
				int resultado = gerador.nextInt(15);
				
				
				
			if((resultado == 1) && (perguntaG1 <1)) {
				do {
				pergunta1 = Integer.parseInt(JOptionPane.showInputDialog("Qual a capital de floripa?\n"+" 1)Floripa\n"+"2)Floripa eh a capital imbecil\n"+"3)Blumenau\n"+"4)Santa Catarina" ));
				if((pergunta1 == 1)) {
					JOptionPane.showMessageDialog(null, "tu eh buro");
				}else if ((pergunta1 == 2)) {
					JOptionPane.showMessageDialog(null, "Nice meu mano");
					pontos++;
				}else if((pergunta1 == 3)) {
					JOptionPane.showMessageDialog(null, "tu eh buro");
				}else if((pergunta1 == 4)) {
					JOptionPane.showMessageDialog(null, "tu eh buro");
				}
				qntdPerg++;
				perguntaG1++;

			}while((pergunta1 > 4) || (pergunta1 < 1));
				
				
			}else if ((resultado == 2)&& (perguntaG2 <1)) {
				do {
				pergunta2 = Integer.parseInt(JOptionPane.showInputDialog("EndGame eh tope?\n"+"1)QQ eh EndGame\n"+"2)Floripa eh a capital imbecil\n"+"3)Claro n� patr�o\n"+"4)Na verdade esses filminhos de her�is est�o arruinnando"+"\n a industria cinematrografica, pessoas est�o indo aos cinemas para"+"\n ver vil�ozinho bater em her�i e dps perder pro her�i pfv n� em vez de ver"+"\n filmes de verdadeira qualidade tipo spotlight, Donnie Darko, etc eles desperdi�am"+"\n seu tempo vendo esses lixos " )); 
						if((pergunta2 == 1)) {
						JOptionPane.showMessageDialog(null, "tu eh buro");	
						}else if ((pergunta2 == 2)) {
							JOptionPane.showMessageDialog(null, "tu eh buro");
						}else if ((pergunta2 == 3)) {
							JOptionPane.showMessageDialog(null, "Nice meu mano");
							pontos++;
						}else if ((pergunta2 == 4)) {
							JOptionPane.showMessageDialog(null, "se fude");
							pontos--;
						}
				qntdPerg++;	
				perguntaG2++;
				}while((pergunta2 > 4) || (pergunta2 < 1));
				
				
				
			}else if ((resultado == 3)&& (perguntaG3 <1)) {
				
			do {
				pergunta3 = Integer.parseInt(JOptionPane.showInputDialog("Tu conhece a Giga?\n"+"1)A MINHA GIGANTE F� EM DEUS?"+"\n 2)q giga mano?"+"\n 3)os gigabytes, n�? to ligado"+"\n 4)resposta errada"));
				if((pergunta3 == 1)) {
					pontos++;
					secret = JOptionPane.showInputDialog("AM�M IRM�O");
					if ((secret.equals("MEU PAU NA SUA M�O") || (secret.equals("meu pau na sua m�o") || (secret.contentEquals("Meu pau na sua m�o"))))) {
			JOptionPane.showMessageDialog(null, "ponto extra desbloqueado");
			pontos++;
					}
					}else if ((pergunta3 == 2) || (pergunta3 == 3) || (pergunta3 == 4)){
						JOptionPane.showMessageDialog(null, "tu eh buro");	
					}
				qntdPerg++;
				perguntaG3++;

			}while((pergunta3 > 4) || (pergunta3 < 1));
				
				
			}else if ((resultado == 4)&& (perguntaG4 <1)) {
				do {
			
				pergunta4 = Integer.parseInt(JOptionPane.showInputDialog("O mano cansei faz uma pergunta vc agr\n"+"1) ta\n"+"2) Kalaboka mano tu eh um c�digo\n"+"3)Q?\n"+"4)me obriga ae, duvido"));
					if((pergunta4 == 3)) {
						JOptionPane.showMessageDialog(null, "nice meu mano");
					}else if((pergunta4 == 4)) {
						JOptionPane.showMessageDialog(null, "Meu pau no teu ouvido");
					}else {
						JOptionPane.showMessageDialog(null, "tu eh buro");
					}
					qntdPerg++;
					perguntaG4++;

				}while((pergunta4 > 4) || (pergunta4 < 1));
					
			}else if ((resultado == 5)&& (perguntaG5 <1)) {
				do {
			
				pergunta5 = Integer.parseInt(JOptionPane.showInputDialog("pergunta gen�rica\n"+"1)resposta errada gen�rica\n"+"2)resposta errada gen�rica\n"+"3)Resposta certa gen�rica\n"+"4)Resposta errada gen�rica"));
				if((pergunta5 == 3)) {
					JOptionPane.showMessageDialog(null, "Congratula��o gen�rica");
					pontos++;
				}else {
					JOptionPane.showMessageDialog(null, "Mensagem de resposta errada gen�rica");
				}
				qntdPerg++;
				perguntaG5++;
				}while((pergunta5 > 4) || (pergunta5 < 1));
				
				
				
			}else if ((resultado == 6)&& (perguntaG6 <1)) {
				do {
				pergunta6 = Integer.parseInt(JOptionPane.showInputDialog("Melhor linguagem de promagrama��o?\n"+"1)Java\n"+"2)C##\n"+"3)Scratch\n"+"4)HTML"));
				if((pergunta6 == 3)) {
					JOptionPane.showMessageDialog(null, "nice meu mano");
					pontos++;
				}else {
					JOptionPane.showMessageDialog(null, "tu eh buro");
				}
				qntdPerg++;
				perguntaG6++;

				}while((pergunta6 > 4) || (pergunta6 < 1));
				
				
				
			}else if ((resultado == 7) && (perguntaG7 <1)) {
				do {
				pergunta7 = Integer.parseInt(JOptionPane.showInputDialog("Quem que descobriu as Am�ricas?\n"+"1)Os vikins\n"+"2)Os europeus\n"+"3)Os Ind�os\n"+"4)The Braziliam"));
				if ((pergunta7 == 1)) {
					JOptionPane.showMessageDialog(null, "Nice meu mano");
					pontos++;
				}else {
					JOptionPane.showMessageDialog(null, "tu eh buro");
				}
				qntdPerg++;
				perguntaG7++;
				}while((pergunta7 > 4) || (pergunta7 < 1));
				
				
				
				
			}else if ((resultado == 8)&& (perguntaG8 <1)) {
				do {
				pergunta8 = Integer.parseInt(JOptionPane.showInputDialog("Como se pronuncia VENEZA?\n"+"1)Veneza ora bolas\n"+"2)Ven�tzia como sempre foi para quem mora la mas\n"+" os malditos americanos estragaram com tudo\n"+"3)Viena pq � assim q os americanos falam e"+" esse � o meu jeito captalista de ser\n"+"4)Fran�a"));
				if ((pergunta8 == 2)) {
					JOptionPane.showMessageDialog(null, "Nice meu mano");
					pontos++;
				}else {
					JOptionPane.showMessageDialog(null, "tu eh buro");
				}
				qntdPerg++;
				perguntaG8++;

				}while((pergunta8 > 4) || (pergunta8 < 1));
				
				
			}else if ((resultado == 9)&& (perguntaG9 <1)) {
				do {
				pergunta9 = Integer.parseInt(JOptionPane.showInputDialog("Imposto eh roubo?\n"+"1)n�o n� meu mano os cara fazem estradas e t�o pagando esse cursinho kkk azid�ia\n"+"2)EU QERO ANDA DE TANKE PORRA\n"+"3)O imposto por mais q seja roubo eh necessario para a sociedade\n"+"4)claro q ss patr�o e o estado eh uma gangue tbm, av� Foga�a"));
				if ((pergunta9 == 4)) {
					JOptionPane.showMessageDialog(null, "Nice meu mano");
					pontos++;
				}else {
					JOptionPane.showMessageDialog(null, "tu eh buro");
				}
				qntdPerg++;
				perguntaG9++;
				}while((pergunta9 > 4) || (pergunta9 < 1));
				
			}else if ((resultado == 10)&& (perguntaG10 <1)) {
				do {
				pergunta10 = Integer.parseInt(JOptionPane.showInputDialog("Leon e Nilce fazem sexo?\n"+"1)ih rapaz, sei n�o\n"+"2)Nem fodendo(ba dum tss)\n"+"3)Eles n�o fazem sexo. eles fazem amor <3..\n"+"4)Claro porra imagina o pauz�o do Leon"));
				if ((pergunta10 == 3)) {
					JOptionPane.showMessageDialog(null, "Nice meu mano");
					pontos++;
				}else {
					JOptionPane.showMessageDialog(null, "tu eh buro");
				}
				qntdPerg++;
				perguntaG10++;
				}while((pergunta10 > 4) || (pergunta10< 1));
				
				
			}else if ((resultado == 11)&& (perguntaG11 <1)) {
				do {
				pergunta11 = Integer.parseInt(JOptionPane.showInputDialog("Como o Thanos morre em endgame?\n"+"1)sla bixo nem vi o filme\n"+"2)eh spoiler bixo v� fica quieto\n"+"3)Balde de pipoca da cabe�a do Thanos\n"+"4)snap"));
				if ((pergunta11 == 2)) {
					pontos++;
					secret2 = JOptionPane.showInputDialog("Pode fala aq mano");
					if ((secret2.equals("Thanus") || (secret2.equals("THANUS") || (secret2.equals("thanus"))))) {
						JOptionPane.showMessageDialog(null, "ponto extra desbloqueado");
						pontos++;
					}
				}else {
					JOptionPane.showMessageDialog(null, "tu eh buro");
				}
				qntdPerg++;
				perguntaG11++;

				}while((pergunta11 > 4) || (pergunta11 < 1));
				
				
			}else if ((resultado == 12)&& (perguntaG12 <1)) {
				do {
				pergunta12 = Integer.parseInt(JOptionPane.showInputDialog("Ando de 4 de manh�, de 2 pernas de tarde e de 4 de novo a noite, oq eu sou?\n"+"1)O homem\n"+"2)O ser humano pq n�o sou machista\n"+"3)A mulher pq morte ao p�nis\n"+"4)traveco"));
				if ((pergunta12 == 4)) {
					JOptionPane.showMessageDialog(null, "Nice meu mano");
					pontos++;
				}else {
					JOptionPane.showMessageDialog(null, "tu eh buro");
				}
				qntdPerg++;
				perguntaG12++;

				}while((pergunta12 > 4) || (pergunta12< 1));

				
				
			}else if ((resultado == 13)&& (perguntaG13 <1)) {
				do {
			
				
				pergunta13 = Integer.parseInt(JOptionPane.showInputDialog("q numero q � essa pergunta no c�digo?\n"+"1)13 pq av� PT\n"+"2)COMO EH Q EU VO SABE MANO?vsf\n"+"3)17 pq Bolso eh meu rei\n"+"4)7?"));
				if ((pergunta13 == 1)) {
					JOptionPane.showMessageDialog(null, "Nice meu mano");
					pontos++;
				}else {
					JOptionPane.showMessageDialog(null, "tu eh buro");
				}
				qntdPerg++;
				perguntaG13++;
				
				}while((pergunta13 > 4) || (pergunta13< 1));

				
			}else if ((resultado == 14)&& (perguntaG14 <1)) {
				do {
			
				
				pergunta14 = Integer.parseInt(JOptionPane.showInputDialog("12345meia78...\n"+"1)Vira o anus e bora praticar o coito\n"+"2)Ta na hora de molha a BOLACHA PQ ESSE EH O CERTO\n"+"3)910111213141516171819202122232425...\n"+"4)TA NA HORA DE MOLHAR O BISCOITO"));
				if ((pergunta14 == 4)) {
					pontos++;
					secret3 =JOptionPane.showInputDialog("EU TO NO FOGO MAS EU N�O ME CANSO");
					if((secret3.equals("TA NA HORA DE AFOGA O GANSO") || (secret3.equals("ta na hora de afoga o ganso") || (secret3.contentEquals("Ta na hora de afoga o ganso"))))) {
						pontos++;
						JOptionPane.showMessageDialog(null, "Ponto extra desbloquedo");
					}
				}else {
					JOptionPane.showMessageDialog(null, "tu eh buro");
				}
				qntdPerg++;
				perguntaG14++;
				
				}while((pergunta14 > 4) || (pergunta14< 1));

				
			}else if ((resultado == 15) && (perguntaG15 <1)) {
				do {
			
				pergunta15 = Integer.parseInt(JOptionPane.showInputDialog("Ta gostando do quiz meu chapa?\n"+"1)nem, ta um lixo\n"+"2)essa foi a primeira pergunta mano se fude\n"+"3)n�o ta t�o ruim\n"+"4)Lindo Gato Zap"));
				if ((pergunta15 == 4)) {
					JOptionPane.showMessageDialog(null, "Nice meu mano");
					pontos++;
				}else {
					JOptionPane.showMessageDialog(null, "tu eh buro");
				}
				qntdPerg++;
				perguntaG15++;
				
				}while((pergunta15 > 4) || (pergunta15< 1));
			}
			if((maiorpontos < pontos)) {
				maiorpontos = pontos;
			}
			
			}while((qntdPerg < 10));
			
			
			
			
			confirm = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if ((confirm == 0)) {
			qntdPerg=-10;
			
			if((perguntaG15 == 1)) {
				perguntaG15--;
			}if((perguntaG14 == 1)) {
				perguntaG14--;
			}if((perguntaG13 == 1)) {
				perguntaG13--;
			}if((perguntaG12 == 1)) {
				perguntaG12--;
			}if((perguntaG11 == 1)) {
				perguntaG11--;
			}if((perguntaG10 == 1)) {
				 perguntaG10--;
			}if((perguntaG9 == 1)) {
				 perguntaG9--;
			}if((perguntaG8 == 1)) {
				perguntaG8--;
			}if((perguntaG7 == 1)) {
				perguntaG7--;
			}if((perguntaG6 == 1)) {
				perguntaG6--;
			}if((perguntaG5 == 1)) {
				perguntaG5--;
			}if((perguntaG4 == 1)) {
				perguntaG4--;
			}if((perguntaG3 == 1)) {
				perguntaG3--;
			}if((perguntaG2 == 1)) {
				perguntaG2--;
			}if((perguntaG1 == 1)) {
				perguntaG1--;
			}
			}
			
			
			}while(confirm == 0);
		Placar = "          PLACAR\n";
		Placar+="Primeiro Lugar: "+maiorpontos;
		
		JOptionPane.showMessageDialog(null, Placar);

			
	}
}
