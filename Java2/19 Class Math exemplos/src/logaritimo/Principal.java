package logaritimo;

public class Principal {

	public static void main(String[] args) {
//● log (número) - logaritmo natural de um número. ● log10 (número) - logaritmo natural de um número na base 10 ● log1p (número) - logaritmo natural de um número somado a 1. Esse método retorna um resultado mais confiável se o número em questão for muito próximo a 0 ou um número fracionado. Ou seja, o resultado não é o mesmo entre os métodos log1p (0.1f) e log (1+0.1f). 
		 
		
		//Variavel nr contendo um número
		double nr = 5;
		
		//Trabalhando com as funções log
		System.out.println("Resultado: "+Math.log(nr+1));
	}

}
