package Lesson12;

public class Test4 {

//	public void time() {
//		for (int hours = 0; hours <= 23; hours++) {
//			System.out.println("Start outer loop.");

//			for (int minutes = 0; minutes <= 59; minutes++) {
//				for (int seconds = 0; seconds <= 59; seconds++) {
//					System.out.println(hours + ":" + minutes + ":" + seconds);
//				}
//			}

//			System.out.println("End outer loop.");
//		}
//	}

	public void time2() {
		OUTER:
		for (int hours = 0; hours <= 23; hours++) {
			System.out.println("Start outer loop.");

			INNER:
			for (int minutes = 0; minutes <= 59; minutes++) {
				if (minutes == 21) {
					continue INNER;
				}

				System.out.println(hours + ":" + minutes);

				if (minutes == 30) {
					break OUTER;
				}
			}

			System.out.println("End outer loop.");
		}
	}

	public static void main(String[] args) {
		Test4 test = new Test4();

//		test.time();

		test.time2();
	}
}