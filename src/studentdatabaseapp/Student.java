package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	// enter fields below
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student's first name: ");
		this.firstName = scanner.nextLine();
		
		System.out.println("Enter the student's last name: ");
		this.lastName = scanner.nextLine();
		
		System.out.println("Enter student grade year: "
				+ "\n1 - Freshman"
				+ "\n2 - Sophomore"
				+ "\n3 - Junior"
				+ "\n4 - Senior");
		this.gradeYear = scanner.nextInt();
		
		
		setStudentID();
		
	}
	// Generate ID
	private void setStudentID() {
		// Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0
		do {
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner scanner = new Scanner(System.in);
			String course = scanner.nextLine();
			if (!course.equals("Q")) {
				this.courses += "\n" + course;
				this.tuitionBalance += 600;
			}
			else {
				break; 
				}
		} while (1 != 0);
	}
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + this.tuitionBalance);
	}
	// Pay tuition
	public void payTuition() {
		System.out.println("Enter your payment: $");
		Scanner scanner = new Scanner(System.in);
		int payment = scanner.nextInt();
		this.tuitionBalance -= payment;
		System.out.println("Thank you for your payment of: " + payment);
		viewBalance();
	}
	
	// Show status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade level: " + this.gradeYear +
				"\nStudentID number: " + this.studentID +
				"\nCourses Enrolled: " + this.courses + 
				"\nBalance: $" + this.tuitionBalance;
	}
	
}
