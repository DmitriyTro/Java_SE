package Lesson20;

public class A10 {
	String s1 = "Hello";
	static double d1 = 3.14;

	int sum(int... i) {
		int result = 0;
		for (int a : i) {
			result += a;
		}
		return result;
	}

	static void abc() {
		System.out.println("Static method");
	}
}

class B10 extends A10 {
	String s1 = super.s1 + ", friend";
	double d1 = super.d1;

	int sum(int... i) {
		int result = super.sum(i);
		System.out.println("Sum: " + result);
		super.abc();
		return result;
	}

	public static void main(String[] args) {
		B10 b = new B10();

		System.out.println(b.s1);
	}
}
