package day3;

public class BankAccount {

	private String accountHolderName;
	private int balance; 
	private boolean status; // true for active / false for inactive
	

	
	// business method
	
//getter setter
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getBalance() {
		return balance; 
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int Withdrawal(int amount)
	{
		if((balance-amount) > 9999) {
			balance = balance-amount;
			status = true;
		}
		else {
			status = false;
		}
		return balance; // new balance
	}
	
}