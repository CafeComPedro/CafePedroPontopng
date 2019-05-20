package acao;

import beans.beans;

import javax.swing.table.DefaultTableModel;

import Principal.Principal;

public class acao {

	//Metodo para retornar o salario bruto
	public double salab(int indice) {
		
		double salario = 0;
		
		switch (indice ) {
		case 0:
			salario = 900;
			break;
			
		case 01:
			salario = 1300;
			break;
			
		case 02:
			salario = 1800;
			break;
	
		case 03:
			salario = 2400;
			break;
	
		case 04:
			salario = 2700;
			break;
		case 05:
			salario = 3200;
			break;
		case 06:
			salario = 3600;
			break;
		}
		return salario;
	}
	public double faltas(int faltas) {
		
		return faltas == 0 ? 50 : 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	//Cadastrar cargo
	public void cadastrar(beans j) {
		Principal.vetorCargos.add(j);
	}
	
	//Selecionar jogos
	public DefaultTableModel selecionar() {
		DefaultTableModel dadosTabela = new DefaultTableModel();
		dadosTabela.addColumn("Colaborador");
		dadosTabela.addColumn("Salario Líquido");

		
		for(int i=0; i<Principal.vetorCargos.size(); i++) {
			dadosTabela.addRow(new Object[] {
					Principal.vetorCargos.get(i).getColab(),
					Principal.vetorCargos.get(i).getSalal(),

					
			});
		}
		
		return dadosTabela;
	}


	
	
}
