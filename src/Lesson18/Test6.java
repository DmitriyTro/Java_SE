package Lesson18;

import java.util.ArrayList;

public class Test6 {
	public static void main(String[] args) {
		ArrayList<StringBuilder> list = new ArrayList<>();
		StringBuilder sb1 = new StringBuilder("Hello");
		list.add(sb1);
		list.add(new StringBuilder("Bye"));
		list.add(new StringBuilder("Ok"));
		System.out.println(list);

//		for (StringBuilder sb : list) {
//			System.out.print(sb + " ");
//		}
//		System.out.println();
//		System.out.println(list.indexOf(new StringBuilder("Hello")));
//		System.out.println(list.contains(sb1));
	}
}
