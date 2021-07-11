package Lesson26;

public class Test4 {

	static void def(Test10 t) {
		System.out.println(t.abc("Hello"));
	}

	public static void main(String[] args) {
		def(x -> x.length()); // (String::length)
	}
}

interface Test10 {
	int abc(String s);
}