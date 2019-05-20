package exemplo02;

public class carro {

	//Atributos
	private String modelo, fabricante;
	private int ano;
	
	//contrutor
	public carro(String modelo, String fabricante, int ano) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
		
		exibirDados();
	}
	
	//Exibir dados
	private void exibirDados() {
		System.out.println(modelo);
		System.out.println(fabricante);
		System.out.println(ano);
	}
}
