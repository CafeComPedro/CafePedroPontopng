package ação;

import javax.swing.table.DefaultTableModel;

import beans.Jogo;
import principal.Principal;

public class Ação {

		//Cadastrar Jogo
	public void Cadastrar(Jogo j) {
		Principal.vetorJogos.add(j);
	}
	
	//Selecione Jogos
		public DefaultTableModel selecionar() {
				DefaultTableModel Dadostabela = new DefaultTableModel();
				Dadostabela.addColumn("Nome");
				Dadostabela.addColumn("Genero");
				Dadostabela.addColumn("Valor");
				Dadostabela.addColumn("Classificação");
				Dadostabela.addColumn("Plataforma");
		
		
		for(int i = 0; i<Principal.vetorJogos.size(); i++) {
			Dadostabela.addRow(new Object[] {
					Principal.vetorJogos.get(i).getJogo(),
					Principal.vetorJogos.get(i).getGenero(),
					Principal.vetorJogos.get(i).getValor(),
					Principal.vetorJogos.get(i).getClassificação(),
					Principal.vetorJogos.get(i).getPlataforma(),
					});
		}
		
		return Dadostabela;
	}

	//Excluir Jogo
	public void excluir(int indice) {
		Principal.vetorJogos.remove(indice);
	}
	
	//Alterar o Jogo
	public void alterar(int indice, Jogo j) {
		Principal.vetorJogos.set(indice, j);
	}
	
}
