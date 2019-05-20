package exercício11;

public class Principal {

	public static void main(String[] args) {
		double nota1 = 7;
		double nota2 = 6;
		double nota3 = 8;
		double nota4 = 7;
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		int faltas = 14;
		
		if((media >= 7) && (faltas < 15)) {
			System.out.println("Parabéns, você foi aprovado!");
		}else {
			System.out.println("Lamento, você foi reprovado...");
		}
		

	}

}
