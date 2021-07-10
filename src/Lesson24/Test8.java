package Lesson24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test8 {
	public static void main(String[] args) {
		StringBuilder result = new StringBuilder("");
		try {
			File f = new File("Test10.txt");
			System.out.println("object was created");
			FileInputStream fis = new FileInputStream(f);
			System.out.println("stream was created");
			int counter = 0;
			while (true) {
				counter++;
				result.append(fis.read());
				System.out.println("info reading...");
				if (counter == 3) {
					fis.close();
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Exception 1");
		} catch (IOException e) {
			System.out.println("Exception 2");
		} finally {
			System.out.println("this is finally");
		}
	}
}
