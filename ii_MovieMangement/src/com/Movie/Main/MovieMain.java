package com.Movie.Main;
import java.util.Scanner;
import com.Movie.Dao.MovieDao;
import com.Movie.Exception.MovieException;
public class MovieMain {

	public static void main(String[] args) throws MovieException {
		// TODO Auto-generated method stub
		
		//First we intialise the variables and requirements
		
		int userChoice, movieSize;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of movies to be store:");
		movieSize=sc.nextInt();
		
		//Create one object for parametrized constructor MovieDa
		MovieDao movie = new MovieDao(movieSize);
		
		do {
			
			System.out.println("************Movie Management System Menu************");
			System.out.println("1. Adding a Movie in the Library");
			System.out.println("2. View All movies");
			System.out.println("3. Searching a Movie in the Library");
			System.out.println("4. Updating a Movie in the Library");
			System.out.println("5. Assign movie to a category");
			System.out.println("6. Deleting a Movie from the Library");
			System.out.println("0. Exit the application");
			
			System.out.println("Enter your choice:");
			userChoice=sc.nextInt();
			sc.nextLine();
			
			switch(userChoice) {
			
			case 1:
			System.out.println("Add:");
			movie.addMovies();
			break;
			
			case 2:
			System.out.println("List:");
			movie.listMovies();
			break;
				
			case 3:
			System.out.println("Search");
			movie.searchMovies();
			break;
				
			case 4:
			System.out.println("Update:");
			movie.updateMovies();
			break;
				
			case 5:
			System.out.println("AssignTo:");
			movie.assigneeMovie();
			break;
				
			case 6:
			System.out.println("Delete:");
			movie.deleteMovies();
			break;
			
			case 0:
			System.out.println("Exit, Thank you!");
			break;		
				
			default:
				System.out.println("Please try again");	
			}
			
		}while(userChoice!=0);

	}

}
