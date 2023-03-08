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

public class DatasEmJava10_API_DATA5 {

	public static void main(String[] args) throws ParseException {

		
	LocalDate dataantiga = LocalDate.of(2020, 2, 7);
	
	LocalDate datanova = LocalDate.of(2021, 7, 4);
	
	System.out.println("Data antiga é maior que a data nova "+dataantiga.isAfter(datanova));
	
	System.out.println("Data antiga é anterior a nova "+dataantiga.isBefore(datanova));
	
	System.out.println("Datas são iguais? : " + dataantiga.isEqual(datanova));
	
	Period periodo = Period.between(dataantiga, datanova);
	
	System.out.println("Quantos dias: "+periodo.getDays());
	
	System.out.println("Quantos meses: "+periodo.getMonths());
	
	System.out.println("Somente meses: "+periodo.toTotalMonths());
	
	System.out.println("Quantos anos: "+periodo.getYears());
	
	System.out.println("Periodo de diferença entra as datas é: " +periodo.getYears()+" anos " + periodo.getMonths() + " Meses e " + periodo.getDays() + " dias");
	
	
	


	}

}
