package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava5DataVencimento {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		
		 Date dateInicialDate =  new SimpleDateFormat("dd/MM/yyyy").parse("08/04/2021"); // Data inicial
		 
		 
		 Calendar calendar = Calendar.getInstance();
		 calendar.setTime(dateInicialDate);
		 
		 for (int parcela = 1; parcela <= 12; parcela++) {
			calendar.add(calendar.MONTH, 1);
			
			System.out.println("Parcela número " + parcela + " vencimento é em: " + dataFormatada.format(calendar.getTime()));
			
		}
		
	}

}
