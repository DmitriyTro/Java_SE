package Lesson18;

import java.util.ArrayList;

public class Test5 {
	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<>();
//		list.add("Hello");
//		list.add("Bye");
//
//		ArrayList<String> list2 = new ArrayList<>();
//		list2.add("Petrov");
//		list2.add("Ivanov");
//		list.addAll(list2);
//		list.addAll(1,list2);
//
//		for (String s : list) {
//			System.out.print(s + " ");
//		}
//
//		list2.set(1, "Sidorov");
//		System.out.println();
//		for (String s : list) {
//			System.out.print(s + " ");
//		}

		ArrayList<StringBuilder> list = new ArrayList<>();
		list.add(new StringBuilder("Hello"));
		list.add(new StringBuilder("Bye"));

		ArrayList<StringBuilder> list2 = new ArrayList<>();
		list2.add(new StringBuilder("Petrov"));
		list2.add(new StringBuilder("Ivanov"));

		list.addAll(list2);
		for (StringBuilder sb : list) {
			System.out.print(sb + " ");
		}

		list2.get(1).append("!");
		System.out.println();
		for (StringBuilder sb : list) {
			System.out.print(sb + " ");
		}
//		list.clear();
//		System.out.println();
//		for (StringBuilder sb : list) {
//			System.out.print(sb + " ");
//		}
	}
}
