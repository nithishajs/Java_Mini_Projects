package com.StudentDatabse;
//* . Student Management System
//- Learner will be learning how to add new students
//to the database, 
//how to generate a 5 digit unique
//studentID for each student, 10001-++
//how to enroll students in the given courses. 
//Also, you will be
//implementing the following operations enroll,
//view balance, pay tuition fees, show status, etc. 
//The
//status will show all the details of the 
//student including name, id, courses enrolled and balance.

import java.util.*;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses="";
	private int tutionBalance=0;
	private static int costofCourse=600;
	
	private static int id = 10001; // for increment student id 
	
	//Constructor:prompt user to enter students name and year
	
	public Student() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student first name:");
		this.firstName=sc.nextLine();
		
		System.out.println("Enter the student last name:");
		this.lastName=sc.nextLine();
		
        System.out.println("1-fresher \n2-Experienced \n3-Junior \n4-Senior \nEnter class level:");
		this.gradeYear=sc.nextInt();
		
		setStudentID();
		
//		System.out.println("First name:"+firstName+
//				        "\n Last name:" + lastName+
//				        "\n Grade year:" + gradeYear+
//				        "\n Student id:" + studentID );
	}

	//generate student unique id
	

	private void setStudentID() {
		id++;
		this.studentID=gradeYear+" "+id;
	}
	
	public void enroll() {
		do {
			
			System.out.println("Enter course to enroll (Qfor quit)");
			Scanner sc1 = new Scanner(System.in);
			String course = sc1.nextLine();
			if(!course.equals("Q")) {
				
				courses=courses+"\n"+course;
				tutionBalance=tutionBalance+costofCourse;
				
			}else {
				System.out.println("Break____________");
				break;
			}
		}
		while(1!='Q');
	}
	
	public void viewBalance()
	{
		System.out.println("Your (total/pending) balance is:"+tutionBalance);
	}

	public void payTution() {
		
		
		System.out.println("Enter your payment:$");
		Scanner sc2 = new Scanner(System.in);
		int payment = sc2.nextInt();
		tutionBalance=tutionBalance-payment;
		System.out.println("Thank for your payment"+payment);
		viewBalance();
	}
	
//	@Override
//	public String toString() {
//		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", gradeYear=" + gradeYear
//				+ ", studentID=" + studentID + ", courses=" + courses + ", tutionBalance=" + tutionBalance + "]";
//	}
	
	public String toString()
    {
    	return "Name:"+firstName+" "+lastName+
    			"\nGrade Level:"+gradeYear+
    			"\nStudent ID:"+studentID+
    			"\nCourse Enrolled:"+courses+"\nBalance is:"+tutionBalance;
    			
    }

	
	
}
