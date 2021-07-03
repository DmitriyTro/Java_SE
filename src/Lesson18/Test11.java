package Lesson18;

import java.util.ArrayList;
import java.util.Collections;

public class Test11 {
	public static ArrayList<String> abc(String... string) {
		ArrayList<String> arrayList = new ArrayList<>();
		for (String str : string) {
			if (!arrayList.contains(str)) {
				arrayList.add(str);
			}
		}
		Collections.sort(arrayList);
		System.out.println(arrayList);
		return arrayList;
	}

	public static void main(String[] args) {
		Test11 test = new Test11();
		test.abc("Hello", "Ok", "Bye", "Bye", "Hello", "Hello World");
	}
}
