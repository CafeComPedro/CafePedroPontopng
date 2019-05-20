package principal;

import java.util.ArrayList;
import java.awt.EventQueue;
import beans.Jogo;
import formularios.FormularioJooJ;

public class Principal {
	
	
	//Array List
	public static  ArrayList<Jogo> vetorJogos = new ArrayList<Jogo>();

	//iniciar sistema
	
	public static void main(String[] args) {
		
		
		//Instanciar Formulario
		
		FormularioJooJ frame = new FormularioJooJ();
		frame.setVisible(true);

	}

}
