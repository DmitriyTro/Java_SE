package Lesson20;

public class Test3 {
	public static void main(String[] args) {
//		Employee1 e = new Employee1();
//		Teacher1 t = new Teacher1();
//
//		e.eat();
//		t.eat();

		Employee1 e = new Teacher1();
		e.eat();
	}
}

class Employee1 {
	double salary = 1000;
	String name;
	int age;
	int experience;

	food eat() {
		System.out.println("Eating");
		food f = new food();
		return f;
	}

	void sleep() {
		System.out.println("Sleeping");
	}
}

class Teacher1 extends Employee1 {
	int students;

	void teach() {
		System.out.println("Teaching");
	}

	fruit eat() {
		System.out.println("Teacher is eating");
		fruit f = new fruit();
		return f;
	}
}

class food {

}

class fruit extends food {

}

