package Lesson18_2;

import java.util.ArrayList;

public class Test3 {
	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		aList.add("one");
		aList.add("two");
		aList.add("three");
		aList.add("four");
		aList.add("five");

		for (Object o : aList) {
			System.out.println("Number = " + o + " and length = " + ((String)o).length());
		}
	}
}
