package Lesson18;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Bye");
		list.add("Hello");
		list.add("Ok");
		list.add(1,"Hello World");

		list.set(1, "!!!");
		for (String s : list) {
			System.out.println(s + " ");
		}
		System.out.println(list.get(3));
	}
}
