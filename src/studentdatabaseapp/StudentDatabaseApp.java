package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
	  // Create a Scanner class reference  
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter the number of students to be enrolled : ");
	  int noOfStudents = input.nextInt();
	  
	  // Create an array of type Student
	  Student[] students = new Student[noOfStudents];
	  
	  // Use for loop to iterate through the students enrolled
	  for(int i = 0; i < students.length; i++)
	  {
		  // Ask the user to enter the name and the grade level / year 
		  System.out.print("Please enter your name : ");
		  String firstName = input.next();
		  String lastName = input.nextLine();
		  
		  System.out.println("Please enter the year on the basis of the folllowing list :- ");
		  System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior : ");
		  int gradeLevel = input.nextInt();
		  
		  // Create a student reference 
		  students[i] = new Student(firstName,lastName,gradeLevel);
		 
		  students[i].enroll();
		  students[i].payTuition();
		  System.out.println(students[i]);
		  System.out.println();
	  }
	  
	}

}
