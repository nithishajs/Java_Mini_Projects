package com.StudentDatabse;
//* . Student Management System
//- Learner will be learning how to add new students
// to the database, 
//how to generate a 5 digit unique
//studentID for each student, 10001-++
//how to enroll students in the given courses. 
//Also, you will be
//implementing the following operations enroll,
// view balance, pay tuition fees, show status, etc. 
// The
//status will show all the details of the 
//student including name, id, courses enrolled and balance.


import java.util.*;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Student s1 = new Student();
//		s1.enroll();
//		s1.payTution();
//		s1.viewBalance();
		
		
		System.out.println("Enter number of students:");
		Scanner sc =  new Scanner(System.in);
		
		int noofStudents = sc.nextInt();
		
		Student []students = new Student[noofStudents];
		
		for(int n=0;n<noofStudents;n++) {
			students[n]= new Student();
			students[n].enroll();
			students[n].viewBalance();
			students[n].payTution();
		}
		
		for(int n=0;n<noofStudents;n++) {
			System.out.println(students[n].toString());
		}

	}

}
