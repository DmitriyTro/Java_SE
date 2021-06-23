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
}

class StudentTest {
	public static void main(String[] args) {
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
				(firstStudent.mathematicsAverageGrade + firstStudent.economicsAverageGrade + firstStudent.foreignLanguageAverageGrade) / 3);

		System.out.println("Средняя арифметическая оценка студента: " + secondStudent.firstName + " " + secondStudent.surname + " = " +
				(secondStudent.mathematicsAverageGrade + secondStudent.economicsAverageGrade + secondStudent.foreignLanguageAverageGrade) / 3);

		System.out.println("Средняя арифметическая оценка студента: " + thirdStudent.firstName + " " + thirdStudent.surname + " = " +
				(thirdStudent.mathematicsAverageGrade + thirdStudent.economicsAverageGrade + thirdStudent.foreignLanguageAverageGrade) / 3);
	}
}
