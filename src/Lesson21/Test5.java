package Lesson21;

public class Test5 {
}

interface I1 {

	void abc();

	default void def() {
		System.out.println("def");
	}

	static void fed() {
		System.out.println("fed 1");
	}
}

interface I2 extends I1 {

	static void fed() {
		System.out.println("fed 2");
	}
}

class Z2 implements I1, I2 {
	public static void main(String[] args) {
		Z2 z = new Z2();
		z.abc();
		z.def();


		I1.fed();
		I2.fed();
	}

	@Override
	public void abc() {
		System.out.println("abc");
	}
}