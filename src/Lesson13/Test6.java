package Lesson13;

public class Test6 {
	public static void main(String[] args) {
		int money = 0;

		do {
			System.out.println("Сделайте ставку");
			System.out.println("Вы проиграли");
			money -= 10;
		} while (money > 50);
	}
}
