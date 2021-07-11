package Lesson25;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test {
	public static void main(String[] args) {
//		System.out.println(LocalDate.now());
//		System.out.println(LocalTime.now());
//		System.out.println(LocalDateTime.now());
		LocalDate ld = LocalDate.of(2014, 5, 15);
		System.out.println(ld);
		LocalDate ld2 = LocalDate.of(2014, Month.DECEMBER, 22);
		System.out.println(ld2);

		LocalTime lt = LocalTime.of(15, 30);
		System.out.println(lt);

		LocalDateTime ldt = LocalDateTime.of(2015, Month.FEBRUARY, 10, 17, 25);
		System.out.println(ldt);

		LocalDateTime ldt2 = LocalDateTime.of(ld, lt);
		System.out.println(ldt2);

		ld = ld.minusMonths(6);
		System.out.println(ld);
	}
}

