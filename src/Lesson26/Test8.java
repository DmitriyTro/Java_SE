package Lesson26;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test8 {
	public static void main(String[] args) {
		List<String> list = List.of("Hello", "Bye", "Ok");
		for (String s : list) {
			System.out.println(s);
		}


		ArrayList<Integer> aL = new ArrayList<>();
		aL.add(6);
		aL.add(4);
		aL.add(2);
		aL.add(3);
		aL.add(5);
		aL.add(1);
		aL.add(7);
//		aL.removeIf(element -> element % 3 == 0);
//		Predicate<Integer> p = element -> element % 3 == 0;
//		aL.removeIf(p);
		System.out.println(aL);
		aL.sort((x, y) -> -x.compareTo(y));
		System.out.println(aL);
	}
}
