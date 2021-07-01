package Lesson14;

public class Test2 {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("abcdfgabc");
		String s3 = new String("    abcdf  gabc    ");

		String s4 = s2.substring(3);
		System.out.println(s4);

		String s41 = s2.substring(5, 9);
		System.out.println(s41);

		String s5 = s2.substring(3, 6);
		System.out.println(s5);

		String s6 = s3.trim();
		System.out.println(s6);

		String s7 = s1.replace('e', 'a');
		System.out.println(s7);

		String s8 = s1.replace("llo", "all");
		System.out.println(s8);

		String s9 = "bye";
		String s91 = s9.replace('e', 'e');
		System.out.println(s9 == s91);// with char true, with string false

		String s10 = "Hello,";
		String s11 = " Friend";
		System.out.println(s10.concat(s11));
	}
}
