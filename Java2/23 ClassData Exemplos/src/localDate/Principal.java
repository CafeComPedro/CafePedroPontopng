package localDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Principal {

	public static void main(String[] args) {

		//Instanciar objeto contando a data e a hora
		LocalDateTime tempo = LocalDateTime.now();
		
		//Extraíndo apenas a data
		LocalDate data = tempo.toLocalDate();
		
		//Exibindo a data
		System.out.println("Data: " + data );
	}

}
