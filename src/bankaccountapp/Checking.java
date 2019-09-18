package bankaccountapp;

public class Checking extends Account{
	// List common properties specific to checking account 
	private int debitCardNumber;
	private int debitCardPIN;
	
	// Constructor method to initialize a checking account 
	public Checking(String name,String sSN, double initDeposit){
		super(name,sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate()
	{
		rate = getBaseRate() * 0.15;
	}

	// List method specific to checking account 
	@Override
	public void showInfo()
	{
		System.out.println("Account type : Checking");
		System.out.println("Debit Card Number " + debitCardNumber);
		System.out.println("Debit card PIN " + debitCardPIN);
		
		super.showInfo();	
	}

	private void setDebitCard()
	{
		debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
		debitCardPIN = 1000 + (int)(Math.random() * 9000);
	}
}
