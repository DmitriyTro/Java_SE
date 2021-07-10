package Lesson24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3 {
	public static void main(String[] args) throws Exception {
		File f = new File("Test10.txt");
		FileInputStream fls = new FileInputStream(f);
		fls.read();
		FileOutputStream fos = new FileOutputStream(f);
		fos.write(100);
	}
}