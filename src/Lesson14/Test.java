package Lesson14;

public class Test {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("abcdfgabc");

		int a = s1.length();
		System.out.println(a);

		char c = s1.charAt(3);
		System.out.println(c);

		int i1 = s1.indexOf('o');
		System.out.println(i1);

		int i2 = s1.indexOf("lo");
		System.out.println(i2);

		int i3 = s2.indexOf('a', 5);
		System.out.println(i3);

		boolean i4 = s2.startsWith("abc", 6);
		System.out.println(i4);

		boolean i5 = s2.endsWith("abc");
		System.out.println(i5);
	}
}
