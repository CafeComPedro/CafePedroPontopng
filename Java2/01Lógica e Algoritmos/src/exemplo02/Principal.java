package exemplo02;

public class Principal {

	
	public static void main(String[] args) {
		
		//N�meros inteiros
		byte numero1 = 127;  				//-128 at� 127
		short numero2 = 32767;  			//-32778 at� 32767
		int numero3 = 2147483647;			//-2147483648 at� 2147483647
		long numero4 = 100;					//-9223372036854775898 at� 9223372036854775898 
		
		//N�meros reais
		float numero5 = 7.59f;   //ate 7 casas
		double numero6 = 8.33;   //ate 15 casas
		
		//L�gico
		boolean acao = true; //True ou  False
		
		//Letra
		char letra = 'a'; // ' <- uma letra 
		char ascii = 65;  //Converter o c�digo em uma tecla(tabela ascii)
		
		//System.out.println(); <-syso
		
		//Texto
		String texto = "Aprendendo Java na Proway!";
		
		//Concatena��o
		System.out.println("O valor da variavel byte �:"+numero1);
		System.out.println("O valor da variavel short �:"+numero2);
		System.out.println("O valor da variavel int �:"+numero3);
		System.out.println("O valor da variavel long �:"+numero4);
		System.out.println("O valor da variavel float �:"+numero5);
		System.out.println("O valor da variavel double �:"+numero6);
		System.out.println("O valor da variavel boolean �:"+acao);
		System.out.println("O valor da variavel char �:"+letra);
		System.out.println("O valor da variavel char �:"+ascii);
		System.out.println("O valor da variavel string �:"+texto);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
