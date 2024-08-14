package lab7;

public class BankAccount {
	public static void withdraw(double amount) {
		if (amount >= 1 && amount <= 500) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}

}
