package com.Movie.Dao;

import java.util.Scanner;

import com.Movie.Exception.MovieException;
import com.Movie.Pojo.MoviePojo;

public class MovieDao  {
	
	//First we intialise the variables and requirements
	
	Scanner sc = new Scanner(System.in);
	
	//Step1-Create object for store data in array Create one string for user input
	
	MoviePojo movies[]; // MoviePojo [] movies = new MoviePojo[Size]
	String userInputMovie = "";
	
	//Intialise the size and count of movies
	
	int movieSize, moviesCount;
	
	//Step2- create constructor for user input for movie size
	
	public MovieDao(int movieSize){
		moviesCount=0;
		this.movieSize=movieSize;
		movies= new MoviePojo[movieSize]; // declare a  moviesSize-arraysize in movies array
	}
	
	//Step3- create one method for insert a user input data to store in movies array
	
	public void addMovies() {
		if(moviesCount == movies.length) {
			
			System.out.println("Movies array is overflow!!! you can not insert any more movie...");
			
		}else {
			
		MoviePojo addmovie = new MoviePojo(); // create one object for adding the data
		System.out.println("Enter the movie id:");
		addmovie.setMovieId(sc.nextInt());
		
		System.out.println("Enter the movie name:");
		addmovie.setMovieName(sc.next());
		
		System.out.println("Enter the movie text:");
		addmovie.setMovieText(sc.next());
		
		System.out.println("Enter the movie category:");
		addmovie.setMovieCategory(sc.next());
		
		movies[moviesCount]=addmovie; // store movies in array with count
		moviesCount++;
		System.out.println("Movie added successfully!");
		}
		
	}
	
	//Step4- create one method for list all movies in array using getter method
	
	public void listMovies() {
		if(moviesCount==0) {
		System.out.println("There are no more movie in array...");
		}else {
			
		for(int i=0;i<moviesCount;i++) { // for accessing array using foe loop
			System.out.println(movies[i].getMovieId()+" "+movies[i].getMovieName());
		}
		}
	}
	
	//Step4- create one method for search particular movie using getter method
	public void searchMovies() {
		if(moviesCount==0) {
			
			System.out.println("There are no more movie in array...");
			
		}else {
			
		int index = 0; // important rule in crud for value of index & Initial index for checking & deleting index from array
		System.out.println("Enter the movie name to be searched: ");
		userInputMovie = sc.next(); //for store user inputs data you want search
		
		for (int i = 0; i < moviesCount; i++) {
			if (userInputMovie.equals(movies[i].getMovieName())) {  // for mathing array data with user input
				
				System.out.println("Movie name searched : " + movies[i].getMovieName() + " " + movies[i].getMovieId());
				index = 1;  // if it match data is found set index = 1
				break;
				}
			}
		if (index == 0) {  //if it not match data not found index is 0
			try {
				throw new MovieException("Movie could not be searched");
				} catch (MovieException ne) {
					System.out.println("Please try again!");
					}
			}
		}
	}
	
	//Step5- create one method for update particular movie using getter setter method
	
	public void updateMovies() {
		
        if(moviesCount==0) {
			
			System.out.println("There are no more movie in array...");
			
		}else {
		System.out.println("Enter the movie name you want to update:");
		userInputMovie=sc.next();
		
		int index=0;  // important rule in crud for value of index & Initial index for checking & deleting index from array
		for(int i=0;i<moviesCount;i++) {
			
			if(movies[i].getMovieName().equals(userInputMovie)) { // for mathing array data with user input
				
				System.out.println("Enter the new movie name:");
				String updateMovie =sc.next();   // if it match data is found set new task for update
				movies[i].setMovieName(updateMovie);  // set the user input new task to old task
				index=1; 
				System.out.println("Movie updated successfully! ");
				break;
			}
		}
	
	if(index==0) { //if it not match data not found index is 0
		
		try {
			throw new MovieException("Your searched movie is not found");
		}
		catch(MovieException e) {
			System.out.println("Please try again");
		}
	}
   }
 }
	
	//Step6- create one method for delete particular movie using getter method
	
	public void deleteMovies() {
       if(moviesCount==0) {
			
			System.out.println("There are no more movie in array...");
			
		}else {
		System.out.println("Enter the movie name you want to delete:");
		userInputMovie=sc.next();
		
		int index=0;  // important rule in crud for value of index & Initial index for checking & deleting index from array
		for(int i=0;i<moviesCount;i++) {
			
			if(movies[i].getMovieName().equals(userInputMovie)) { // for mathing array data with user input
				index=1;    // if it match data - is found set index = 1
				
				for(int j=i;j<moviesCount-1;j++) {  // delete the count using index ex: index is 1 for(1;4-1;I++)
					
					movies[j]= movies[j + 1];   // to the next counter
				}
				
				moviesCount--;
				System.out.println("Successfuly deleted!");
				
				break;
			}
		}
	
	if(index==0) { //if it not match data not found index is 0
		
		try {
			throw new MovieException("Your searched movie is not found");
		}
		catch(MovieException e) {
			System.out.println("Please try again");
		}
	}
	  }
	}
	
	//Step7- create one method for assign movie to user
	public void assigneeMovie() {
        if(moviesCount==0) {
			
			System.out.println("There are no more movie in array...");
			
		}else {
		
		System.out.println("Enter the movie name to be be assigned to a user: ");
		userInputMovie = sc.next(); 
		
		int index = 0; // important rule in crud for value of index & Initial index for checking & deleting index from array
		for (int i = 0; i < moviesCount; i++) {
			if (userInputMovie.equals(movies[i].getMovieName())) { // for mathing array data with user input

				System.out.println("Enter the name of the assignee user: ");
				movies[i].setAssignMovieTo(sc.next());  // assign movie to user
				index = 1;
				System.out.println("Movie assigned to user! ");
				break;
				
			}
		}
		if (index == 0) { //if it not match data not found index is 0
			System.out.println("Movie does not exist");
		}
	}

	}
	

}
