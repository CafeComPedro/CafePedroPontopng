package Ação;

import javax.swing.table.DefaultTableModel;

import beans.Produto;
import formulaio_mercadinho.Principal;

public class Ação {

	public void cadastrar(Produto p) {
		Principal.vetorProdutos.add(j);
		
	}
	
	//Selecionar jogos
	public DefaultTableModel selecionar() {
		DefaultTableModel dadosTabela = new DefaultTableModel();
		dadosTabela.addColumn("Nome");
		dadosTabela.addColumn("Classificação");
		dadosTabela.addColumn("Valor");
		
		for(int i=0; i<Principal.vetorProdutos.size(); i++) {
			dadosTabela.addRow(new Object[] {
					Principal.vetorProdutos.get(i).getNomeProduto(),
					Principal.vetorProdutos.get(i).getQuantidade(),
					Principal.vetorProdutos.get(i).getValor(),
					
			});
		}
	
	return dadosTabela;
}

	
	//Excluir jogo
	public void excluir(int indice) {
		Principal.vetorJogos.remove(indice);
	}
	
	//Alterar jogo
	public void alterar(int indice, jogo j) {			
		Principal.vetorJogos.set(indice, j);
		
	}
	
}
