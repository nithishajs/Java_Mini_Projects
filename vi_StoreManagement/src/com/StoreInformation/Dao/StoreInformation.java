package com.StoreInformation.Dao;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import com.Exception.NegativeException.NegativeException;
import com.Products.Pojo.ProductPojo;
import com.User.Pojo.UserPojo;

public class StoreInformation {
	//First we intialise the variables and requirements
	
	Scanner sc = new Scanner(System.in);
	
	//Step1-Create object for store data in array Create one string for user input
	
	ProductPojo products[]; // ProductPojo [] products = new ProductPojo[Size]
	UserPojo users[];  // UserPojo [] users = new UserPojo[Size]
	String userInputProduct = "";
	
	//Intialise the size and count of movies
	
	int productSize, productCount, userCount;
	
	//Step3- create one method for insert a user input data to store in users array
	
	public  StoreInformation() {
		UserPojo adduser= new UserPojo(); // create one object for adding the data
		
		System.out.println("Enter the Username:");
		adduser.setUsername(sc.next());
				
		System.out.println("Enter the Email ID:");
		adduser.setEmailId(sc.next());
		
		System.out.println("Enter the Password:");
		adduser.setPassword(sc.next());
		
		
		System.out.println("Login successfully!");
	}
	
	//Step2- create constructor for user input for product size
	
		public StoreInformation(int productSize){
			productCount=0;
			this.productSize=productSize;
			products= new ProductPojo[productSize]; // declare a  productSize-arraysize in products array
		}
		
		
		//Step3- create one method for insert a user input data to store in movies array
		
		public void addProducts() {
			if(productCount == products.length) {
				
				System.out.println("Movies array is overflow!!! you can not insert any more movie...");
				
			}else {
				ProductPojo addproduct= new ProductPojo(); // create one object for adding the data
				
				System.out.println("Enter the product id:");
				addproduct.setProductId(sc.nextInt());
				
				System.out.println("Enter the product name:");
				addproduct.setProductName(sc.next());
				
				System.out.println("Enter the product category:");
				addproduct.setCategory(sc.next());
				
				System.out.println("Enter the product quantity:");
				addproduct.setQuantity(sc.nextInt());
				
				System.out.println("Enter the product price:");
				addproduct.setPrice(sc.nextInt());
				
				products[productCount]=addproduct; // store products in array with count
				productCount++;
				System.out.println("Product added successfully!");
				}
		}
		
		
		//Step4- create one method for list all products in array using getter method
		
		public void listProducts() {
			if(productCount==0) {
			System.out.println("There are no more products in array...");
			}else {
				
			for(int i=0;i<productCount;i++) { // for accessing array using foe loop
				System.out.println(products[i].getProductId()+" "+products[i].getProductName()+" "+products[i].getCategory()+" "+products[i].getQuantity()+" "+products[i].getPrice());
			}
			}
		}
		
		//Step4- create one method for search particular products using getter method
		public void searchProducts() {
			if(productCount==0) {
				
				System.out.println("There are no more products in array...");
				
			}else {
				
			int index = 0; // important rule in crud for value of index & Initial index for checking & deleting index from array
			System.out.println("Enter the product name to be searched: ");
			userInputProduct = sc.next(); //for store user inputs data you want search
			
			for (int i = 0; i < productCount; i++) {
				if (userInputProduct.equals(products[i].getProductName())) {  // for mathing array data with user input
					
					System.out.println("Details of the Product : \n" + "Product id:"+" "+products[i].getProductId()+"\n"+"Product Name:"+" "+products[i].getProductName()+"\n"+ "Product Category:"+" "+ products[i].getCategory()+"\n"+ "Product Quantity:"+" "+ products[i].getQuantity()+"\n"+ "Product Price:"+" "+ products[i].getPrice());
					index = 1;  // if it match data is found set index = 1
					break;
					}
				}
			if (index == 0) {  //if it not match data not found index is 0
				try {
					throw new NegativeException("Product could not be searched");
					} catch (NegativeException ne) {
						System.out.println("Please try again!");
						}
				}
			}
		}
		
		//Step5- create one method for update particular product using getter setter method
		
		public void updateProducts() {
			
	        if(productCount==0) {
				
				System.out.println("There are no more product in array...");
				
			}else {
			System.out.println("Enter the product name you want to update:");
			userInputProduct=sc.next();
			
			int index=0;  // important rule in crud for value of index & Initial index for checking & deleting index from array
			for(int i=0;i<productCount;i++) {
				
				if(products[i].getProductName().equals(userInputProduct)) { // for mathing array data with user input
					
					System.out.println("Enter the new product name:");
					String updateProduct =sc.next();   // if it match data is found set new task for update
					products[i].setProductName(updateProduct);  // set the user input new task to old task
					index=1; 
					System.out.println("Product updated successfully! ");
					break;
				}
			}
		
		if(index==0) { //if it not match data not found index is 0
			
			try {
				throw new NegativeException("Your searched product is not found");
			}
			catch(NegativeException ne) {
				System.out.println("Please try again");
			}
		}
	   }
	 }
		
		//Step6- create one method for delete particular product using getter method
		
		public void deleteProducts() {
	       if(productCount==0) {
				
				System.out.println("There are no more product in array...");
				
			}else {
			System.out.println("Enter the product name you want to delete:");
			userInputProduct=sc.next();
			
			int index=0;  // important rule in crud for value of index & Initial index for checking & deleting index from array
			for(int i=0;i<productCount;i++) {
				
				if(products[i].getProductName().equals(userInputProduct)) { // for mathing array data with user input
					index=1;    // if it match data - is found set index = 1
					break;
				}
			}
		
		if(index==0) { //if it not match data not found index is 0
			
			try {
				throw new NegativeException("Your searched product is not found");
			}
			catch(NegativeException ne) {
				System.out.println("Please try again");
			}
		}else {
			
			for(int i=index;i<productCount-1;i++) {  // delete the count using index ex: index is 1 for(1;4-1;I++)
				
				products[i]= products[i + 1];   // to the next counter
			}
			
			productCount--;
			System.out.println("Products successfuly deleted!");
			}
		  }
		}

	
	   
}
