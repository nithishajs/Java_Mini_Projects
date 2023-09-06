package com.Store.Main;

import java.util.Scanner;

import com.Exception.NegativeException.NegativeException;
import com.StoreInformation.Dao.StoreInformation;

public class StoreMain {

	public static void main(String[] args)  throws NegativeException {
		// TODO Auto-generated method stub
		
		//First we intialise the variables and requirements
		int userChoice, productSize;
		
		//Create one object for constructor StoreInformationDao
		StoreInformation user = new StoreInformation();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of products to be store:");
		productSize=sc.nextInt();
		
		
		
		//Create one object for parametrized constructor StoreInformationDao
		StoreInformation product = new StoreInformation(productSize);
		
		
		
		do {
			
			System.out.println("************Store Management System Menu************");
			System.out.println("1. Adding a Product in the Store");
			System.out.println("2. View All Products");
			System.out.println("3. Searching a Product in the Store");
			System.out.println("4. Updating a Product in the Store");
//			System.out.println("5. Assign Product to a Store");
			System.out.println("5. Deleting a Product from the Store");
			System.out.println("0. Exit the application");
			
			System.out.println("Enter your choice:");
			userChoice=sc.nextInt();
			sc.nextLine();
			
            switch(userChoice) {
			
			case 1:
			System.out.println("Add Products:");
			product.addProducts();
			break;
			
			case 2:
			System.out.println("List Products:");
			product.listProducts();
			break;
           
            
		    case 3:
		    System.out.println("Search Products:");
			product.searchProducts();
			break;
        
            
		    case 4:
			System.out.println("Update Products:");
		    product.updateProducts();
			break;
			
		    case 5:
			System.out.println("Delete Products:");
			product.deleteProducts();
		    break;
				
		    case 0:
			System.out.println("Exit, Thank you!");
			break;
	        
		    default:
		  	System.out.println("Please try again");	
		  	}
          }
		while(true);
		}
	}
