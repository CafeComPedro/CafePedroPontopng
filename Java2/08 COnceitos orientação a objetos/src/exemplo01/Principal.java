package exemplo01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instanciar (criar)
		//Objeto: Resuktado obtido atraves da classe
		Pessoas p1 = new Pessoas();
		p1.nome = "Ana";
		p1.altura = 1.71;
		p1.peso = 60;
        p1.mensagem(); 	
		 double imc = p1.imc();
		 System.out.println(imc);
		
	}

}
