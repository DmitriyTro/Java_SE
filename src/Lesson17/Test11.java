package Lesson17;

public class Test11 {

	public static String[] abc(String[]... strings) {
		int length = 0;
		for (String[] array : strings) {
			length += array.length;
		}
		String[] target = new String[length];
		int count = 0;
		for (String[] array : strings) {
			for (String s : array) {
				target[count] = s;
				count++;
			}
		}
		return target;
	}

	public static void main(String[] args) {
		String[] target = abc(new String[]{"Ok", "Hello", "Bye"},
				new String[]{"Bye", "Hello", "Ok"});
		for (String s : args) {
			for (int i = 0; i < target.length; i++) {
				if (s.equals(target[i])) {
					target[i] = null;
				}
			}
		}

		for (String s : target) {
			System.out.println(s + " ");
		}
		System.out.println();
	}
}
