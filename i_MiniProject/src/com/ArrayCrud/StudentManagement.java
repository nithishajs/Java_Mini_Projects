package com.ArrayCrud;

import java.util.*;

public class StudentManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step1 
		
		String []students;
		String userInput;
		
		int userChoice, studentCount=0;
		
		//step2
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of students you want:");
		int size = sc.nextInt();
		
		students=new String[size];
		
		//step3
		
		do {
			System.out.println("Add the student:");
			System.out.println("Display the student:");
			System.out.println("Search the student:");
			System.out.println("Update the student :");
			System.out.println("Delete the student:");
			System.out.println("Exit");
			
			System.out.println("Enter the choice you want:");
			userChoice=sc.nextInt();
			sc.nextLine();
			
			switch(userChoice) {
			
			case 1:
				if(studentCount == students.length ) {
					
					System.out.println("Task array is full");
					
				}else {
					
					System.out.println("Enter the student name :");
					userInput=sc.nextLine();
					
					students[studentCount]=userInput;
					studentCount++;
					System.out.println("Student succesfully added!");
				}
		    break;
		    
			case 2:
				if(studentCount == 0 ) {
					
					System.out.println("Student array is empty");
					
				}else {
					System.out.println("Student list :");
					for(int i=0;i<studentCount;i++) {
						System.out.println(students[i]);
					}
				}
		    break;
		    
		    
			case 3:
				if(studentCount == 0 ) {
					
					System.out.println("Student array is empty");
					
				}else {
					System.out.println("Enter the student name:");
					userInput=sc.nextLine();
					
					int index=-1;
					for(int i=0;i<studentCount;i++) {
						if(students[i].equals(userInput)) {
							index=i;
							break;
						}
					}
					
					if(index == -1) {
						System.out.println("Student is not found");
					}else {
						System.out.println("Your student position is:"+(index+1));
					}
				}
		    break;
		    
			case 4:
				if(studentCount == 0 ) {
					
					System.out.println("Student array is empty");
					
				}else {
					System.out.println("Enter the student name you want update:");
					userInput=sc.nextLine();
					
					int index=-1;
					for(int i=0;i<studentCount;i++) {
						if(students[i].equals(userInput)) {
							System.out.println("Enter your new student name:");
							String updatedName = sc.nextLine();
							students[i]=updatedName;
							index=i;
							System.out.println("Student name updated!");
							break;
						}
					}
					
					if(index == -1) {
						System.out.println("Student is not found");
					}
				}
		    break;
		    
			case 5:
				if(studentCount == 0 ) {
					
					System.out.println("Student array is empty");
					
				}else {
					System.out.println("Enter the student name you want delete:");
					userInput=sc.nextLine();
					
					int index=-1;
					for(int i=0;i<studentCount;i++) {
						if(students[i].equals(userInput)) {			
							index=i;
							break;
						}
					}
					
					if(index == -1) {
						System.out.println("Student is not found");
					}else {
						
						for(int i=index;i<studentCount-1;i++) {
							students[i]=students[i+1];
						}
						studentCount--;
						System.out.println("Student name deleted!");
					}
				}
		    break;
		    
			case 0:
				System.out.println("Exit,Thank You!");
			break;
			
			default:
				System.out.println("please check your input your choice does not exists!!!");

			}
			
		}while(userChoice!=0);
		
		
		
		

	}

}
