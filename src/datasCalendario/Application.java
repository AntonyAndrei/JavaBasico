package datasCalendario;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Application {

	public static void main(String[] args) {

		SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(formato1.format(d));
		
		
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(d);
		calendario.add(Calendar.HOUR_OF_DAY, 4);
		d = calendario.getTime();
		System.out.println(formato1.format(d));
		
		int minutos = calendario.get(Calendar.MINUTE);
		System.out.println("A quantidade de minutos separada da data eh: " + minutos);
		int mes = 1 + calendario.get(Calendar.MONTH);
		System.out.println("O numero do Mes separado da data eh: " + mes);
	}

}
