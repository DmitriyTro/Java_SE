package Lesson23;

import java.util.ArrayList;
import java.util.SortedMap;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5); // autoboxing
		int a = list.get(0); // unboxing

//		Long lo = 50L; // autoboxing
		String s1 = "50";
		String s2 = "3.14";
		int i1 = Integer.parseInt(s1);
		System.out.println(i1);

		Integer i3 = Integer.valueOf(10);
		Double d1 = Double.valueOf(s2);
		System.out.println(d1);

		Byte b1 = Byte.valueOf((byte)10);
	}
}