package exemplo02;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		//curso 01
		curso c1 = new curso();
		c1.setNomeCurso("Java");
		c1.setAreaCurso("Desenvolvimento");
		c1.setValorCurso(2300);
		
		//curso 02
		curso c2 = new curso();
		c2.setNomeCurso("C#");
		c2.setAreaCurso("Desenvolvimento");
		c2.setValorCurso(1900);

		//curso 03
		curso c3 = new curso();
		c3.setNomeCurso("Photoshop");
		c3.setAreaCurso("Gráfica");
		c3.setValorCurso(600);
		
		//ArrayList
		ArrayList<curso> cursos = new ArrayList<curso>();
		cursos.add(c1);
		cursos.add(c2);
		cursos.add(c3);

		//Listar
		for(int i=0; i<cursos.size(); i++) {
			System.out.println(cursos.get(i).getNomeCurso());
		}
		
		
	}

}
