package Lesson11;

public class TestSwitch {
}

class Student {

	int grade;

	public Student(int grade) {
		this.grade = grade;
	}

	public static void main(String[] args) {
		Student student = new Student(4);

		if (student.grade == 2) {
			System.out.println("Студент двоечник.");
		} else if (student.grade == 3) {
			System.out.println("Студент троечник.");
		} else if (student.grade == 4) {
			System.out.println("Студент хорошист.");
		} else if (student.grade == 5) {
			System.out.println("Студент отличник.");
		} else {
			System.out.println("Оценка не верна.");
		}

		switch (student.grade) {
			case 2:
				System.out.println("Студент двоечник.");
				break;
			case 3:
				System.out.println("Студент троечник.");
				break;
			case 4:
				System.out.println("Студент хорошист.");
				break;
			case 5:
				System.out.println("Студент отличник.");
				break;
			default:
				System.out.println("Оценка не верна.");
		}
	}
}
