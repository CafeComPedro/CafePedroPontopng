package exemplo01;

public class Carro {

	/*
	 * Encapsulamento: VIsibilidade de atributos e m�todos
	 * Default: Atributos e m�todos visiveies em todo  pacote
	 * Public: Atributos e m�tos visiveis enm todo o proheto
	 * PRIVATE: atributos e m�todos visiveis apenas na classe onde s�o criados
	 * PORTECTED: Atributos e m�todos visiveis apenas nos pacotes onde s�o criados ou em classes herdadas
	 */
	
	private String modelo, fabricante;
	private int ano;
	
	//set & get
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
