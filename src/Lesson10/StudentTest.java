package Lesson10;

import Lesson9.Student;

public class StudentTest {

	void studentEquals(Student student, Student student2) {
		if (student.name.equals(student2.name) && student.course == student2.course && student.grade == student2.grade) {
			System.out.println("Студенты одинаковые.");
		} else {
			System.out.println("Студенты разные.");
		}
	}

	void studentEqualsVariable(Student student, Student student2) {
		if (student.name.equals(student2.name)) {
			if (student.course == student2.course) {
				if (student.grade == student2.grade) {
					System.out.println("Имена студентов, курсы и средний балл одинаковые.");
				} else {
					System.out.println("Имена студентов и курсы одинаковые, но средние баллы отличаются.");
				}
			} else {
				System.out.println("Имена студентов одинаковые, но курсы отличаются.");
			}
		} else {
			System.out.println("Имена у студентов различаются.");
		}
	}

	public static void main(String[] args) {
		StudentTest studentTest = new StudentTest();

		Student student = new Student("Ivan", 2, 7.8);
		Student student2 = new Student("Ivan", 2, 8.9);

		studentTest.studentEquals(student, student2);
		studentTest.studentEqualsVariable(student, student2);
	}
}
