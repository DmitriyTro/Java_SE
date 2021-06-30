package Lesson13;

public class Test7 {
	public static void main(String[] args) {
		int hours = 0;

		OUTER:
		do {
			int minutes = 0;
			INNER:
			while (minutes < 60) {
				if (minutes == 20) {
					break OUTER;
				}
				System.out.println(hours + ":" + minutes);
				minutes++;
			}
			hours++;
		} while (hours < 24);
	}
}
