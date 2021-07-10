package Lesson24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7 {
	public static void main(String[] args) {
		try {
			File f = new File("Text10.txt");
			FileInputStream fis = new FileInputStream(f);
		} catch (NullPointerException e) {
			System.out.println("Exception 1");
		} catch (FileNotFoundException e) {
			System.out.println("Exception 2");
		} catch (IOException e) {
			System.out.println("Exception 3");
		} catch (RuntimeException e) {
			System.out.println("Exception 4");
		} catch (Exception e) {
			System.out.println("Exception 5");
		} catch (Throwable e) {
			System.out.println("Exception 6");
		}
	}
}
