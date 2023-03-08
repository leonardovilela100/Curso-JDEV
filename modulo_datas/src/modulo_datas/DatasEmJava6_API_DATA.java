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

public class DatasEmJava6_API_DATA {

	public static void main(String[] args) throws ParseException {

		/*Nova API data */
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data atual "+ dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalTime horaAtua = LocalTime.now();
		
		System.out.println("Hora atual "+horaAtua.format(DateTimeFormatter.ofPattern("HH:mm")));
		
		LocalDateTime dataAtualEHoraAtuaLocal = LocalDateTime.now();
		
		System.out.println("Data e hora atual "+ dataAtualEHoraAtuaLocal.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		
		


	}

}
