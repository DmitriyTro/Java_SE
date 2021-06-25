package Lesson6;

public class Test1 {
	public final int a = 10;

	public static void main(String[] args) {
		Test1 t = new Test1();
		System.out.println(t.a);

	}

	public void abc(final int i) {
		final int b = 10;
		System.out.println(i + b);
	}
}

