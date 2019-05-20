package exercício01;

import java.time.LocalDateTime;
public class Principal {
	public static void main(String[] args) {
		//Instanciando um objeto contendo a data e a hora
				LocalDateTime tempo = LocalDateTime.now();
				
				
		//Instanciar objeto contendo a data e a hora
				LocalDateTime tampo = LocalDateTime.now();
				
				
				//Obtendo dia, mês e ano
				int dia = tempo.getDayOfMonth();
				int mes = tempo.getMonthValue();
				int ano = tempo.getYear();
				
				
				//Obtendo a hora, o min e o seg
				int seg = tampo.getSecond();
				int min = tampo.getMinute();
				int hora = tampo.getHour();
				
				String destenso = null;
				String mestenso = null;
				String aestenso = null;
				
				String sestenso = null;
				String minestenso = null;
				String hestenso = null;
				
				// Dia
				if((dia == 1)) {
					destenso = "primeiro";
				}else if((dia == 2)) {
					destenso = "dois";
				}else if((dia == 3)) {
					destenso = "três";
				}else if((dia == 4)) {
					destenso = "quatro";
				}else if((dia == 5)) {
					destenso = "cinco";
				}else if((dia == 6)) {
					destenso = "seis";
				}else if((dia == 7)) {
					destenso = "sete";
				}else if((dia == 8)) {
					destenso = "oito";
				}else if((dia == 9)) {
					destenso = "nove";
				}else if((dia == 10)) {
					destenso = "dez";
				}else if((dia == 11)) {
					destenso = "onze";
				}else if((dia == 12)) {
					destenso = "doze";
				}else if((dia == 13)) {
					destenso = "treze";
				}else if((dia == 14)) {
					destenso = "quatorze";
				}else if((dia == 15)) {
					destenso = "quinze";
				}else if((dia == 16)) {
					destenso = "dezeseis";
				}else if((dia == 17)) {
					destenso = "dezessete";
				}else if((dia == 18)) {
					destenso = "dezoito";
				}else if((dia == 19)) {
					destenso = "dezenove";
				}else if((dia == 20)) {
					destenso = "vinte";
				}else if((dia == 21)) {
					destenso = "vinte e um";
				}else if((dia == 22)) {
					destenso = "vinte e dois";
				}else if((dia == 23)) {
					destenso = "vinte e três";
				}else if((dia == 24)) {
					destenso = "vinte e quatro";
				}else if((dia == 25)) {
					destenso = "vinte e cinco";
				}else if((dia == 26)) {
					destenso = "vinte e seis";
				}else if((dia == 27)) {
					destenso = "vinte e sete";
				}else if((dia == 28)) {
					destenso = "vinte e oito";
				}else if((dia == 29)) {
					destenso = "vinte e nove";
				}else if((dia == 30)) {
					destenso = "trinta";
				}else if((dia == 31)) {
					destenso = "trinta e um";
				}
				
				
				
				//mês
				
				if((mes == 1)) {
					mestenso = "janeiro";
				}else if((mes == 2)) {
					mestenso = "fevereiro";
				}else if((mes == 3)) {
					mestenso = "março";
				}else if((mes == 4)) {
					mestenso = "abri";
				}else if((mes == 5)) {
					mestenso = "maio";
				}else if((mes == 6)) {
					mestenso = "junho";
				}else if((mes == 7)) {
					mestenso = "julho";
				}else if((mes == 8)) {
					mestenso = "agosto";
				}else if((mes == 9)) {
					mestenso = "setembro";
				}else if((mes == 10)) {
					mestenso = "outubro";
				}else if((mes == 11)) {
					mestenso = "novembro";
				}else if((mes == 12)) {
					mestenso = "dezembro";
				}
				
				//ano
				
				if((ano == 2019)) {
					aestenso = "dois mil e dezenove";
				}else if((ano == 2020)) {
					aestenso = "dois mil e vinte";
				}else if((ano == 2021)) {
					aestenso = "dois mil e vinte e um";
				}else if((ano == 2022)) {
					aestenso = "dois mil e vinte e dois";
				}else if((ano == 2023)) {
					aestenso = "dois mil e vinte e três";
				}else if((ano == 2024)) {
					aestenso = "dois mil e vinte e quatro";
				}else if((ano == 2025)) {
					aestenso = "dois mil e vinte e cinco";
				}else if((ano == 2026)) {
					aestenso = "dois mil e vinte e seis";
				}else if((ano == 2027)) {
					aestenso = "dois mil e vinte e sete";
				}else if((ano == 2028)) {
					aestenso = "dois mil e vinte e oito";
				}else if((ano == 2029)) {
					aestenso = "dois mil e vinte e nove";
				}else if((ano == 2030)) {
					aestenso = "dois mil e trinta";
				}
				
	
				//hora
				
				if((hora == 1)) {
					hestenso = "uma";
				}else if((hora == 2)) {
					hestenso = "dois";
				}else if((hora == 3)) {
					hestenso = "três";
				}else if((hora == 4)) {
					hestenso = "quatro";
				}else if((hora == 5)) {
					hestenso = "cinco";
				}else if((hora == 6)) {
					hestenso = "seis";
				}else if((hora == 7)) {
					hestenso = "sete";
				}else if((hora == 8)) {
					hestenso = "oito";
				}else if((hora == 9)) {
					hestenso = "nove";
				}else if((hora == 10)) {
					hestenso = "dez";
				}else if((hora == 11)) {
					hestenso = "dez"; 
				}else if((hora == 12)) {
					hestenso = "dez";
				}else if((hora == 13)) {
					hestenso = "treze";
				}else if((hora == 14)) {
					hestenso = "quatorze";
				}else if((hora == 15)) {
					hestenso = "quinze";
				}else if((hora == 16)) {
					hestenso = "dezeseis";
				}else if((hora == 17)) {
					hestenso = "dezessete";
				}else if((hora == 18)) {
					hestenso = "dezoito";
				}else if((hora == 19)) {
					hestenso = "dezenove";
				}else if((hora == 20)) {
					hestenso = "vinte";
				}else if((hora == 21)) {
					hestenso = "vinte e um";
				}else if((hora == 22)) {
					hestenso = "vinte e dois";
				}else if((hora == 23)) {
					hestenso = "vinte e três";
				}else if((hora == 24)) {
					hestenso = "vinte e quatro";
				}
				
				
				
				
				//minuto
				
				if((min == 0)) {
					minestenso = "zero";
				}else if((min == 1)) {
					minestenso = "primeiro";
				}else if((min == 2)) {
					minestenso = "dois";
				}else if((min == 3)) {
					minestenso = "três";
				}else if((min == 4)) {
					minestenso = "quatro";
				}else if((min == 5)) {
					minestenso = "cinco";
				}else if((min == 6)) {
					minestenso = "seis";
				}else if((min == 7)) {
					minestenso = "sete";
				}else if((min == 8)) {
					minestenso = "oito";
				}else if((min == 9)) {
					minestenso = "nove";
				}else if((min == 10)) {
					minestenso = "dez";
				}else if((min == 11)) {
					minestenso = "onze";
				}else if((min == 12)) {
					minestenso = "doze";
				}else if((min == 13)) {
					minestenso = "treze";
				}else if((min == 14)) {
					minestenso = "quatorze";
				}else if((min == 15)) {
					minestenso = "quinze";
				}else if((min == 16)) {
					minestenso = "dezeseis";
				}else if((min == 17)) {
					minestenso = "dezessete";
				}else if((min == 18)) {
					minestenso = "dezoito";
				}else if((min == 19)) {
					minestenso = "dezenove";
				}else if((min == 20)) {
					minestenso = "vinte";
				}else if((min == 21)) {
					minestenso = "vinte e um";
				}else if((min == 22)) {
					minestenso = "vinte e dois";
				}else if((min == 23)) {
					minestenso = "vinte e três";
				}else if((min == 24)) {
					minestenso = "vinte e quatro";
				}else if((min == 25)) {
					minestenso = "vinte e cinco";
				}else if((min == 26)) {
					minestenso = "vinte e seis";
				}else if((min == 27)) {
					minestenso = "vinte e sete";
				}else if((min == 28)) {
					minestenso = "vinte e oito";
				}else if((min == 29)) {
					minestenso = "vinte e nove";
				}else if((min == 30)) {
					minestenso = "trinta";
				}else if((min == 31)) {
					minestenso = "trinta e um";
				}else if((min == 32)) {
					minestenso = "trinta e dois";
				}else if((min == 33)) {
					minestenso = "trinta e três";
				}else if((min == 34)) {
					minestenso = "trinta e quatro";
				}else if((min == 35)) {
					minestenso = "trinta e cinco";
				}else if((min == 36)) {
					minestenso = "trinta e seis";
				}else if((min == 37)) {
					minestenso = "trinta e sete";
				}else if((min == 38)) {
					minestenso = "trinta e oito";
				}else if((min == 39)) {
					minestenso = "trinta e nove";
				}else if((min == 40)) {
					minestenso = "quarenta";
				}else if((min == 41)) {
					minestenso = "quarenta e um";
				}else if((min == 42)) {
					minestenso = "quarenta e dois";
				}else if((min == 43)) {
					minestenso = "quarenta e tres";
				}else if((min == 44)) {
					minestenso = "quarenta e quatro";
				}else if((min == 45)) {
					minestenso = "quarenta e cinco";
				}else if((min == 46)) {
					minestenso = "quarenta e seis";
				}else if((min == 47)) {
					minestenso = "quarenta e sete";
				}else if((min == 48)) {
					minestenso = "quarenta e oito";
				}else if((min == 49)) {
					minestenso = "quarenta e nove";
				}else if((min == 50)) {
					minestenso = "cinquenta";
				}else if((min == 51)) {
					minestenso = "cinquenta e um";
				}else if((min == 52)) {
					minestenso = "cinquenta e dois";
				}else if((min == 53)) {
					minestenso = "cinquenta e três";
				}else if((min == 54)) {
					minestenso = "cinquenta e quatro";
				}else if((min == 55)) {
					minestenso = "cinquenta e cinco";
				}else if((min == 56)) {
					minestenso = "cinquenta e seis";
				}else if((min == 57)) {
					minestenso = "cinquenta e sete";
				}else if((min == 58)) {
					minestenso = "cinquenta e oito";
				}else if((min == 59)) {
					minestenso = "cinquenta e nove";
				}
				
				
				
				//segundo
				
				if((seg == 0)) {
					sestenso = "zero";
				}else if((seg == 1)) {
					sestenso = "primeiro";
				}else if((seg == 2)) {
					sestenso = "dois";
				}else if((seg == 3)) {
					sestenso = "três";
				}else if((seg == 4)) {
					sestenso = "quatro";
				}else if((seg == 5)) {
					sestenso = "cinco";
				}else if((seg == 6)) {
					sestenso = "seis";
				}else if((seg == 7)) {
					sestenso = "sete";
				}else if((seg == 8)) {
					sestenso = "oito";
				}else if((seg == 9)) {
					sestenso = "nove";
				}else if((seg == 10)) {
					sestenso = "dez";
				}else if((seg == 11)) {
					sestenso = "onze";
				}else if((seg == 12)) {
					sestenso = "doze";
				}else if((seg == 13)) {
					sestenso = "treze";
				}else if((seg == 14)) {
					sestenso = "quatorze";
				}else if((seg == 15)) {
					sestenso = "quinze";
				}else if((seg == 16)) {
					sestenso = "dezeseis";
				}else if((seg == 17)) {
					sestenso = "dezessete";
				}else if((seg == 18)) {
					sestenso = "dezoito";
				}else if((seg == 19)) {
					sestenso = "dezenove";
				}else if((seg == 20)) {
					sestenso = "vinte";
				}else if((seg == 21)) {
					sestenso = "vinte e um";
				}else if((seg == 22)) {
					sestenso = "vinte e dois";
				}else if((seg == 23)) {
					sestenso = "vinte e três";
				}else if((seg == 24)) {
					sestenso = "vinte e quatro";
				}else if((seg == 25)) {
					sestenso = "vinte e cinco";
				}else if((seg == 26)) {
					sestenso = "vinte e seis";
				}else if((seg == 27)) {
					sestenso = "vinte e sete";
				}else if((seg == 28)) {
					sestenso = "vinte e oito";
				}else if((seg == 29)) {
					sestenso = "vinte e nove";
				}else if((seg == 30)) {
					sestenso = "trinta";
				}if((seg == 31)) {
					sestenso = "trinta e um";
				}else if((seg == 32)) {
					sestenso = "trinta e dois";
				}else if((seg == 33)) {
					sestenso = "trinta e três";
				}else if((seg == 34)) {
					sestenso = "trinta e quatro";
				}else if((min == 35)) {
					sestenso = "trinta e cinco";
				}else if((seg == 36)) {
					sestenso = "trinta e seis";
				}else if((seg == 37)) {
					sestenso = "trinta e sete";
				}else if((seg == 38)) {
					sestenso = "trinta e oito";
				}else if((seg == 39)) {
					sestenso = "trinta e nove";
				}else if((seg == 40)) {
					sestenso = "quarenta";
				}else if((seg == 41)) {
					sestenso = "quarenta e um";
				}else if((seg == 42)) {
					sestenso = "quarenta e dois";
				}else if((seg == 43)) {
					sestenso = "quarenta e tres";
				}else if((seg == 44)) {
					sestenso = "quarenta e quatro";
				}else if((seg == 45)) {
					sestenso = "quarenta e cinco";
				}else if((seg == 46)) {
					sestenso = "quarenta e seis";
				}else if((seg == 47)) {
					sestenso = "quarenta e sete";
				}else if((seg == 48)) {
					sestenso = "quarenta e oito";
				}else if((seg == 49)) {
					sestenso = "quarenta e nove";
				}else if((seg == 50)) {
					sestenso = "cinquenta";
				}else if((seg == 51)) {
					sestenso = "cinquenta e um";
				}else if((seg == 52)) {
					sestenso = "cinquenta e dois";
				}else if((seg == 53)) {
					sestenso = "cinquenta e três";
				}else if((seg == 54)) {
					sestenso = "cinquenta e quatro";
				}else if((seg == 55)) {
					sestenso = "cinquenta e cinco";
				}else if((seg == 56)) {
					sestenso = "cinquenta e seis";
				}else if((seg == 57)) {
					sestenso = "cinquenta e sete";
				}else if((seg == 58)) {
					sestenso = "cinquenta e oito";
				}else if((seg == 59)) {
					sestenso = "cinquenta e nove";

				}
				
				
				//Exibir data
				System.out.println(dia+"/"+mes+"/"+ano+"   "+hora+":"+min+":"+seg);
				
				//Exibir data por extenso
				System.out.println("hoje é dia "+destenso+" de "+mestenso+" de "+aestenso);
				System.out.println("nesse exato momento são "+hestenso+" horas, "+minestenso+" minutos e "+sestenso+" segundos");
	}
}
