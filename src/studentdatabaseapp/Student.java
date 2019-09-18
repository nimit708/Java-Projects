package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	// Instance variables
	private String firstName;
	private String lastName;
	private String studentID;
	private int gradeLevel;
	private String courses = "";
	private int tuitionBalance = 0;
	private static final int costOfCourse = 600;
	private static int initialID = 1000;
	
	// Constructor method  : -  takes the name and year 
	public Student(String firstName, String lastName, int gradeLevel)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gradeLevel = gradeLevel;
		
		setStudentID();
		System.out.println(this.studentID);
	}

	// Accessor methods to access the name and the year given
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getGradeLevel()
	{
		return gradeLevel;
	}
	
	// Generate ID
	private void setStudentID()
	{
		/* Initialise a variable to store the number of digits 
		int numberOfDigits = 1;
		
		while(numberOfDigits != 5)
		{
			int randomDigit = (int) (Math.random() * 9);
			
			this.studentID = gradeLevel + "" + randomDigit;
			
			numberOfDigits++;}
		*/
		
		// The above commented is another method to generate a random 5 digit id 
		// for students 
		this.studentID = gradeLevel + "" + initialID;
		initialID++;
	}
	
	// Enroll in courses
	public void enroll()
	{
	  // Give the list of the courses to choose from 
	  System.out.println("The list of courses given : ");
	  System.out.println("1- History 101 \n2 - Mathematics 101 \n3 - English 101 \n4 - Chemistry 101 \n5 - Computer Science 101 ");
		
	  // Use the do-while loop to allow student to choose courses
	  do
	  {
		// Ask the student to choose the courses 
		System.out.print("Enter the course name to enroll(Q to quit) : ");
		Scanner input = new Scanner(System.in);
		String courseName = input.nextLine();
		if(!courseName.equals("Q"))
		{
			courses = courses + "\n " + courseName;
			tuitionBalance += costOfCourse; 
		}
		else
		{
			System.out.println("Enrollment over");
			break;
		}
	  }while(1 != 0);
	
	}
	// View balance
	public void viewBalance()
	{
		System.out.println("Balance : Rs " + this.tuitionBalance);
	}
	
	// Pay tuition fees
	public void payTuition()
	{
	  viewBalance();	
	  Scanner input =  new Scanner(System.in);
	  System.out.print("Please enter the amount that you want to enter: ");
	  int payment =  input.nextInt();
	  tuitionBalance -= payment;
	  System.out.println("Thank you for the payment of Rs " + payment);
	  viewBalance();
	}
	
	// Show status
	public String toString()
	{
		return "Name : " + firstName + "" + lastName +
				"\nStudentID : " + this.studentID + 
				"\nYou are enrolled in : " + courses + 
				"\nBalance : Rs " + this.tuitionBalance;
	}
}
