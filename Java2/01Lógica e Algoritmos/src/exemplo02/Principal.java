package exemplo02;

public class Principal {

	
	public static void main(String[] args) {
		
		//Números inteiros
		byte numero1 = 127;  				//-128 até 127
		short numero2 = 32767;  			//-32778 até 32767
		int numero3 = 2147483647;			//-2147483648 até 2147483647
		long numero4 = 100;					//-9223372036854775898 até 9223372036854775898 
		
		//Números reais
		float numero5 = 7.59f;   //ate 7 casas
		double numero6 = 8.33;   //ate 15 casas
		
		//Lógico
		boolean acao = true; //True ou  False
		
		//Letra
		char letra = 'a'; // ' <- uma letra 
		char ascii = 65;  //Converter o código em uma tecla(tabela ascii)
		
		//System.out.println(); <-syso
		
		//Texto
		String texto = "Aprendendo Java na Proway!";
		
		//Concatenação
		System.out.println("O valor da variavel byte é:"+numero1);
		System.out.println("O valor da variavel short é:"+numero2);
		System.out.println("O valor da variavel int é:"+numero3);
		System.out.println("O valor da variavel long é:"+numero4);
		System.out.println("O valor da variavel float é:"+numero5);
		System.out.println("O valor da variavel double é:"+numero6);
		System.out.println("O valor da variavel boolean é:"+acao);
		System.out.println("O valor da variavel char é:"+letra);
		System.out.println("O valor da variavel char é:"+ascii);
		System.out.println("O valor da variavel string é:"+texto);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
