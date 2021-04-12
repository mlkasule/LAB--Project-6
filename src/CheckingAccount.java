
public class CheckingAccount extends BankAccount{
	
	private static final double FEE = 15; //in cents
	
	public CheckingAccount(String name, double initialAmount) 
	{
		super(name, initialAmount);
	}
	public CheckingAccount(BankAccount oldAccount, double amount) 
	{
		super(oldAccount + "-10", amount);
	}
	
	@Override
	public boolean withdraw(double amount) 
	{	
		//calaculate amount after fees
		double amountAfterFees = (amount + FEE);
		return super.withdraw(amountAfterFees);
	}

}
