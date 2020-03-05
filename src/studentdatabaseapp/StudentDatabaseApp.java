package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// Ask how many new users we want to add
		System.out.println("Enter how many new students to enroll: ");
		Scanner scanner = new Scanner(System.in);
		int numOfStudents = scanner.nextInt();
		Student[] students = new Student[numOfStudents];
		
		// Create n new number of students
		for (int i=0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].toString());
		}
		// Test print
		System.out.println(students[0].toString());
		System.out.println(students[1].toString());
		System.out.println(students[2].toString());
	}

}
