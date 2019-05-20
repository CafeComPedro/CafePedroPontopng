package localDate_dia_mes_ano;

import java.time.LocalDateTime;

public class Principal {

	public static void main(String[] args) {

		//Instanciando um objeto contendo a data e a hora
		LocalDateTime tempo = LocalDateTime.now();
		
		//Obtendo dia, mês e ano
		int dia = tempo.getDayOfMonth();
		int mes = tempo.getMonthValue();
		int ano = tempo.getYear();
		
		
		//Exibir data
		System.out.println(dia+"/"+mes+"/"+ano);

	
	}

}
