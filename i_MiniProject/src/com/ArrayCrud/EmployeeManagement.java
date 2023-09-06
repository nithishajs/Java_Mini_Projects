package com.ArrayCrud;

//console level application using array 

import java.util.Scanner;

public class EmployeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step1
		
		String []employees;
		String userInput;
		
		int userChoice=0, employeeCount=0;
		
		//Step2
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many employee to be add");
		int employeeSize = sc.nextInt();
		
		employees = new String [employeeSize];
		
		//Step3
		
		do 
		{
			System.out.println("1, Enter employee name to add");
			System.out.println("2, Show the employee list");
			System.out.println("3, Search the employee");
			System.out.println("4, Update the employee");
			System.out.println("5, Remove the employee");
			System.out.println("0, Exit");
			
			System.out.println("Enter your choice");
			userChoice = sc.nextInt();
			sc.nextLine();
			
			//Step4
			switch(userChoice) 
			{
			
			case 1:
				
				//Step5
				if(employeeCount==employees.length) {
					
					System.out.println("Employee array is full");

				}else {
					
					System.out.println("Enter the employee name:");
					userInput=sc.next();
					
					//store userInput to array employees
					employees[employeeCount]=userInput;
					employeeCount++;
					System.out.println("Employee added successfully!");
					
				}
				
			break;
			
			case 2:
				
				if(employeeCount==0) {
					
					System.out.println("Employee array is empty, please add employee!");
				
				}else {
					
					for(int i=0;i<employeeCount;i++) {
						System.out.println(employees[i]);
					}
				}
			break;
			
	        case 3:
				
				if(employeeCount==0) {
					
					System.out.println("Employee array is empty, please add employee!");
				
				}else {
					
					System.out.println("Enter the employee name you want search?");
					userInput=sc.next();
					
					int index=-1;
					for(int i=0;i<employeeCount;i++) {
						
						if(employees[i].equals(userInput)) {
							index=i;
							break;
						}
					}
					
					if(index==-1) {
						System.out.println("Employee not found");
					}else {
						System.out.println("Employee position is:" + (index+1));
					}
				}
			break;
			
            case 4:
				
				if(employeeCount==0) {
					
					System.out.println("Employee array is empty, please add employee!");
				
				}else {
					
					System.out.println("Enter the employee name you want update?");
					userInput=sc.next();
					
					int index=-1;
					for(int i=0;i<employeeCount;i++) {
						
						if(employees[i].equals(userInput)) {
							System.out.println("Enter the employee new name");
							String updatedName=sc.next();
							employees[i]=updatedName;
							index=i;
							System.out.println("Employee updated successfully");
							break;
						}
					}
					
					if(index==-1) {
						System.out.println("Employee not found");
					}
				}
			break;
			
            case 5:
            	
            	if(employeeCount==0) {
            		
            		System.out.println("Employee array is empty, please add employee!");
            	
            	}else {
            		
            		System.out.println("Enter the employee name you want remove?");
            	    userInput=sc.next();
            	    
            	    int index=-1;
            	    for(int i=0;i<employeeCount;i++) {
            	    	
            	    	if(employees[i].equals(userInput)) {
            	    		index=i;
            	    		break;
            	    	}
            	    }
            	    
            	    if(index==-1) {
            	    	System.out.println("Employee not found");
            	    }else {
            	    
            	    	for(int i=index;i<employeeCount-1;i++) {
            	    		
            	    		employees[i]=employees[i+1];
            	    	}
            	    
            	    	employeeCount--;
            	    	System.out.println("Employee removed successfully");
            	    }
            	  }
            break;
            
            case 0:
            	System.out.println("Exit, Thank you!");
            break;
            
            default:
            	System.out.println("please check your input your choice does not exists!!!");
			
			}
			
		}
		while(userChoice!=0);
	}

}
