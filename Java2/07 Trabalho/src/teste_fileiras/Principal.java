package teste_fileiras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

	//Criar um formulario
	JFrame formulario = new JFrame();
	formulario.setTitle("FILEIRAS");
	formulario.setSize(500, 300);
	formulario.setLocationRelativeTo(null);
	formulario.setLayout(null);
	formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	formulario.setVisible(true);
	
	//JChecbox
	
	//COLUNA A
	
	JCheckBox ckb01 = new JCheckBox("A1");
	ckb01.setBounds(10, 10, 100, 20);
	
	JCheckBox ckb0102 = new JCheckBox("A2");
	ckb0102.setBounds(60, 10, 100, 20);
	
	JCheckBox ckb0103 = new JCheckBox("A3");
	ckb0103.setBounds(110, 10, 100, 20);
	
	JCheckBox ckb0104 = new JCheckBox("A4");
	ckb0104.setBounds(160, 10, 100, 20);
	
	JCheckBox ckb0105 = new JCheckBox("A5");
	ckb0105.setBounds(210, 10, 100, 20);
	
	JCheckBox ckb0106 = new JCheckBox("A6");
	ckb0106.setBounds(260, 10, 100, 20);
	
	JCheckBox ckb0107 = new JCheckBox("A7");
	ckb0107.setBounds(310, 10, 100, 20);
	
	JCheckBox ckb0108 = new JCheckBox("A8");
	ckb0108.setBounds(360, 10, 100, 20);
	
	JCheckBox ckb0109 = new JCheckBox("A9");
	ckb0109.setBounds(410, 10, 100, 20);
	
	JCheckBox ckb0110 = new JCheckBox("A10");
	ckb0110.setBounds(460, 10, 100, 20);
	
	//COLUNA B
	
	JCheckBox ckb02 = new JCheckBox("B1");
	ckb02.setBounds(10, 40, 100, 20);
	
	JCheckBox ckb0202 = new JCheckBox("B2");
	ckb0202.setBounds(60, 40, 100, 20);
	
	JCheckBox ckb0203 = new JCheckBox("B3");
	ckb0203.setBounds(110, 40, 100, 20);
	
	JCheckBox ckb0204 = new JCheckBox("B4");
	ckb0204.setBounds(160, 40, 100, 20);
	
	JCheckBox ckb0205 = new JCheckBox("B5");
	ckb0205.setBounds(210, 40, 100, 20);
	
	JCheckBox ckb0206 = new JCheckBox("B6");
	ckb0206.setBounds(260, 40, 100, 20);
	
	JCheckBox ckb0207 = new JCheckBox("B7");
	ckb0207.setBounds(310, 40, 100, 20);
	
	JCheckBox ckb0208 = new JCheckBox("B8");
	ckb0208.setBounds(360, 40, 100, 20);
	
	JCheckBox ckb0209 = new JCheckBox("B9");
	ckb0209.setBounds(410, 40, 100, 20);
	
	JCheckBox ckb0210 = new JCheckBox("B10");
	ckb0210.setBounds(460, 40, 100, 20);
	
	
	
	//COLUNA C
	
	JCheckBox ckb03 = new JCheckBox("C1");
	ckb03.setBounds(10, 70, 100, 20);

	JCheckBox ckb0302 = new JCheckBox("C2");
	ckb0302.setBounds(60, 70, 100, 20);
	
	JCheckBox ckb0303 = new JCheckBox("C3");
	ckb0303.setBounds(110, 70, 100, 20);
	
	JCheckBox ckb0304 = new JCheckBox("C4");
	ckb0304.setBounds(160, 70, 100, 20);
	
	JCheckBox ckb0305 = new JCheckBox("C5");
	ckb0305.setBounds(210, 70, 100, 20);
	
	JCheckBox ckb0306 = new JCheckBox("C6");
	ckb0306.setBounds(260, 70, 100, 20);
	
	JCheckBox ckb0307 = new JCheckBox("C7");
	ckb0307.setBounds(310, 70, 100, 20);
	
	JCheckBox ckb0308 = new JCheckBox("C8");
	ckb0308.setBounds(360, 70, 100, 20);
	
	JCheckBox ckb0309 = new JCheckBox("C9");
	ckb0309.setBounds(410, 70, 100, 20);
	
	JCheckBox ckb0310 = new JCheckBox("C10");
	ckb0310.setBounds(460, 70, 100, 20);
	
	//COLUNA D
	
	JCheckBox ckb04 = new JCheckBox("D1");
	ckb04.setBounds(10, 100, 100, 20);
	
	JCheckBox ckb0402 = new JCheckBox("D2");
	ckb0402.setBounds(60, 100, 100, 20);
	
	JCheckBox ckb0403 = new JCheckBox("D3");
	ckb0403.setBounds(110, 100, 100, 20);
	
	JCheckBox ckb0404 = new JCheckBox("D4");
	ckb0404.setBounds(160, 100, 100, 20);
	
	JCheckBox ckb0405 = new JCheckBox("D5");
	ckb0405.setBounds(210, 100, 100, 20);
	
	JCheckBox ckb0406 = new JCheckBox("D6");
	ckb0406.setBounds(260, 100, 100, 20);
	
	JCheckBox ckb0407 = new JCheckBox("D7");
	ckb0407.setBounds(310, 100, 100, 20);
	
	JCheckBox ckb0408 = new JCheckBox("D8");
	ckb0408.setBounds(360, 100, 100, 20);
	
	JCheckBox ckb0409 = new JCheckBox("D9");
	ckb0409.setBounds(410, 100, 100, 20);

	JCheckBox ckb0410 = new JCheckBox("D10");
	ckb0410.setBounds(460, 100, 100, 20);
	//COLUNA E
	
	JCheckBox ckb05 = new JCheckBox("E1");
	ckb05.setBounds(10, 130, 100, 20);
	
	JCheckBox ckb0502 = new JCheckBox("E2");
	ckb0502.setBounds(60, 130, 100, 20);
	
	JCheckBox ckb0503 = new JCheckBox("E3");
	ckb0503.setBounds(110, 130, 100, 20);
	
	JCheckBox ckb0504 = new JCheckBox("E4");
	ckb0504.setBounds(160, 130, 100, 20);
	
	JCheckBox ckb0505 = new JCheckBox("E5");
	ckb0505.setBounds(210, 130, 100, 20);
	
	JCheckBox ckb0506 = new JCheckBox("E6");
	ckb0506.setBounds(260, 130, 100, 20);
	
	JCheckBox ckb0507 = new JCheckBox("E7");
	ckb0507.setBounds(310, 130, 100, 20);
	
	JCheckBox ckb0508 = new JCheckBox("E8");
	ckb0508.setBounds(360, 130, 100, 20);
	
	JCheckBox ckb0509 = new JCheckBox("E9");
	ckb0509.setBounds(410, 130, 100, 20);

	JCheckBox ckb0510 = new JCheckBox("E10");
	ckb0510.setBounds(460, 130, 100, 20);
	
	
	//COLUNA F

	JCheckBox ckb06 = new JCheckBox("F1");
	ckb06.setBounds(10, 160, 100, 20);
	
	JCheckBox ckb0602 = new JCheckBox("E2");
	ckb0602.setBounds(60, 160, 100, 20);
	
	JCheckBox ckb0603 = new JCheckBox("E3");
	ckb0603.setBounds(110, 160, 100, 20);
	
	JCheckBox ckb0604 = new JCheckBox("E4");
	ckb0604.setBounds(160, 160, 100, 20);
	
	JCheckBox ckb0605 = new JCheckBox("E5");
	ckb0605.setBounds(210, 160, 100, 20);
	
	JCheckBox ckb0606 = new JCheckBox("E6");
	ckb0606.setBounds(260, 160, 100, 20);
	
	JCheckBox ckb0607 = new JCheckBox("E7");
	ckb0607.setBounds(310, 160, 100, 20);
	
	JCheckBox ckb0608 = new JCheckBox("E8");
	ckb0608.setBounds(360, 160, 100, 20);
	
	JCheckBox ckb0609 = new JCheckBox("E9");
	ckb0609.setBounds(410, 160, 100, 20);

	JCheckBox ckb0610 = new JCheckBox("E10");
	ckb0610.setBounds(460, 160, 100, 20);
	//COLUNA G

	JCheckBox ckb07 = new JCheckBox("G1");
	ckb07.setBounds(10, 190, 100, 20);

	JCheckBox ckb0602 = new JCheckBox("E2");
	ckb0602.setBounds(60, 160, 100, 20);
	
	JCheckBox ckb0603 = new JCheckBox("E3");
	ckb0603.setBounds(110, 160, 100, 20);
	
	JCheckBox ckb0604 = new JCheckBox("E4");
	ckb0604.setBounds(160, 160, 100, 20);
	
	JCheckBox ckb0605 = new JCheckBox("E5");
	ckb0605.setBounds(210, 160, 100, 20);
	
	JCheckBox ckb0606 = new JCheckBox("E6");
	ckb0606.setBounds(260, 160, 100, 20);
	
	JCheckBox ckb0607 = new JCheckBox("E7");
	ckb0607.setBounds(310, 160, 100, 20);
	
	JCheckBox ckb0608 = new JCheckBox("E8");
	ckb0608.setBounds(360, 160, 100, 20);
	
	JCheckBox ckb0609 = new JCheckBox("E9");
	ckb0609.setBounds(410, 160, 100, 20);

	JCheckBox ckb0610 = new JCheckBox("E10");
	ckb0610.setBounds(460, 160, 100, 20);
	
	//COLUNA H

	
	JCheckBox ckb08 = new JCheckBox("H1");
	ckb08.setBounds(10, 210, 100, 20);

	//COLUNA I

	
	JCheckBox ckb09 = new JCheckBox("I1");
	ckb09.setBounds(10, 240, 100, 20);

	//COLUNA J

	
	JCheckBox ckb10 = new JCheckBox("J1");
	ckb10.setBounds(10, 270, 100, 20);

	//COLUNA K

	
	JCheckBox ckb11 = new JCheckBox("K1");
	ckb11.setBounds(10, 300, 100, 20);

	//COLUNA L

	
	JCheckBox ckb12 = new JCheckBox("L1");
	ckb12.setBounds(10, 330, 100, 20);
	
	
	
//Botão
	JButton botao = new JButton("Selecionar cadeiras");
	botao.setBounds(500, 20, 200, 30);
	
//Ação no botão
	botao.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			if(ckb01.isSelected()) {
				JOptionPane.showMessageDialog(null, "Primeira opção selecionada");
			}
			if(ckb02.isSelected()) {
				JOptionPane.showMessageDialog(null, "Segunda opção selecionada");
			}
			if(ckb03.isSelected()) {
				JOptionPane.showMessageDialog(null, "Terceira opção selecionada");
			}
		}
	});
	
//add componentes ao formulario
//coluna A
	formulario.add(ckb01);
	formulario.add(ckb0102);
	formulario.add(ckb0103);
	formulario.add(ckb0104);
	formulario.add(ckb0105);
	formulario.add(ckb0106);
	formulario.add(ckb0107);
	formulario.add(ckb0108);
	formulario.add(ckb0109);
	formulario.add(ckb0110);
//coluna B
	formulario.add(ckb02);
	formulario.add(ckb0202);
	formulario.add(ckb0203);
	formulario.add(ckb0204);
	formulario.add(ckb0205);
	formulario.add(ckb0206);
	formulario.add(ckb0207);
	formulario.add(ckb0208);
	formulario.add(ckb0209);
	formulario.add(ckb0210);
//coluna C	
	formulario.add(ckb03);
	formulario.add(ckb0302);
	formulario.add(ckb0303);
	formulario.add(ckb0304);
	formulario.add(ckb0305);
	formulario.add(ckb0306);
	formulario.add(ckb0307);
	formulario.add(ckb0308);
	formulario.add(ckb0309);
	formulario.add(ckb0310);
//coluna D	
	formulario.add(ckb04);
	formulario.add(ckb0402);
	formulario.add(ckb0403);
	formulario.add(ckb0404);
	formulario.add(ckb0405);
	formulario.add(ckb0406);
	formulario.add(ckb0407);
	formulario.add(ckb0408);
	formulario.add(ckb0409);
	formulario.add(ckb0410);
//coluna E	
	formulario.add(ckb05);
	formulario.add(ckb0502);
	formulario.add(ckb0503);
	formulario.add(ckb0504);
	formulario.add(ckb0505);
	formulario.add(ckb0506);
	formulario.add(ckb0507);
	formulario.add(ckb0508);
	formulario.add(ckb0509);
	formulario.add(ckb0510);
//coluna f	
	formulario.add(ckb06);
	formulario.add(ckb0602);
	formulario.add(ckb0603);
	formulario.add(ckb0604);
	formulario.add(ckb0605);
	formulario.add(ckb0606);
	formulario.add(ckb0607);
	formulario.add(ckb0608);
	formulario.add(ckb0609);
	formulario.add(ckb0610);
//coluna g		
	formulario.add(ckb07);
	formulario.add(ckb06);
	formulario.add(ckb0602);
	formulario.add(ckb0603);
	formulario.add(ckb0604);
	formulario.add(ckb0605);
	formulario.add(ckb0606);
	formulario.add(ckb0607);
	formulario.add(ckb0608);
	formulario.add(ckb0609);
	formulario.add(ckb0610);
//coluna h		
	formulario.add(ckb08);
	formulario.add(ckb06);
	formulario.add(ckb0602);
	formulario.add(ckb0603);
	formulario.add(ckb0604);
	formulario.add(ckb0605);
	formulario.add(ckb0606);
	formulario.add(ckb0607);
	formulario.add(ckb0608);
	formulario.add(ckb0609);
	formulario.add(ckb0610);
//coluna i	
	formulario.add(ckb09);
	formulario.add(ckb06);
	formulario.add(ckb0602);
	formulario.add(ckb0603);
	formulario.add(ckb0604);
	formulario.add(ckb0605);
	formulario.add(ckb0606);
	formulario.add(ckb0607);
	formulario.add(ckb0608);
	formulario.add(ckb0609);
	formulario.add(ckb0610);
//coluna j	
	formulario.add(ckb10);
	formulario.add(ckb06);
	formulario.add(ckb0602);
	formulario.add(ckb0603);
	formulario.add(ckb0604);
	formulario.add(ckb0605);
	formulario.add(ckb0606);
	formulario.add(ckb0607);
	formulario.add(ckb0608);
	formulario.add(ckb0609);
	formulario.add(ckb0610);
//coluna k	
	formulario.add(ckb11);
	formulario.add(ckb06);
	formulario.add(ckb0602);
	formulario.add(ckb0603);
	formulario.add(ckb0604);
	formulario.add(ckb0605);
	formulario.add(ckb0606);
	formulario.add(ckb0607);
	formulario.add(ckb0608);
	formulario.add(ckb0609);
	formulario.add(ckb0610);
//coluna l	
	formulario.add(ckb12);
	formulario.add(ckb06);
	formulario.add(ckb0602);
	formulario.add(ckb0603);
	formulario.add(ckb0604);
	formulario.add(ckb0605);
	formulario.add(ckb0606);
	formulario.add(ckb0607);
	formulario.add(ckb0608);
	formulario.add(ckb0609);
	formulario.add(ckb0610);
	
	formulario.add(botao);

}
}