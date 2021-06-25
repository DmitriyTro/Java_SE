package Lesson6;

public class Student {
	String name;
	int course;
	static int count;
	private static final int TEST = 2;
	int a;

	public Student(String name, int course) {
		count++;
		this.name = name;
		this.course = course;

		System.out.println("Student № " + count + " was created.");
	}

	public static void showCount() {
		System.out.println("All created students: " + count);
	}

	public void showInfo() {
		System.out.println("Welcome to the student class.");
	}

	void abc() {
		a++;
		count++;
	}

	static void abcd() {
		count++;
		Student st2 = new Student("Anna", 1);
		st2.a++;
	}

	static int sum(int a, int b) {
		return a + b;
	}

	public final static double PI = Math.PI;

	public double areaOfCircles(double radius) {
		return PI * radius * radius;
	}

	static double lengthOfCircles(double radius) {
		return 2 * PI * radius;
	}

	public void showInfo(double radius) {
		System.out.println("Radius: " + radius);
		System.out.println("The area of the circle: " + areaOfCircles(radius));
		System.out.println("The length of the circle: " + lengthOfCircles(radius));
	}

	public static void main(String[] args) {
		Student st1 = new Student("Petr", 1);
		Student st2 = new Student("Alex", 4);
		Student st3 = new Student("Masha", 2);

		System.out.println(count);

		showCount(); // Student.showCount(); in other class

		System.out.println(PI);
		st1.areaOfCircles(12);
		lengthOfCircles(20);
		st1.showInfo(10);
	}
}


