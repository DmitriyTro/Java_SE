package Lesson18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test8 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("A");
		StringBuilder sb2 = new StringBuilder("B");
		StringBuilder sb3 = new StringBuilder("C");
		ArrayList<StringBuilder> list = new ArrayList<>();
		list.add(sb1);
		list.add(sb2);
		list.add(sb3);
//		ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>)list.clone();
//		System.out.println(list == list2);
//		System.out.println(list.get(0) == list2.get(0));
//		list.get(0).append("!!!");
//		System.out.println(list2.get(0));
//		Object[] array = list.toArray();
//		for (Object o : array) {
//			System.out.println(o);
//		}

//		StringBuilder[] array2 = list.toArray(new StringBuilder[5]);
//		for (StringBuilder sb : array2) {
//			System.out.println(sb);
//		}

		StringBuilder[] array3 = {sb2, sb3, sb3 , sb3};
		List<StringBuilder> list3 = Arrays.asList(array3);
		System.out.println(list3);
		array3[0].append("!!!");
		System.out.println(list3);
	}
}
