package Lesson24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {

	static int abc() {
		int a = 5;
		try {
			File f = new File("Test10.txt");
			FileInputStream fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			System.out.println("Exception");
			System.out.println("variable 'a' in catch block = " + a);
			return a;
		} finally {
			a = 10;
			System.out.println("finally block");
			System.out.println("variable 'a' in finally block = " + a);
		}
		return a;
	}

	static StringBuilder def() {
		StringBuilder a = new StringBuilder("Hello");
		try {
			File f = new File("Test10.txt");
			FileInputStream fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			System.out.println("Exception");
			System.out.println("variable 'a' in catch block = " + a);
			return a;
		} finally {
			a.append("!!!");
			System.out.println("finally block");
			System.out.println("variable 'a' in finally block = " + a);
		}
		return a;
	}

	public static void main(String[] args) {
		System.out.println(abc()); // return 5;
		System.out.println();
		System.out.println(def()); // return "hello!!!"
	}
}
