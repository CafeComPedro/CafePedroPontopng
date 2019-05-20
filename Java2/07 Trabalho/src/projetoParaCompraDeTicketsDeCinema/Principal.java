package projetoParaCompraDeTicketsDeCinema;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Principal {

	private static Component latelTitulo;

	public static void main(String[] args) {
		
		
		
//Mostrar o filme com suas sinopses, generos, reviews, classificção indicativa, elenco e duração (e se conseguir uma img e se pah um trailer)
		
//mostrar os horarios de sessões e em quais horarios que está passando a versão legendade e dublada/ 3D ou 2D	
	
//cartão presente, ingresso corporativo
		
//caso o filme ainda não tenha estreado mostre qnd q ele sera estreado.		
		
//em cada um deles terá um "deseja adquirir um ticket?" ou algo assim

//perguntar onde o cliente vai sentar (utilizando o exemplo06) e qunatas pessoas vão
		
//no preço de cada ingresso será levado em consideração o dia da semana, a idade, se o filme está em pré-venda, se o cliente esá vendo o filme uma sala vip e se o cliente faz parte do grupo do cinema

//Perguntar se o cliente faz parte do clube do cinema caso ele diser que não tera a opção de se cadastrar assim obtendo descontos 		
		
//perguntar se o cliente gostaria de ir na sala vip por um preço adicional		
		
//Perguntar se o cliente gostaria de pipoca já inclusa
		
//Mostrar tds os dados(total com (ou sem) descontos, bancos, filme, sessão, etc) e pedir confirmação do cliente

//caso ele confirme tudo oque botou ele sera redirecionado para o setor de pagamento caso contrario terá que refazer o processo(tente algo mais facil)

//fazer um combo ex.:Compre o COMBO* de Vingadores - Ultimato e GANHE um balde de Pipoca com tampa  exclusiva do filme!	
		
//depois disso ele pagará "Compra realizada com sucesso! Lhe desejamos um bom filme."		
		
		//Criar um formulario
		JFrame formulario = new JFrame();
		formulario.setTitle("VSF Cinemas");
		formulario.setSize(2000, 1000);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setVisible(true);
		
		
		//img
		JLabel imgFilme1 = new JLabel();
		URL caminhoImagem;
		try {
			caminhoImagem = new URL("http://br.web.img3.acsta.net/c_215_290/pictures/19/02/21/21/08/3735597.jpg");
			ImageIcon icone = new ImageIcon(caminhoImagem);
			imgFilme1.setIcon(icone);
			imgFilme1.setBounds(10, 10, 200, 200);
		} catch (Exception e) { }
		
		
		//criar um rótulo
		JLabel rotulo = new JLabel();
		rotulo.setBounds(30, 30, 150, 20);
		rotulo.setText("SHAZÃO");
		rotulo.setForeground(Color.WHITE);
		
		//criar um sinopse
		JLabel rotulo2 = new JLabel();
		rotulo2.setBounds(30, 600, 150, 20);
		rotulo2.setText("Jaime é o novo menino da vizinhança e ele veio para causar.");
		rotulo2.setForeground(Color.WHITE);
		
		//Criar o logo
		JLabel logo =  new JLabel();
		logo.setText("VSF CINEMAS");
		logo.setSize(300, 200);
		logo.setForeground(Color.black);
		
		
		//Painéis
		JPanel caixa01 = new JPanel();
		caixa01.setSize(2000, 200);
		caixa01.setBackground(Color.BLUE);
		caixa01.setVisible(true);
		
		JPanel caixa02 = new JPanel();
		caixa02.setSize(2000, 1000);
		caixa02.setBackground(Color.DARK_GRAY);
		caixa02.setVisible(true);
		
		
		//add elementos ao formulario
		formulario.add(logo);
		formulario.add(rotulo);
		formulario.add(rotulo2);
		formulario.add(caixa01);
		formulario.add(caixa02);

		//Exibir componentes
		formulario.setVisible(true);
		
	}

}
