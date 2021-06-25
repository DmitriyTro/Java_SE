package Lesson4;

public class MethodOverloading {

	void show(int i1) {
		System.out.println(i1);
	}

	void show(boolean b1) {
		System.out.println(b1);
	}

	void show(String s1) {
		System.out.println(s1);
	}

	public int sum(int a, int b) {
		return a + b;
	}

	protected String sum(String a, String b) {
		return a + b;
	}
}

class MethodOverloadingTest {
	public static void main(String[] args) {
		MethodOverloading mO = new MethodOverloading();
		int a = 500;
		boolean b = true;
		String s = "Hello";

		mO.show(a);
		mO.show(b);
		mO.show(s);

		int a1 = mO.sum(5, 3);
		System.out.println(a1);

		String s1 = mO.sum("Hello", " World!");
		System.out.println(s1);
	}
}
