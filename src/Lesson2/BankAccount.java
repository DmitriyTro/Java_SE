package Lesson2;

public class BankAccount {
	int id = 1;
	String name = "Petr";
	double balance;
}

class BankAccountTest {
	public static void main(String[] args) {
		BankAccount MyAccount = new BankAccount();
		BankAccount YourAccount = new BankAccount();
		BankAccount HisAccount = new BankAccount();
		BankAccount BankAccount;

		MyAccount.id = 1;
		MyAccount.name = "Dmitrii";
		MyAccount.balance = 12.35;

		YourAccount.id = 2;
		YourAccount.balance = 100.55;

		HisAccount.id = 3;
		HisAccount.name = "Ivan";
		HisAccount.balance = 2.10;

		System.out.println(MyAccount.id);
		System.out.println(YourAccount.name);
		System.out.println(HisAccount.balance);
	}
}
