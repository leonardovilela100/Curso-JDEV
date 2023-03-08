package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava3 {

	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance(); // pega a data atual
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));
		
		calendar.add(calendar.DAY_OF_MONTH, 1);	
		
		System.out.println("Somando dia do mês: "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(calendar.MONTH, 1);
		
		System.out.println("Somando o mês: "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(calendar.YEAR, 1);
		
		System.out.println("Somando 1 ano: "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
		
	}

}
