package Lesson15;

public class Test {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("Good Day!");
		StringBuilder sb3 = new StringBuilder(50);
		StringBuilder sb4 = new StringBuilder(sb2);

		System.out.println(sb2.length());
		System.out.println(sb2.charAt(0));
		System.out.println(sb2.indexOf(" "));

		String s = sb2.substring(5, 8);
		System.out.println(s);

		System.out.println(sb2.subSequence(5, 8)); // charSequence

//		sb2.append(sb2);
//		System.out.println(sb2);
//		sb2.append(true);
//		System.out.println(sb2);


		System.out.println(sb2.insert(4, "55"));

		StringBuilder sb5 = new StringBuilder("Hello World");
//		sb5.delete(3, 6);
//		System.out.println(sb5);
//		sb5.deleteCharAt(6);
//		System.out.println(sb5);

		sb5.reverse();
		System.out.println(sb5);

		StringBuilder sb6 = new StringBuilder("Vsem privet");
		sb6.replace(0, 5, "Pete");
		System.out.println(sb6);
		System.out.println(sb6.capacity());
		System.out.println(sb1.capacity());
	}
}
