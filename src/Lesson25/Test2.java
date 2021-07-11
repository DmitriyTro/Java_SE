package Lesson25;

import java.time.LocalDate;
import java.time.Month;

public class Test2 {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2014, 5, 31);
		LocalDate ld2 = LocalDate.of(2012, Month.APRIL, 19);
		System.out.println(ld.isAfter(ld2));
		System.out.println(ld.isBefore(ld2));
	}
}
