
public class SavingsAccount extends BankAccount {
	private double interestRate;

	   public SavingsAccount(double interestRate) {
	       this.interestRate = interestRate;
	   }

	   public SavingsAccount(double balance, double interestRate) {
	       super(balance);
	       this.interestRate = interestRate;
	   }

	   public void calcInterest() {
	       double interest = (getBalance() * interestRate / 100.0);
	       deposit(interest);
	   }
	}



