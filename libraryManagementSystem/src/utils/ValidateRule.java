package utils;

import java.time.LocalDate;
import java.util.Map;

import exceptionLibraryHandling.ExceptionLibraryHandling;
import libraryManagementSystem.Admin;
import libraryManagementSystem.Book;
import libraryManagementSystem.Category;

public class ValidateRule {
	
	private static int BOOK_CHECK=0;
	
	private static LocalDate check_date=LocalDate.parse("2018-05-05");
	
	
	
	
	public static boolean validateUsername(String username)throws ExceptionLibraryHandling
	{
		
		String sampleUserName= "[\\w\\.-].{1,9}";
		
		if(username.matches(sampleUserName))
			return true;
	   throw new ExceptionLibraryHandling("Invalid UserName");
	}
	
	
	public static boolean ValidatePassword(String password) throws ExceptionLibraryHandling
	{
		String PasswordType= "(?=.*\\d)(?=.*[a-z])(?=.*[#@$*%]).{5,10}";
		if(password.matches(PasswordType))
		{ 
			System.out.println("Login Successfully");
			return true;
		}
			
		throw new ExceptionLibraryHandling("Invalid password");
		
	}
	
	public static int validateBookId(int id) throws ExceptionLibraryHandling
	{
		if(id>BOOK_CHECK)
			return id;
		
		throw new ExceptionLibraryHandling("Not Valid Book id");
	}

	public static LocalDate validateDate(String date)throws ExceptionLibraryHandling
	{
		LocalDate dt=LocalDate.parse(date);
		if(dt.isAfter(check_date) && dt.isBefore(LocalDate.now()))
				return dt;
		
		throw new ExceptionLibraryHandling("Invalid Date");
		
	}
	
	
	public static Category validateCategory(String type) throws ExceptionLibraryHandling {
	
        		
		return Category.valueOf(type.toUpperCase());
	}

}
