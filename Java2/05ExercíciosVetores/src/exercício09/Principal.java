package exerc�cio09;

public class Principal {

	public static void main(String[] args) {

		//Matriz
		int[][] matriz = {
				{1,2},
				{3,4},
				{5,6}
		};
		
	//Exibi��o 01
		for(int linha = 0; linha <3; linha++) {
			for(int coluna = 0; coluna<2; coluna++) {
				System.out.println(matriz[linha][coluna]+" ");
			}
			System.out.println();
		}
		//Exibi��o 02
		System.out.println("---------------------");
		
		
	}

}
