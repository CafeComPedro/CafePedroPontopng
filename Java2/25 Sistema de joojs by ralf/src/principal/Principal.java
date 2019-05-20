package principal;

import java.awt.EventQueue;
import java.util.ArrayList;

import beans.jogo;
import formularios.FormularioPrincipal;

public class Principal {

	
	
	
			//ArrayList
		public static ArrayList<jogo> vetorJogos = new ArrayList<jogo>();
	
			//Iniciar Sistema
	
			public static void main(String[] args) {
				
			
	
			//Instanciar Formulario
					FormularioPrincipal frame = new FormularioPrincipal();
					frame.setVisible(true); 
	
					
			}

	}


