package exemplo01;

public class Pessoa {
	
	//M�todo Contritor
	Pessoa() {
		System.out.println("contrutor OK");
	}
	
	//Metodo contrutor
	Pessoa(String nome) {
		System.out.println(nome);
	}
	
	//M�todo construtor
	Pessoa(String nome, int idade) {
		System.out.println(nome+" "+idade);
	}
}

