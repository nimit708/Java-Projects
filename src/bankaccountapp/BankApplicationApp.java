package bankaccountapp;

import java.util.List;
import java.util.LinkedList;

public class BankApplicationApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();
		
		String file = "/Users/nimitsharma/Downloads/NewBankAccounts.csv";
		
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for(String[] account : newAccountHolders)
		{
		   String name = account[0];
		   String sSN = account[1];
		   String accountType = account[2];
		   double initDeposit = Double.parseDouble(account[3]);
		   
		   if(accountType.equals("Savings"))
		   {
			   accounts.add(new Savings(name,sSN,initDeposit));
		   }
		   else if (accountType.equals("Checking"))
		   {
			   accounts.add(new Checking(name,sSN,initDeposit));
		   }
		   else
			   System.out.println("Error while reading accounts");
		}

		for(Account acc : accounts) {
			System.out.println("\n********************");
			acc.showInfo();
		}	
	}

}
