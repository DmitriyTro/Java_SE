package Lesson24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test5 {

	void abc() {
		try {
			File f = new File("Text10.txt");
			FileInputStream fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}

	void def() throws FileNotFoundException {
		abc();
	}

	public static void main(String[] args) throws FileNotFoundException {
		Test5 t = new Test5();
		t.def();
	}
}
