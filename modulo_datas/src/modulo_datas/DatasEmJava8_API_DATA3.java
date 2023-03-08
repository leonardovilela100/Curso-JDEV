package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava8_API_DATA3 {

	public static void main(String[] args) throws ParseException {

	DateTimeFormatter dataFormatada =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
	LocalDate localDate = LocalDate.now();
	System.out.println("Data Atual: " + localDate.format(dataFormatada));
	
	System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
	
	System.out.println("Dia da mês: " + localDate.getDayOfMonth());
	
	System.out.println("Dia da ano: " + localDate.getDayOfYear());
	
	System.out.println("mês: " + localDate.getYear());
	
	


	}

}
