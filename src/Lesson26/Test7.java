package Lesson26;

import java.util.ArrayList;

public class Test7 {
	public static void main(String[] args) {
		var tit = new TestInferenceType();
		var i = 10;
		var w = 1.5f;
		var array = new String[]{"a", "b"};

		ArrayList<String> aL = new ArrayList<>();
		for (var s : aL) {
			System.out.println(s);
		}
	}
}

class TestInferenceType {

}

interface I {

	void abc();

	default void def() {}
	default void def2() {}
}
