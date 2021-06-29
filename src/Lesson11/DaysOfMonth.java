package Lesson11;

public class DaysOfMonth {
	int month = 2;

	public static void main(String[] args) {
		DaysOfMonth daysOfMonth = new DaysOfMonth();


		switch (daysOfMonth.month) {
			case 2:
				System.out.println("Дней в месяце : 28");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Дней в месяце : 30");
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Дней в месяце: 31");
				break;
			default:
				System.out.println("Такого месяца не существует.");
		}
	}
}
