package exemplo01;

public class Pessoa {
	
	//Método Contritor
	Pessoa() {
		System.out.println("contrutor OK");
	}
	
	//Metodo contrutor
	Pessoa(String nome) {
		System.out.println(nome);
	}
	
	//Método construtor
	Pessoa(String nome, int idade) {
		System.out.println(nome+" "+idade);
	}
}

