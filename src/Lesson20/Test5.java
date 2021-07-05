package Lesson20;

public class Test5 {
	public static void main(String[] args) {
		Employee2 employee = new Employee2();
		Teacher2 teacher = new Teacher2();

//		employee.sleep();
//		teacher.sleep();

		Employee2 emp = new Teacher2();
		emp.sleep();

		System.out.println(teacher.salary);
	}
}

class Employee2 {
	int salary = 1000; //hiding variable
	String name;

	food1 eat() {
		System.out.println("Eating");
		food1 f = new food1();
		return f;
	}

	static void sleep() {
		System.out.println("Sleeping");
	}
}

class Teacher2 extends Employee2 {
	double salary = 2000;
	int students;

	void teach() {
		System.out.println("Teaching");
	}

	@Override
	fruit1 eat() {
		System.out.println("Teacher is eating");
		fruit1 f = new fruit1();
		return f;
	}

	static void sleep() { //hiding method
		System.out.println("Teacher is sleeping");
	}
}


class food1 {

}

class fruit1 extends food1 {

}
