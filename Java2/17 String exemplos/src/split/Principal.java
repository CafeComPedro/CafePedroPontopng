package split;

public class Principal {

	public static void main(String[] args) {

		//Criando uma variavel do tipo String
		//e atribuindo valroes separados por virgula
		String linguagens = "Java, C#, PHP, Delphi, VBA, Python";
		
		//Separando as linguagens contidas na variavel acima
		//e adicionando em uma posição do array
		String vetor[] = linguagens.split(", ");
		
		//Exibindo as linguagens separadamente em suas devidas posições
	System.out.println(vetor[0]);
	System.out.println(vetor[1]);
	System.out.println(vetor[2]);
	System.out.println(vetor[3]);
	System.out.println(vetor[4]);
	System.out.println(vetor[5]);
	
	}

}
