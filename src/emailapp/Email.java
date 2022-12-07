package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;

	// constructor to receive first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

	
	// Call a method asking for the department - return the department
	this.department=setDepartment();
}

	// Ask for the department
	private String setDepartment() {
		System.out.println("Enter the Department \n1 for Sales \n2 for Development \n3 for Accounting\n0 for None");
		Scanner in = new Scanner(System.in);
		int depChioce = in.nextInt();
		if (depChioce == 1) { return "sales"; }
		else if (depChioce == 2) {return "dev"; }
		else if (depChioce == 3) { return "acct";}
		else  {return " ";}
		}

	// Generate a random password

	// Set alternate email

	// Set mail box capacity

	// Change the password
}


