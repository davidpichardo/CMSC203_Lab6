
public class SavingsAccount extends BankAccount {
	
	//instances based on instructions
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;


	public SavingsAccount(String name, double initialBalance){
		super(name, initialBalance);

		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}

	public void postInterest(){
		double monthlyInterest = getBalance() * (rate / 12);
		deposit(monthlyInterest);
	}

	@Override
	public String getAccountNumber(){
		return accountNumber;
	}


	//copy constructor based on instructions
	public SavingsAccount(SavingsAccount originalAccount, double initialBalance){
		super(originalAccount, initialBalance);

		this.savingsNumber = originalAccount.savingsNumber + 1;
		this.accountNumber =  super.getAccountNumber() + "-" + this.savingsNumber;	
	}
	
}