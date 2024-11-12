
public class CheckingAccount extends BankAccount {
	//instance based on instructions
	static final double FEE = 0.15;

	
	public CheckingAccount(String name, double initialAmount){
		super(name, initialAmount);

		
		setAccountNumber(getAccountNumber() + "-10");
		
	}

	
	@Override
	public boolean withdraw(double amount) {
		double amountPlusFee = amount + FEE;


		return super.withdraw(amountPlusFee);
	}

}