package Lesson13;

public class Test8 {
	public static void main(String[] args) {

		OUTER:
		for (int hours = 0; hours < 24; hours++) {
			int minutes = 0;
			INNER:
			while (minutes < 60) {
				System.out.println(hours + ":" + minutes);
				minutes++;
			}
		}
	}
}
