package emailapp;
import java.util.Scanner;

public class Email {
	// Instance variables
	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private final String companyName = "abcxyz";
	private String password;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private final int lengthOfPassword = 10;
	
	// Constructor method
	public Email(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		// Get the department details from the private method described 
		// in the class
		this.department = getDepartment();
		System.out.println("Department : " + this.department);
		
		// Get the password 
		this.password = randomPassword(lengthOfPassword);
		
		// Print out the object reference created 
		System.out.println("------------Email Account Created----------");
		System.out.println("The name of the employee is " + this.firstName + " " + this.lastName);
		System.out.println("The email address created is " + 
			this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + 
				"." + this.companyName + ".com");
		System.out.println("The password created is " + this.password);
	}
	
	
	// Get department details
	private String getDepartment()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the department you want to join");
		System.out.print("Enter 1 for Sales\nEnter 2 for development\nEnter 3 for accounting \nor 0 " + 
											" for you want to leave it as blank : ");
		int numberGiven = input.nextInt();
		
		// Use switch statements 
		switch(numberGiven) {
		case 0 : return "";
		case 1 : return "Sales";
		case 2 : return "Development";
		case 3 : return "Accounting";
		default : return "";
		}
		
	}
	
	
	// Generate random Password method
	private String randomPassword(int length)
	{
		// Take the list of characters as a char type
		String passwordSet = "ABCDEFGHIJKMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		
		// Use for loop to get the random characters based upon the values of the Math.random() 
		for(int i = 0; i < length; i++)
		{
			int randomNumber = (int) (Math.random()* passwordSet.length());
			password[i] = passwordSet.charAt(randomNumber);
		}

		return new String(password);
	}
	
	// Mutator methods for changing password, setting the mailbox capacity and define an alternate 
	// email address
	
	public void setPassword(String newPassword)
	{
		this.password = newPassword;
	}
	
	
	public void alternateEmail(String newEmail)
	{
		this.alternateEmail = newEmail;
	}
	
	public void setMailboxCapacity(int capacity)
	{
		this.mailboxCapacity = capacity;
	}
	
	// Accessor methods for the above defined mutator methods
	public String getPassword() {return this.password;}
	public String getAlternateEmail() {return this.alternateEmail;}
	public int getMailboxCapacity() {return this.mailboxCapacity;}
	
	
	// Accessor methods to get the name , email, and the mailbox capacity
	public String getName()
	{
		return this.firstName + " "  + this.lastName;
	}

	public String getEmail()
	{
		return this.email;
	}

}
