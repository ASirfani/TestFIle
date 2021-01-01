import java.util.ArrayList;
import java.util.Scanner;

public class TestLab3 {
	public static void main(String[] args) {

		double balance, rate;
		int accNo;

		Scanner sc = new Scanner(System.in);

		int choice;
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		while (true) {
			System.out.println("\n1.Create Savings Account");
			System.out.println("2.Create Checking Account");
			System.out.println("3.Withdraw");
			System.out.println("4.Deposit");
			System.out.println("5.Check Balance");
			System.out.println("6.Exit");
			System.out.print("Enter Choice :");
			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.print("Enter Balance :$");
				balance = sc.nextDouble();
				System.out.print("Enter Interest Rate :%");
				rate = sc.nextDouble();
				SavingsAccount sa = new SavingsAccount(balance, rate);
				accounts.add(sa);

				continue;
			}
			case 2: {
				System.out.print("Enter Balance :$");
				balance = sc.nextDouble();
				CheckingAccount ca = new CheckingAccount(balance);
				accounts.add(ca);

				continue;
			}
			case 3: {
				System.out.print("Enter Account Number :");
				accNo = sc.nextInt();
				int index = isAvailable(accounts, accNo);
				if (index != -1) {
					System.out.print("Enter Amount to Withdraw :$");
					double amount = sc.nextDouble();
					accounts.get(index).withdraw(amount);
					System.out.println("New Balance :$" + accounts.get(index).getBalance());
				} else {
					System.out.println("** Account Not Found **");
				}

				continue;
			}
			case 4: {
				System.out.print("Enter Account Number :");
				accNo = sc.nextInt();
				int index = isAvailable(accounts, accNo);
				if (index != -1) {
					System.out.print("Enter Amount to Deposit :$");
					double amount = sc.nextDouble();
					accounts.get(index).deposit(amount);
					System.out.println("New Balance :$" + accounts.get(index).getBalance());
				} else {
					System.out.println("** Account Not Found **");
				}

				continue;
			}
			case 5: {
				System.out.print("Enter Account Number :");
				accNo = sc.nextInt();
				int index = isAvailable(accounts, accNo);
				if (index != -1)
					System.out.println("Balance :$" + accounts.get(index).getBalance());
				else
					System.out.println("** Account Not Found **");
				continue;
			}
			case 6: {
				break;
			}
			default: {
				System.out.println("** Invalid Choice **");
				continue;
			}

			}
			break;
		}

	}

	private static int isAvailable(ArrayList<BankAccount> accounts, int accNo) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountNumber() == accNo) {
				return i;
			}
		}
		return -1;
	}

}
