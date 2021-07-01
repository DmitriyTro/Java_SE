package Lesson14;

public class Test8 {
	public static void main(String[] args) {
		String s1 = new String("ok");
		String s2 = new String("ok");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println();

		String s3 = "Hello";
		String s4 = "Hello";

		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

		System.out.println();

		System.out.println(s1 != s4);

		String s5 = "Hello World";
		String s6 = "hello world";

		System.out.println(s5.equalsIgnoreCase(s6));
	}
}
