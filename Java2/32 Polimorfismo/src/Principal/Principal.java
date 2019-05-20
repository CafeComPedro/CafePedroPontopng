package Principal;

import java.util.LinkedList;

import javax.swing.event.ListSelectionListener;

import pagamento.Credito;
import pagamento.Debito;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Poli -> Varias/Muitas
		//Morphus ->  Formas 
		
		//Objeto
		Credito d = new Credito();
		d.tributos(100);
	    d.msg();
	    
	    /*Exemplo de polimorfismo da vlasse Java.util
	    List<String> nome = new ArrayList<String>();
	    List<String> cidade = new LinkedList<String>()*/
	    
	}

}
