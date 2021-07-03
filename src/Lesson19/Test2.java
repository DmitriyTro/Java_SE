package Lesson19;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		aList.add("one");
		aList.add("two");
		aList.add("three");
		aList.add("four");
		aList.add("five");

		System.out.println("List = " + aList);

		ArrayList<String> aList2 = new ArrayList<>();
		aList2.add("one");
		aList2.add("three");
		aList2.add("four");
		aList2.add("ten");

//		List<String> sublist = aList.subList(1, 4);
//		System.out.println("Sublist = " + sublist);
//
//		boolean result = aList.containsAll(aList2);
//		System.out.println("Result = " + result);
//		aList.removeAll(aList2);
//		aList.retainAll(aList2);
//		System.out.println("List = " + aList);

//		Object[] array = aList.toArray();
//		String[] array2 = aList.toArray(new String[5]);
//		for (String s : array2) {
//			System.out.println(s);
//		}
		
		List<String> list = List.of("one", "two", "three");
		System.out.println("List = " + list);

		List<String> list2 = List.copyOf(aList);
		System.out.println("List2 = " + list2);
	}
}
