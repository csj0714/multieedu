package test.com;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test02Date {

	public static void main(String[] args) {
		System.out.println("Date...");

		Date d = new Date();
		System.out.println(d);

		java.sql.Date sd = new java.sql.Date(0);
		System.out.println(sd);

		sd = new java.sql.Date(System.currentTimeMillis());
		System.out.println(sd);

		Timestamp tt = new Timestamp(0);
		System.out.println(tt);

		tt = new Timestamp(System.currentTimeMillis());
		System.out.println(tt);

		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		System.out.println(gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.MONTH));// 0>>1월
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));
		System.out.println(gc.get(Calendar.HOUR_OF_DAY));
		System.out.println(gc.get(Calendar.MINUTE));
		System.out.println(gc.get(Calendar.SECOND));

		gc = new GregorianCalendar(2002, 5, 25, 12, 12, 12);
		System.out.println(gc);
		System.out.println(gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.MONTH));// 0>>1월
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));
		System.out.println(gc.get(Calendar.HOUR_OF_DAY));
		System.out.println(gc.get(Calendar.MINUTE));
		System.out.println(gc.get(Calendar.SECOND));

	}// end main

}// end class