package Lesson19;

public class Test4 {

}

class Human2 {
	String name;
	String surname;

	Human2() {

	}

	Human2(String name) {
		this(name, null);
		System.out.println(3);
	}

	Human2(String name, String surname) {
		this.name = name;
		this.surname = surname;
		System.out.println(4);
	}
}

class Student2 extends Human2 {

	Student2() {
		this(5);
		System.out.println(1);
	}

	Student2(int i) {
		super("Ivan");
		System.out.println(2);
	}

	public static void main(String[] args) {
		Student2 student = new Student2();
	}
}