package Lesson12;

public class Test3 {
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i == 51) {
				continue;
			}
			if (i % 55 == 0) {
				break;
			}
			System.out.println(i);
		}
	}
}
