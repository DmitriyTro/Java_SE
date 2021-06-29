package Lesson10;

public class Test2 {

	void abc() {
		String str;
		int a = 10;

		if (a >= 10) {
			str = "Hello";
		} else if (a < 10) {
			str = "Bye";
		} else {
			str = null;
		}
		System.out.println(str);
	}

	void max(int i, int b, int c) {
		if (i > b && i > c) {
			System.out.println("Maximum = " + i);
		} else if (b > i && b > c) {
			System.out.println("Maximum = " + b);
		} else {
			System.out.println("Maximum = " + c);
		}
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		Test2 test = new Test2();

		test.abc();

		test.max(4, 7,2);

		int maximum = (a > b) ? a : b;
		System.out.println(maximum);
	}
}
