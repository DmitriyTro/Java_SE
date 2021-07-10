package Lesson24;

public class Test6 {
	static void abc() {
		System.out.println("abc");
		abc();
	}

	public static void main(String[] args) {
//		abc(); // error stack over flow
	}
}
