package Lesson24;

public class Test {
	public static void main(String[] args) {
		Animal an = new Tiger();
		System.out.println(an.a);
		System.out.println(an.b);
		an.abc();
		an.def();
	}
}

class Animal {
	int a = 5;
	static int b = 10;

	void abc() {
		System.out.println("Non-static method in class Animal.");
	}

	static void def() {
		System.out.println("Static method in class Animal.");
	}
}

class Tiger extends Animal {
	int a = 15;
	static int b = 20;

	void abc() {
		System.out.println("Non-static method in class Tiger.");
	}

	static void def() {
		System.out.println("Static method in class Tiger.");
	}
}