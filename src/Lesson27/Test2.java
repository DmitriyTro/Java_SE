package Lesson27;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<Integer> aL = new ArrayList<>();
		aL.add(10);
		aL.add(30);
		aL.add(150);
		int a = GenMethods.getSecondElement(aL);
		System.out.println(a);

		ArrayList<String> aL2 = new ArrayList<>();
		aL2.add("a");
		aL2.add("b");
		aL2.add("c");
		String s = GenMethods.getSecondElement(aL2);
		System.out.println(s);
	}
}

class GenMethods {

	public static <T> T getSecondElement(ArrayList<T> aL) {
		return aL.get(1);
	}
}
