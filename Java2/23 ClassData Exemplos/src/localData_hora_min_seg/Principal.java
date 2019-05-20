package localData_hora_min_seg;

import java.time.LocalDateTime;

public class Principal {

	public static void main(String[] args) {

		//Instanciar objeto contendo a data e a hora
		LocalDateTime tempo = LocalDateTime.now();
		
		//Obtendo a hora, o min e o seg
		int segundo = tempo.getSecond();
		int min = tempo.getMinute();
		int hora = tempo.getHour();
		
		System.out.println(hora+":"+min+":"+segundo);

	}

}
