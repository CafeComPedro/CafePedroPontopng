package exemplo03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		/*Exibindo mensagens
		JOptionPane.showMessageDialog(null, "Hoje é terça-feira");
		JOptionPane.showMessageDialog(null, "Erro", "Titulo", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "Perigo", "Titulo", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Tudo bem?", "Titulo", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Isso é java!", "Titulo", JOptionPane.INFORMATION_MESSAGE);
		*/
		
		/*Obter dados
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		
		String mensagem = "Nome: " +nome;
			   mensagem+= "\nIdade: "+idade;
			   mensagem+= "\nAltura "+altura;
			   
			   JOptionPane.showMessageDialog(null, mensagem);
		*/
		
		//Caixa de confirmação
		Object[] estados = {"Santa Catarina", "Paraná", "São Paulo"};
		int estadoSelecionado = JOptionPane.showOptionDialog(null, "Escolha seu estado", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, estados, 0);
		
		int resposta = JOptionPane.showConfirmDialog(null, "Gostando de java?");
		
		JOptionPane.showMessageDialog(null, resposta); 
		
		switch(resposta) {
		case 0:
		JOptionPane.showMessageDialog(null, "Que legal!");	
		break;
		
		case 1:
		JOptionPane.showMessageDialog(null, "Que pena");
		break;
		
		case 2:
		JOptionPane.showMessageDialog(null, "Você cancelou");	
		break;
		
		default:
		JOptionPane.showMessageDialog(null, "Você finalizou");
		}
		
		
		
	}

}
