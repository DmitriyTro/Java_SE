package Lesson24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test11 {
	FileInputStream fis1, fis2;

	public void abc() {
		try {
			fis1 = new FileInputStream("Test1.txt");
			try {
				fis2 = new FileInputStream("Test2.txt");
			} catch (FileNotFoundException e) {
				System.out.println("File test1 not found");
			}
		} catch (FileNotFoundException e) {
			System.out.println("File test2 not found");
		} finally {
			System.out.println("Outer finally block");
			try {
				fis1.close();
				fis2.close();
			} catch (IOException e) {
				System.out.println("Exception in finally block");
			}
		}
	}

	public static void main(String[] args) {
		Test11 test11 = new Test11();
		test11.abc();
	}
}
