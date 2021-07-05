package Lesson20;

public class Test4 {

	void abc(Animal a) {
		System.out.println("A");
	}

	void abc(Mouse m) {
		System.out.println("M");
	}

	public static void main(String[] args) {
		Test4 test = new Test4();
		Animal an = new Mouse();
		test.abc(an); //compile time because variable an have type Animal
		an.getName(); //run time
	}
}

class Animal {
	void getName() {
		System.out.println("Animal");
	}
}

class Mouse extends Animal {
	void getName() {
		System.out.println("Mouse");
	}
}