package Lesson4;

public class Test1 {
	int a;
	int b;
	int c;
	int d;

	int sum() {
		int result = 0;
		System.out.println("Sum result: " + result);
		return 0;
	}

	int sum(int a) {
		int result = a;
		System.out.println("Sum result: " + result);
		return a;
	}

	int sum(int a, int b) {
		int result = a + b;
		System.out.println("Sum result: " + result);
		return a + b;
	}

	int sum(int a, int b, int c) {
		int result = a + b + c;
		System.out.println("Sum result: " + result);
		return a + b + c;
	}

	int sum(int a, int b, int c, int d) {
		int result = a + b + c + d;
		System.out.println("Sum result: " + result);
		return a + b + c + d;
	}
}

class Test12 {
	public static void main(String[] args) {
		Test1 test = new Test1();
		test.sum();
		test.sum(3);
		test.sum(3,4);
		test.sum(3,4,5);
		test.sum(3,4,5,6);
	}
}
