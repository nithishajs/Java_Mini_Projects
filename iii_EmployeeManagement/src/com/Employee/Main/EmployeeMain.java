package com.Employee.Main;

import java.util.Scanner;
import com.Employee.Dao.EmployeeDao;
import com.Employee.Exception.EmployeeException;


public class EmployeeMain {

	public static void main(String[] args) throws EmployeeException {
		// TODO Auto-generated method stub
		
		//Step1
		
		int employeeSize,userChoice;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many employees to be add: ");
		employeeSize = sc.nextInt();
		
		//Step2
		EmployeeDao employee = new EmployeeDao(employeeSize);
		
		//Step3
		
		do {
			
			System.out.println("************Employee Management System Menu************");
			System.out.println("1. Adding a Employee in the Library");
			System.out.println("2. View All employees");
			System.out.println("3. Searching a Employee in the Library");
			System.out.println("4. Updating a Employee in the Library");
			System.out.println("5. Assign work to a Employee");
			System.out.println("6. Deleting a Employee from the Library");
			System.out.println("0. Exit the application");
			
			System.out.println("Enter your choice:");
			userChoice=sc.nextInt();
			sc.nextLine();
			
			switch(userChoice)
			{
			
			case 1:
				employee.addEmployee();
				break;
				
			case 2:
				employee.listEmployee();
				break;
				
			case 3:
				employee.searchEmployee();
				break;
				
			case 4:
				employee.updateEmployee();
				break;
			
			case 5:
				employee.assignEmployee();
				break;
				
			case 6:
				employee.removeEmployee();
				break;
				
			case 0:
				System.out.print("Exit, Thank You!");
				break;
			
			default:
				System.out.print("Please try again");
			}
			
		}while(userChoice!=0);
		
		

	}

}
