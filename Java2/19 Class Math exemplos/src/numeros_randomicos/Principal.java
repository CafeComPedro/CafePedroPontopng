package numeros_randomicos;

public class Principal {

	public static void main(String[] args) {

		//Variaveis
		int limiteMinimo = 0;
		int limiteMaximo = 10;
		
		//Gerar random (Ir� gerar um n�mero random quebrado)
		double gerarAleatorio = Math.random();
		
		//Atribuir um numero entre 0 e 10
		int numero = (int) Math.round(limiteMinimo + gerarAleatorio * limiteMaximo);
		
		//Exibir o numero aleat�rio
		System.out.println(numero);
		
	}

}
