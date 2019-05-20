package random_int;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		//Instanciando um objeto
		Random gerador = new Random();
		
		//Criando uma variavel e add um valor numérico randomico~
		int resultado = gerador.nextInt();
		
		//Exibindo o valor da variavel resultado
		System.out.println(resultado);
		
	}

}
