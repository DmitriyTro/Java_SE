package Lesson13;

public class Test2 {
	public static void main(String[] args) {
		int money = 100;

		while (money > 0) {
			System.out.println("Сделайте ставку");
			System.out.println("Вы проиграли");
			money -= 10;
		}
	}
}
