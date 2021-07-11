package Lesson25;

import java.time.*;

public class Test3 {

	static void smenaDejurnogo(LocalDate start, LocalDate end, Period p) {
		LocalDate data = start;
		while (data.isBefore(end)) {
			System.out.println("Nastupila data: " + data + ". Pora menyat dejurnogo");
			data = data.plus(p);
		}

		LocalTime lt = LocalTime.of(10, 30);
		Duration d = Duration.ofHours(2);
		System.out.println(lt.plus(d));
	}

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2016, Month.SEPTEMBER, 1);
		LocalDate end = LocalDate.of(2017, Month.MAY, 31);
		Period p = Period.ofMonths(1);
		smenaDejurnogo(start, end, p);
	}
}
