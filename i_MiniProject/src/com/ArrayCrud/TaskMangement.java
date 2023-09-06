package com.ArrayCrud;
/*
 * array
 * do while
 * if else
 * switch case
 * for
 * operators
 * scanner
 */

import java.util.Scanner;
public class TaskMangement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step1-Intialise the variables for the managment
		
		String []tasks; // for store all task data
		String userInput = ""; //for store user inputs data in array ex: reading, dancing like tasks
		
		int userChoice = 0; // choice of the user for add delete update like
		int taskCount = 0;  // important part is this for array count
		
		//Step2- using scanner class declare a size of array
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of task want to add:");
		int Size = sc.nextInt();
		
		//Declare a size in tasks array
		tasks = new String[Size];
		
		//Step3- give chioce for user like add delete view using scanner and in do while loop 
		
		do 
		{
			System.out.println("1. Insert new Task");
			System.out.println("2. Display All the Tasks");
			System.out.println("3. Search for a Task");
			System.out.println("4. Update a Task");
			System.out.println("5. Delete a Task");
			System.out.println("0. Exit");
			
			System.out.println("Enter your choice:");
			
			//intialise the user choice in userChoice variable declared before
			userChoice=sc.nextInt();
			sc.nextLine(); // for clear continue line it will give next line
			
			//Step4- for selection of user choice we using switch case loop 
			
			switch(userChoice){
			
			    //step5 - now initialise the condition for insert data
				case 1:
					if(taskCount == tasks.length) {
						
						System.out.println("Tasks array is overflow!!! you can not insert any more task...");	
					
						
					}else {
						
						System.out.println("Enter task you want to insert ...");
						userInput=sc.nextLine(); //for store user inputs data 
						
						tasks[taskCount]=userInput; //for store user inputs data in array tasks with count
						/*store input data in array declared tasks in 10 ,taskcount for position 
                        ex: first time insert one data ram it in oth ram 
                            second time insert one data ram it in 1th sam */
						taskCount++;
						System.out.println("Task added Successfully!");	
					}
					
				break;
				
				
				//step6 - now initialise the condition for display data
				case 2: 
					if(taskCount==0) {
						System.out.println("There are no more Tasks in array...");
					}
					else {
						System.out.println("Task List");
						for (int i = 0; i < taskCount; i++) { // for list array data using for loop
						System.out.println(tasks[i]);
						}
					}
					
				break;
				
				
				 //step7 - now initialise the condition for search data
				case 3:
					if(taskCount==0) {
						System.out.println("There are no more Tasks in array...");
						
					}else {
						System.out.println("Enter the task you want search:");
						userInput=sc.nextLine(); //for store user inputs data you want search
						
						int index = -1; // important rule in crud for value of index & Initial index for checking & deleting index from array
						for (int i = 0; i < taskCount; i++) { // for searching array data using for loop
							
							if(tasks[i].equals(userInput)) {  // for mathing array data with user input
								index = i; // if it match data is found set index = i
								break;
								}
							}
						
						if(index == -1) {
							System.out.println("Task not found");	//if it not match data not found index is -1
						}else {
							System.out.println("Your task is on position : " + (index + 1));	// for the position index + 1
						}	
						
					}
					
				break;
				
				
				//step8 - now initialise the condition for update data
				case 4: 
					if(taskCount==0) {
						
						System.out.println("There are no more Tasks in array...");
						
					}else {
						System.out.println("Enter the task you want update:");
						userInput=sc.nextLine(); //for store user inputs data you want update
						
						int index = -1; // important rule in crud for value of index & Initial index for checking & deleting index from array
						for (int i = 0; i < taskCount; i++) { // for searching array data using for loop
							
							if(tasks[i].equals(userInput)) {  // for mathing array data with user input
								System.out.println("Enter the new task:");
								index = i; // if it match data - is found set index = i
								
								String updateTask = sc.nextLine(); // if it match data is found set new task for update
								tasks[i]=updateTask;  // set the user input new task to old task
								
	
								System.out.println("Task updated successfully...");
							    break;
								}
							}
						
						if(index == -1) {
							System.out.println("Task not found");	//if it not match - data not found index is -1
						}
					}
					
				break;
				
				
				//step9 - now initialise the condition for delete data
				case 5: 
					if(taskCount==0) {
						
						System.out.println("There are no more Tasks in array...");
						
					}else {
						System.out.println("Enter the task you want delete:");
						userInput=sc.nextLine(); //for store user inputs data you want delete
						
						int index = -1;// Initial index for checking & deleting index from array
						for(int i=0;i<taskCount;i++) {
							
							if(tasks[i].equals(userInput)) {    // for mathing array data with user input
								index = i;   // if it match data - is found set index = i
								break;
							}
						}
						
						if(index == -1) {
							System.out.println("Task not found");	//if it not match - data not found index is -1
						}else {
							
							for(int i=index;i<taskCount-1;i++) { // delete the count using index ex: index is 4 for(4;4-1;I++)
								
								tasks[i]=tasks[i + 1]; // to the next counter
							}
							
							taskCount--;
							System.out.println("Task deleted successfully");
						}
						
					}
					
				break;
				
				//step10 - now initialise the condition for exit 
				case 0:
					System.out.println("Good bye!!!");
					break;
				default:
					System.out.println("please check your input your choice does not exists!!!");
				}
			
		}while(userChoice!=0);
		
		

	}

}
