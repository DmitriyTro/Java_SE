package Lesson24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test10 {

	static void abc() throws FileNotFoundException {
		try {
			File f = new File("Test10.txt");
			FileInputStream fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			System.out.println("Exception");
			throw e;
		} finally {
			System.out.println("finally block");
		}
	}

	void method() {
		try {
			abc();
		} catch (FileNotFoundException e) {
			System.out.println("Exception");
		}
	}

	static void def() {
		try {
			int[] array = {1, 2, 3};
			System.out.println(array[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception");
			throw e;
		} finally {
			System.out.println("finally block");
		}
	}
}
