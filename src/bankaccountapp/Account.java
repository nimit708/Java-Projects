package bankaccountapp;

public abstract class Account implements IBaseRate{
	// List common properties common to both Savings and Checking Account
	 private String name;
	 private String sSN;
     protected String accountNumber;
	 private double balance;
	 protected double rate;
	 private static int index = 10000;
	
	//Constructor to initialise and set up the account
	public Account(String name, String sSN, double initialDeposit)
	{
		this.name = name;
		this.sSN = sSN;
		this.balance = initialDeposit;
		
		// Set account number 
		index++;
		this.accountNumber = setAccountNumber();

		setRate();
	}
	
	public abstract void setRate();
	
	public void deposit(double amount)
	{
		balance += amount;
		System.out.println("Depositing $ " + amount);
		showBalance();
	}
	
	public void withdraw(double amount)
	{
		balance -= amount;
		System.out.println("Withdrawing $ " + amount);
		showBalance();
	}

	public void transfer(String toWhere, double amount)
	{
		balance -= amount;
		System.out.println("Transferring $ " + amount + " to " + toWhere);
		showBalance();
	}
	
	public void showBalance()
	{
		System.out.println("The balance is now : $" + this.balance);
	}
	
	private String setAccountNumber()
	{
		String lastTwosSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber = 100 + (int)(Math.random() * 900);
		return lastTwosSN + uniqueID + randomNumber;
	}
	
	public void compound()
	{
		double accruedInterest = balance * (rate/100);
		balance += accruedInterest;
		System.out.println("Accrued Interest : " + accruedInterest);
		showBalance();
	}
	
	public void showInfo()
	{
		System.out.println("NAme : " + name + 
							"\nAccountNumber : " + accountNumber + 
							"\nBalance : " + balance + 
							"\nRate : " + this.rate + " % ");
	}
	
}
