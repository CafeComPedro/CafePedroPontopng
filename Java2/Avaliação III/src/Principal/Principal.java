package Principal;

import java.util.ArrayList;

import beans.beans;
import formularios.formulario;

public class Principal {

	
	//ArrayList
	public static ArrayList<beans> vetorCargos = new ArrayList<beans>();
	
	
	public static void main(String[] args) {

		//Instanciar Formulario
		formulario frame = new formulario();
		frame.setVisible(true); 
	}

}
