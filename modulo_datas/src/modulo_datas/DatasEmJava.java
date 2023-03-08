package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException {
		
		
		Calendar calendar = Calendar.getInstance();
		
		Date date = new Date();
		
		System.out.println("Data em milesegundos: "+ date.getTime());
		System.out.println("Calendar em milesegndos: "+ calendar.getTimeInMillis());
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Dia do Mês: "+ date.getDate());
		System.out.println("Calendar Dia do Mês: "+ calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Dia da Semana: "+ date.getDay());
		System.out.println("Calendar Dia da Semana: "+ (calendar.get(Calendar.DAY_OF_WEEK) -1 ));
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Hora do Dia: "+ date.getHours());
		System.out.println("Calendar Hora do Dia: "+calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Minuto da Hora: "+ date.getMinutes());
		System.out.println("Calendar Minuto da Hora: "+ calendar.get(Calendar.MINUTE));
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Segundos: " +date.getSeconds());
		System.out.println("Calendar Segundos: " + calendar.get(Calendar.SECOND));
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Ano: " +(date.getYear() + 1900));
		System.out.println("Calendar Ano: " + calendar.get(Calendar.YEAR));
		
		System.out.println("--------------------------------------------------------");
		
		/*-------------Simple Date Format-------------*/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data Atual em formato padrão e String: "+simpleDateFormat.format(date));
		System.out.println("Calendar Data Atual em formato padrão e String: "+simpleDateFormat.format(calendar.getTime()));
		
		System.out.println("--------------------------------------------------------");
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("Data em formato para banco de dados: "+  simpleDateFormat.format(date));
		System.out.println("Calendar Data em formato para banco de dados: "+  simpleDateFormat.format(calendar.getTime()));
		
		System.out.println("--------------------------------------------------------");
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Objeto Date: "+ simpleDateFormat.parse("1987-10-18"));
		
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Objeto Date: "+ simpleDateFormat.parse("10/12/1987"));
		
		
		
		
	}
	
}
