package exemplo01;

//Class: Molde
public class Pessoas {

	//Atributos:  Caracterirsticas
	String nome;
	double altura, peso;
	

	//Métodsos: Ações
	void mensagem() {
		System.out.println("Olá meu nome é "+nome);
	}
	
	double imc() {
		return peso/ (altura*altura);
	}
	
}
