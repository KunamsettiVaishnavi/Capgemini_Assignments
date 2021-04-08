package day3;

public class BankApp {

	public static void main(String[] args) {
		
		BankAccount customer = new BankAccount(); 
		customer.setAccountHolderName("Raji");  
		customer.setBalance(100000);
		
		customer.Withdrawal(5000);
		if(customer.isStatus()) {
			System.out.println(customer.getAccountHolderName()+" is Active and "+"balance is "+customer.getBalance());
		}
		else {
			System.out.println(customer.getAccountHolderName()+" is Inactive and "+"balance is "+customer.getBalance());
		}
		
		
		
		
		/* business use case
		 * private String accountHolderName;
	private int balance;
	private boolean status;
		 * 
		 * -------------------
		 * if balance is less than 10,000 :- account holder cannot withdrawal 
		 * in such case account status should be inactive.
		 *  
		 * */
		
		
	}
}