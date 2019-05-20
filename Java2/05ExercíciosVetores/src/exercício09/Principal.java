package exercício09;

public class Principal {

	public static void main(String[] args) {

		//Matriz
		int[][] matriz = {
				{1,2},
				{3,4},
				{5,6}
		};
		
	//Exibição 01
		for(int linha = 0; linha <3; linha++) {
			for(int coluna = 0; coluna<2; coluna++) {
				System.out.println(matriz[linha][coluna]+" ");
			}
			System.out.println();
		}
		//Exibição 02
		System.out.println("---------------------");
		
		
	}

}
