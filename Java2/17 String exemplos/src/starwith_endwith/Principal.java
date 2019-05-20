package starwith_endwith;

public class Principal {

	public static void main(String[] args) {

		//Criando uma variavel do tpo String e atribuindo um valro
		String texto = "Aprendendo JAVA no curso Entra21 com o Ralf";
		String inicio = "Entendendo";
		String fim = "Ralf";
		
		//Verificando se o texto inicia com o termo que consta na variavel inicio
		if(texto.startsWith(inicio)) {
			System.out.println("O texto inicia com o termo: "+inicio);
		}else {
			System.out.println("O texto não inicia com o termo: "+inicio);
		}
		
		//Verificando se o texto finaliza com o termo que consta na variavel fim
		if(texto.endsWith(fim)) {
			System.out.println("O texto finaliza com o termo: "+fim);
		}else {
			System.out.println("O texto não finaliza com o termo: "+fim);
		}
		
	}

}
