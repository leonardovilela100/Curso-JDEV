package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava9_API_DATA4 {

	public static void main(String[] args) throws ParseException {

		
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		/*
		System.out.println("Mais 5 dias "+ (dataBase = dataBase.plusDays(5)));
		
		System.out.println("Mais 5 semanas "+(dataBase = dataBase.plusWeeks(5)));
		
		System.out.println("Mais 5 anos "+ (dataBase = dataBase.plusYears(5)));
		
		System.out.println("Mais 2 meses "+ (dataBase = dataBase.plusMonths(2)));
		
		System.out.println("Menos 1 anos "+ (dataBase = dataBase.plusYears(-1)));
		
		System.out.println("Menos 1 mes "+ (dataBase = dataBase.minusMonths(1)));
		
		System.out.println("Menos 20 dias "+ (dataBase = dataBase.minusDays(20)));
	*/
		
		for (int mes = 1; mes <= 12; mes++) {
			dataBase = dataBase.plusMonths(1);
			
			System.out.println("Data de vencimento do boleto: " + 
			dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyy")) + " do mês: " + mes );
			
		}
	


	}

}
