package exemplo01;

//Class: Molde
public class Pessoas {

	//Atributos:  Caracterirsticas
	String nome;
	double altura, peso;
	

	//M�todsos: A��es
	void mensagem() {
		System.out.println("Ol� meu nome � "+nome);
	}
	
	double imc() {
		return peso/ (altura*altura);
	}
	
}
