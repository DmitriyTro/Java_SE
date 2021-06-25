package Lesson2;

public class Student {
	int studentId;
	String firstName;
	String surname;
	int course;
	// оценки по 10-ти балльной шкале
	double mathematicsAverageGrade;
	double economicsAverageGrade;
	double foreignLanguageAverageGrade;

	Student() {
	}

	Student(int id, String firstName, String surname, int course) {
		this(id, firstName, surname, course, 0.0, 0.0, 0.0);
	}

	Student(int studentId, String firstName, String surname, int course, double mathematicsAverageGrade,
	        double economicsAverageGrade, double foreignLanguageAverageGrade) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.surname = surname;
		this.course = course;
		this.mathematicsAverageGrade = mathematicsAverageGrade;
		this.economicsAverageGrade = economicsAverageGrade;
		this.foreignLanguageAverageGrade = foreignLanguageAverageGrade;
	}
}

class StudentTest {

	double averageGrade(Student student) {
		double avgGrade = (student.mathematicsAverageGrade + student.economicsAverageGrade +
				student.foreignLanguageAverageGrade) / 3;
		return avgGrade;
	}

	public static void main(String[] args) {
		StudentTest studentTest = new StudentTest();
		Student student1 = new Student();
		Student student2 = new Student(4, "Ivan", "Popov", 1);
		Student student3 = new Student(4, "Victor", "Ivanov", 3, 6.5, 7.3, 8.8);

		Student firstStudent = new Student();
		firstStudent.studentId = 1;
		firstStudent.firstName = "Nikolay";
		firstStudent.surname = "Ivanov";
		firstStudent.course = 3;
		firstStudent.mathematicsAverageGrade = 8.1;
		firstStudent.economicsAverageGrade = 6.5;
		firstStudent.foreignLanguageAverageGrade = 7.5;

		Student secondStudent = new Student();
		secondStudent.studentId = 2;
		secondStudent.firstName = "Ivan";
		secondStudent.surname = "Petrov";
		secondStudent.course = 2;
		secondStudent.mathematicsAverageGrade = 5.2;
		secondStudent.economicsAverageGrade = 7.6;
		secondStudent.foreignLanguageAverageGrade = 4.5;

		Student thirdStudent = new Student();
		thirdStudent.studentId = 3;
		thirdStudent.firstName = "Dmitrii";
		thirdStudent.surname = "Popov";
		thirdStudent.course = 4;
		thirdStudent.mathematicsAverageGrade = 7.1;
		thirdStudent.economicsAverageGrade = 6.0;
		thirdStudent.foreignLanguageAverageGrade = 6.4;


		System.out.println("Средняя арифметическая оценка студента: " + firstStudent.firstName + " " + firstStudent.surname + " = " +
				studentTest.averageGrade(firstStudent));

		System.out.println("Средняя арифметическая оценка студента: " + secondStudent.firstName + " " + secondStudent.surname + " = " +
				studentTest.averageGrade(secondStudent));

		System.out.println("Средняя арифметическая оценка студента: " + thirdStudent.firstName + " " + thirdStudent.surname + " = " +
				studentTest.averageGrade(thirdStudent));
	}
}
