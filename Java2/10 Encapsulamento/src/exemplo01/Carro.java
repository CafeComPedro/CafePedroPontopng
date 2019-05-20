package exemplo01;

public class Carro {

	/*
	 * Encapsulamento: VIsibilidade de atributos e métodos
	 * Default: Atributos e métodos visiveies em todo  pacote
	 * Public: Atributos e métos visiveis enm todo o proheto
	 * PRIVATE: atributos e métodos visiveis apenas na classe onde são criados
	 * PORTECTED: Atributos e métodos visiveis apenas nos pacotes onde são criados ou em classes herdadas
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
