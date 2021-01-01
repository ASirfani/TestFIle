
public class BankAccount {

	private int accountNumber;
	private double balance;
	private static int number = 1000;

	BankAccount(){
		this.balance = 0;
		this.accountNumber = number;
		number++;
	}

	public BankAccount(double amount) {
		this.balance = amount;
		this.accountNumber = number;
		number++;
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
		}
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void display() {
		System.out.println("Balance :$" + balance);
	}
}
