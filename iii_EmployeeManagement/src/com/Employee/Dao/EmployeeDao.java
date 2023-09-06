package com.Employee.Dao;

import java.util.*;

import com.Employee.Pojo.EmployeePojo;
import com.Employee.Exception.EmployeeException;

public class EmployeeDao  {
	
	//Step1
	
	Scanner sc = new Scanner(System.in);
	
	EmployeePojo []empolyees;
	String userInput;
	
	int employeeSize, employeeCount;
	
	//Step2
	public EmployeeDao(int employeeSize) {
		employeeCount=0;
		this.employeeSize=employeeSize;
		empolyees=new EmployeePojo[employeeSize];
	}
	
	//Step3
	
	public void addEmployee() {
		if(employeeCount==empolyees.length) {
			System.out.println("Employee array is overflow!!! you can not insert any more employee...");
		}else {
			
			EmployeePojo addMovie=new EmployeePojo();
			
			System.out.println("Enter employee id:");
			addMovie.setEmployeeId(sc.nextInt());
			
			System.out.println("Enter employee name:");
			addMovie.setEmployeeName(sc.next());
			
			System.out.println("Enter employee role:");
			addMovie.setEmployeeRole(sc.next());
			
			System.out.println("Enter employee category:");
			addMovie.setEmployeeCategory(sc.next());
			
			empolyees[employeeCount]=addMovie;
			employeeCount++;
			System.out.println("Employee added successfully");
		}
	}
	
	public void listEmployee() {
		if(employeeCount==0) {
			System.out.println("Employee array is empty");
		}else {
			
			System.out.println("Id\t" +"Name\t" + "Role\t" + "Category");
			for(int i=0;i<employeeCount;i++) {

				System.out.println(empolyees[i].getEmployeeId() +"\t" + empolyees[i].getEmployeeName()  +"\t" + empolyees[i].getEmployeeRole()  +"\t" + empolyees[i].getEmployeeCategory());
				
			}		
		}
	}
	
	public void searchEmployee() throws EmployeeException {
		if(employeeCount==0) {
			System.out.println("Employee array is empty");
		}else {
			
			System.out.println("Enter employee name you want to search:");
			userInput=sc.next();
			
			int index =0;
			System.out.println("Id\t" +"Name" );
			for(int i=0;i<employeeCount;i++) {
				
				if(empolyees[i].getEmployeeName().equals(userInput)) {
					
				System.out.println( empolyees[i].getEmployeeId()  +"\t" + empolyees[i].getEmployeeName() );
				index=1;
				break;
				}
			}
			
			if(index==0) {
				try {
					
					throw new EmployeeException("Employee could not be searched");
				}catch(EmployeeException ee){
					System.out.println("Please try again");
				}
			}
			
		}
	}
	
	public void updateEmployee() throws EmployeeException {
		if(employeeCount==0) {
			
			System.out.println("Employee array is empty");
			
		}else {
			
			System.out.println("Enter employee name you want to update:");
			userInput=sc.next();
		
			 int index = 0;
				for(int i=0;i<employeeCount;i++) {
					
					if(empolyees[i].getEmployeeName().equals(userInput)) {
						System.out.println("Enter new employee:");
						String updatedEmployee=sc.next();
						empolyees[i].setEmployeeName(updatedEmployee);
						index=1;
						System.out.println("Employee updated successfully!");
						break;
					}
				}
				
				if(index==0) {
					try {
						
						throw new EmployeeException("Employee name could not be found");
					}catch(EmployeeException ee){
						
						System.out.println("Please try again");
					}

				
				
			}
		}
	}
		
		public void removeEmployee() throws EmployeeException {
			if(employeeCount==0) {
				
				System.out.println("Employee array is empty");
				
			}else {
				
				System.out.println("Enter employee name you want to remove:");
				userInput=sc.next();
			
				 int index = 0;
					for(int i=0;i<employeeCount;i++) {
					
							
							
							if(empolyees[i].getEmployeeName().equals(userInput)) {
								index=1;
								
								for(int j=i;j<employeeCount-1;j++) {
									empolyees[j]=empolyees[j+1];
								}
								employeeCount--;
								System.out.println("Employee deleted successfully!");
							    break;
						}
					}
					
					if(index==0) {
						try {
							
							throw new EmployeeException("Employee name could not be found");
						}catch(EmployeeException ee){
							
							System.out.println("Please try again");
						}
					}
					
				}
		}
		
		public void assignEmployee() throws EmployeeException {
			if(employeeCount==0) {
				
				System.out.println("Employee array is empty");
				
			}else {
				
				System.out.println("Enter employee name you want to assign:");
				userInput=sc.next();
			
				 int index = 0;
					for(int i=0;i<employeeCount;i++) {
						
						if(empolyees[i].getEmployeeName().equals(userInput)) {
							System.out.println("Enter work you want to assign:");
							empolyees[i].setAssignWorkTo(sc.next()); 
							index=1;
							System.out.println("Work assigned successfully!");
							break;
						}
					}
					
					if(index==0) {
						try {
							
							throw new EmployeeException("Employee name could not be found");
						}catch(EmployeeException ee){
							
							System.out.println("Please try again");
						}

					
					
				}
			}
		}


}
