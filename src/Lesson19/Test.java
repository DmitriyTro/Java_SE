package Lesson19;

import Lesson5.A;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		int[] array2 = {1, 2, 3, 5};
		int[] array5 = {1, 2, 3, 5};

		char[] array3 = {'p', 'r', 'i', 'v', 'e', 't'};
		char[] array4 = {'p', 'r', 'i', 'v', 'i', 'v', 'k', 'a'};

		System.out.println(Arrays.compare(array, array2));
		System.out.println(Arrays.compare(array3, array4));
		System.out.println();
		System.out.println(Arrays.mismatch(array2, array));
		System.out.println(Arrays.mismatch(array3, array4));
	}
}
