package Lesson15;

public class Test4 {
	private static boolean equals(StringBuilder sb1, StringBuilder sb2) {
		boolean result = true;

		if (sb1.length() == sb2.length()) {
			for (int i = 0; i < sb1.length(); i ++) {
				if (sb2.charAt(i) != sb1.charAt(i)) {
					result = false;
					break;
				}
			}
		} else {
			result = false;
		}
		return result;
	}



	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("Hello");
		StringBuilder stringBuilder2 = new StringBuilder("Hello");
		System.out.println(equals(stringBuilder, stringBuilder2));
	}
}
