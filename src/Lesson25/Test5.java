package Lesson25;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test5 {

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

	public void smena(LocalDateTime start, LocalDateTime end, Period p, Duration d) {
		while (start.isBefore(end)) {
			System.out.print("Работаем с: " + start.format(dtf));
			start = start.plus(p);
			System.out.println("   До: " + start.format(dtf));
			System.out.print("Отдыхаем с: " + start.format(dtf2));
			start = start.plus(d);
			System.out.println("   До: " + start.format(dtf2));
		}
	}

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 21, 15, 40);
		LocalDateTime ldt2 = LocalDateTime.of(2016, 4, 15, 10, 40);
		Period p = Period.of(0, 1, 2);
		Duration d = Duration.ofDays(4);

		Test5 test = new Test5();
		test.smena(ldt, ldt2, p, d);
	}
}
