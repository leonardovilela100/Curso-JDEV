package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava4 {

	public static void main(String[] args) throws ParseException {

		
	long dias =	ChronoUnit.YEARS.between(LocalDate.parse("2021-02-01"), LocalDate.now()); // Total de dias de uma data até hoje
	System.out.println("Possui " + dias + " dias entra a faixa de data");
		
	}

}
