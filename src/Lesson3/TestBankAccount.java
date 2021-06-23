package Lesson3;

public class TestBankAccount {
		int id = 10;
		double balance = 100;

		TestBankAccount(int id, double balance) {
			this.id = id;
			this.balance = balance;
		}

		void addMoneyToBalance(double count) {
			System.out.println("Balance before add money: " + balance);
			System.out.println("Balance add " + count + " money");
			balance += count;
			System.out.println("Balance after add money: " + balance);
		}

		void reduceMoneyOnBalance(double count) {
			System.out.println("Balance before reduce money: " + balance);
			System.out.println("Balance reduce " + count + " money");
			balance -= count;
			System.out.println("Balance after reduce money: " + balance);
		}
	}

	class BankAccountTest {
		public static void main(String[] args) {
			TestBankAccount MyBankAccount = new TestBankAccount(10, 105);
			MyBankAccount.addMoneyToBalance(100);
			System.out.println();
			MyBankAccount.reduceMoneyOnBalance(80);
		}
	}
