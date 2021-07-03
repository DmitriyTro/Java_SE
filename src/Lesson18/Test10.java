package Lesson18;

import java.util.ArrayList;
import java.util.Iterator;

public class Test10 {
	public static void main(String[] args) {
		String s1 = "A";
		String s2 = "B";
		String s3 = "C";
		String s4 = "D";
		ArrayList<String> list = new ArrayList<>();
		list.add(s3);
		list.add(s1);
		list.add(s4);
		list.add(s2);

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			it.next();
			it.remove();
		}
	}
}
