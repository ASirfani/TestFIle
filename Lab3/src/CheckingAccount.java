
public class CheckingAccount extends BankAccount{

	   final double ALLOWED_TRANS = 2;
	   final double TRANS_FEE = 3;
	   private int transCnt;

	   public CheckingAccount(double balance) {
	       super(balance);
	       transCnt = 0;
	   }

	   public CheckingAccount() {
	       transCnt = 0;
	   }

	   @Override
	   public void withdraw(double amount) {
	       super.withdraw(amount);
	       transCnt++;
	   }

	   @Override
	   public void deposit(double amount) {
	       super.deposit(amount);
	       transCnt++;

	   }

	   public void chargeFees() {
	       if (transCnt > 2) {
	           super.withdraw((transCnt - ALLOWED_TRANS) * 3);
	       }
	   }
	   
	   
	}

