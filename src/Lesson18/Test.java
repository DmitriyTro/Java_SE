package Lesson18;

import Lesson5.A;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Hello");
		Car c = new Car();
		list.add(c);
		Student s = new Student();
		list.add(s);
		list.add(new StringBuilder("Ok"));

		ArrayList<String> list2 = new ArrayList<>(20);
		list2.add("Bye");
		ArrayList<StringBuilder> list3 = new ArrayList<>();
		list3.add(new StringBuilder("Hello"));
	}
}

class Car {

}

class Student {

}