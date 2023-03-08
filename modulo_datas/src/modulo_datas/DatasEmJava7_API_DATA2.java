package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava7_API_DATA2 {

	public static void main(String[] args) throws ParseException, InterruptedException {

	DateTimeFormatter dataFormatada =  DateTimeFormatter.ofPattern("dd/MM/yyyy");

	Instant inicinio = Instant.now();
	
	Thread.sleep(2000); // Pode ser um processo com tempo qualuqer que não conhecemos 
	
	Instant ifinal = Instant.now();
	
	Duration duracao = Duration.between(inicinio, ifinal);
	
	System.out.println("Duração em nano segundos: " + duracao.toNanos());
	
	System.out.println("Duração em nano minutos: " + duracao.toMinutes());
	
	System.out.println("Duração em nano segundos: " + duracao.toHours());
	
	System.out.println("Duração em milisegundos segundos: " + duracao.toMillis());
	
	System.out.println("Duração em milisegundos segundos: " + duracao.toDays());
	


	}

}
