package Lesson12;

public class Test5 {

	static void time() {
		OUTER:
		for (int hours = 0; hours <= 6; hours++) {
			MIDDLE:
			for (int minutes = 0; minutes <= 59; minutes++) {
				if (hours > 1 && minutes % 10 == 0) {
					break OUTER;
				}
				INNER:
				for (int seconds = 0; seconds <= 59; seconds++) {
					if (seconds * hours > minutes) {
						continue INNER;
					}
					System.out.println(hours + ":" + minutes + ":" + seconds);
				}
			}
		}
	}

	public static void main(String[] args) {
		time();
	}
}
