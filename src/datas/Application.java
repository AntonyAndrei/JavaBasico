package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Application {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat data2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat data3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		data3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date y1 = data.parse("25/06/2018");
		Date y2 = data2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2020-07-09T10:05:22z"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		
		System.out.println("---------------------------");
		System.out.println("y1: " + data2.format(y1));
		System.out.println("y2: " + data2.format(y2));
		System.out.println("x1: " + data2.format(x1));
		System.out.println("x2: " + data2.format(x2));
		System.out.println("y3: " + data2.format(y3));
		System.out.println("---------------------------");
		System.out.println("y1: " + data3.format(y1));
		System.out.println("y2: " + data3.format(y2));
		System.out.println("x1: " + data3.format(x1));
		System.out.println("x2: " + data3.format(x2));
		System.out.println("y3: " + data3.format(y3));
		
	}

}
