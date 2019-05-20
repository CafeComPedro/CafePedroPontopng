package random_boolean;

import java.util.Random;

public class Principal {
	public static void main(String[] args) {

		//Instanciando um objeto
		Random gerador = new Random();
		
		//Criando uma variavel e add um valor boolena randomico
		boolean resultado = gerador.nextBoolean();
		
		//Exibindo o valro da variavel resultado
		System.out.println(resultado);
		
}
}