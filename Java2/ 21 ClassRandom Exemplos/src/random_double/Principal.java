package random_double;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		//Instanciar um objeto
		Random gerador = new Random();
		
		//Criando uma variavel e add um valor numérico randômico
		double resultado = gerador.nextDouble();
		
		//Exibindo o valor da variavel resultado
		System.out.println(resultado);
		
	}

}
