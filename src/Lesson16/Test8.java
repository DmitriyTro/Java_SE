package Lesson16;

public class Test8 {
	public static int[] sort(int[] array) {
		int a;
		for (int i = 0; i < array.length; i++) {
			int min = array[i]; // 0
			int index = i; // 0
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					index = j;
				}
			}
			if (i != index) {
				a = array[i];
				array[i] = min;
				array[index] = a;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = {4, 5, 7, 9, 1, 2};
		sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
