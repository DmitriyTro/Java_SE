package Lesson25;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test4 {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
		LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16, 40);
		LocalTime lt = LocalTime.of(16,40);
//		System.out.println(ld.getDayOfWeek());
//		System.out.println(ldt.getDayOfMonth());
//		System.out.println(ld.getMonthValue());

//		DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
//		System.out.println(ld);
//		System.out.println(ld.format(d1));
//
//		DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
//		System.out.println(lt);
//		System.out.println(lt.format(d2));
//
//		DateTimeFormatter d3 = DateTimeFormatter.ISO_WEEK_DATE;
//		System.out.println(ld);
//		System.out.println(ld.format(d3));

//		DateTimeFormatter shortFormater = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//		System.out.println(ld.format(shortFormater));

//		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM, yyyy, hh:mm");
//		System.out.println(ldt);
//		System.out.println(ldt.format(f));

		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date2 = LocalDate.parse("01 02 2015", f1);
		System.out.println(date2);
	}
}
