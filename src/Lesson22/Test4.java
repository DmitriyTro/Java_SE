package Lesson22;

public class Test4 {
	public static void main(String[] args) {
		byte b = 10;
		int a = b;

		int a1 = 10;
		short s1 = (short) a1; // casting or constant variable a1 (byte short and char)

		int i = 5;
		long l = 10L;

		i = (int) (i * l); // i *= l;
		System.out.println(i + l);
	}
}
