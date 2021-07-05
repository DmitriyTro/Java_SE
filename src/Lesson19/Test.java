package Lesson19;

public class Test {
	public static void main(String[] args) {
		int a = 3;
		String s = new String[]{"B", "C", "D", "E"}[a];

		System.out.println(a < 4 ? a > 2 ? 1 : 7 : "Hello");
	}
}
