package Lesson18;

import java.util.ArrayList;

public class Test7 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Bye");
		list.add("Hello");
		list.add("Ok");

		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println(list.lastIndexOf("Hello"));
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.contains("Bye"));
	}
}
