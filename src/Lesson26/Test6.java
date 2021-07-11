package Lesson26;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test6 {
}

class Student3 {
	String name;
	char sex;
	int age;
	int course;
	double avgGrade;

	public Student3(String name, char sex, int age, int course, double avgGrade) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.course = course;
		this.avgGrade = avgGrade;
	}
}

class StudentInfo3 {

	void printStudent(Student3 st) {
		System.out.println("Student name: " + st.name + ", sex: " + st.sex + ", age: " +
				+st.age + ", course: " + st.course + ", average grade: " + st.avgGrade);
	}

	void testStudents(ArrayList<Student3> aL, Predicate<Student3> t) {
		for (Student3 s : aL) {
			if (t.test(s)) {
				printStudent(s);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Student3> list = new ArrayList<>();
		Student3 st1 = new Student3("Ivan", 'm', 22, 3, 8.3);
		Student3 st2 = new Student3("Nikolay", 'm', 20, 2, 7.5);
		Student3 st3 = new Student3("Elena", 'f', 19, 1, 8.9);
		Student3 st4 = new Student3("Petr", 'm', 32, 4, 7);
		Student3 st5 = new Student3("Mariya", 'f', 23, 3, 9.1);

		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);

		StudentInfo3 si = new StudentInfo3();
		for (Student3 s : list) {
			System.out.println(s.name);
		}
		System.out.println("-------------------------------------");
		list.removeIf(st -> st.name.endsWith("a"));
		for (Student3 s : list) {
			System.out.println(s.name);
		}

//		si.testStudents(list, (Student3 st) -> {return st.avgGrade > 8.5;});
//		System.out.println("----------------------------------------------------------");
//		si.testStudents(list, (Student3 st) -> st.avgGrade < 9);
//		System.out.println("----------------------------------------------------------");
//		si.testStudents(list, st -> st.age > 25);
//		System.out.println("----------------------------------------------------------");
//		si.testStudents(list, st -> st.age < 27);
//		System.out.println("----------------------------------------------------------");
//		si.testStudents(list, (Student3 st) -> st.sex == 'm');
//		System.out.println("----------------------------------------------------------");
//		si.testStudents(list, (Student3 st) -> st.avgGrade > 7.2 && st.age < 23 && st.sex == 'f');
	}
}

