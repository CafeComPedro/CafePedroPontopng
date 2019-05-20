package random_int2;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		
		//Instanciando um objeto
		Random gerador = new Random();
		
		//Criando uma variavel e add um valor numerico randomico
		int resultado = gerador.nextInt(10);
		
		//Exibindo o valor da variavel resultado
		System.out.println(resultado);
	}

}
