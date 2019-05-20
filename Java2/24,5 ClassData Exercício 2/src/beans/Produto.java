package beans;

public class Produto {

	//Atributos
			private String Produto;
			private int Quantidade;
			private double Valor;
	
			
			//Set & Get
			public String getNomeProduto() {
				return Produto;
			}
			public void setNomeProduto(String NomeProduto) {
				this.Produto = NomeProduto;
			}public int getQuantidade() {
				return Quantidade;
			}
			public void setQuantidade(int Quantidade) {
				this.Quantidade = Quantidade;
			}public double getValor() {
				return Valor;
			}
			public void setValor(double Valor) {
				this.Valor = Valor;
			}
}
