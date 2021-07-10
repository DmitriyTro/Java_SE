package Lesson24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4 {
	public static void main(String[] args) {
//		int[] array = {4, 8, 1};
//		System.out.println("massive");
//
//		try {
//			System.out.println(array[5]);
//			System.out.println("Hello");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("exception");
//		} finally {
//			System.out.println("finally block");
//		}

		File f = new File("Text10.txt");

		try {
			FileInputStream fis = new FileInputStream(f);
			System.out.println("Hello");
		} catch (FileNotFoundException e) {
			System.out.println("exception: " + e);
		} finally {
			System.out.println("finall y block");
		}
	}
}
