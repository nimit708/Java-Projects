package bankaccountapp;

public class Savings extends Account{
	// List properties specific to savings account 
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// Constructor to initialise a savings account 
	public Savings(String name, String sSN, double deposit)
	{
		super(name,sSN,deposit);
		accountNumber = "1" + accountNumber; 
		setSafetyDepositBox();
	}
	
	public void setRate()
	{
		rate = getBaseRate() - 0.25;
	}
	
	// List any methods specific to savings account 
	@Override
	public void showInfo()
	{
		System.out.println("Savings Account");
		super.showInfo();
		System.out.println("Safety Deposit Box ID : " + safetyDepositBoxID);
		System.out.println("Safety Deposit Box Key " + safetyDepositBoxKey);
	}

	private void setSafetyDepositBox()
	{
		safetyDepositBoxID = 100 + (int)(Math.random() * 900);
		safetyDepositBoxKey = 1000 + (int)(Math.random() * 9000);
		
		
	}

	
}
