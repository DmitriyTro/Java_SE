package Lesson17;

public class Test7 {
	public static void main(String[] args) {
		int[] array = {0, 6, 5, 1};
//		for (int i = 0; i < array.length; i++) {
//			array[i] = 3;
//		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		for (int a : array) {
			a = 3;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
