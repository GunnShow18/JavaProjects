package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity;
	private String alternateEmail;
	
	// Constructor receives first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// Call a method asking for the department - return the department
		this.department = setDepartment();
		
		// Call a method that returns a random password
		this.password = randomPassword(12);
		System.out.println("Your password is: " + this.password);
		
		// Combine elements to generate email
		email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + ".company.com";
	}
	
	private String setDepartment() {
		System.out.println("New employee: " + this.firstName + " " + this.lastName + "." +"\nDEPARTMENT CODES \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none\nEnter the department code");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			in.close();
			return "sales";
		} else if (depChoice == 2) {
			in.close();
			return "dev";
		} else if (depChoice == 3) {
			in.close();
			return "acct";
		} else {
			in.close();
			return "";
		}
		}
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {
		return this.mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return this.alternateEmail;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + this.firstName + " " + this.lastName + "\n" +
				"COMPANY EMAIL: " + email + "\n" +
				"MAILBOX CAPACITY: " + mailboxCapacity + "mb";
				
	}

}
