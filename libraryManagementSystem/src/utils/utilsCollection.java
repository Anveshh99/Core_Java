package utils;

import java.io.IOException;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import exceptionLibraryHandling.ExceptionLibraryHandling;

import static utils.ValidateRule.validateBookId;
import static utils.ValidateRule.validateDate;
import libraryManagementSystem.Reader;
import libraryManagementSystem.Category;
import libraryManagementSystem.Admin;
import libraryManagementSystem.Book;

public class utilsCollection {
	
	public static Map<String, Book> SampleBooks() throws ExceptionLibraryHandling
	{
		Map<String, Book> sampleBookList= new HashMap<String,Book>();
		
		sampleBookList.put("The Kite Runner", new Book("The Kite Runner", validateBookId(121), "Khalid Houssien", validateDate("2021-05-13"), Category.DRAMA,5));
		
		sampleBookList.put("The Fault in our Star", new Book("The Fault in our Star", validateBookId(171), "John Green",validateDate("2021-05-13"), Category.ROMANTIC,5));
		
		sampleBookList.put("Romeo and Juliet", new Book("Romeo and Juliet", validateBookId(141), "Sir William Shakespeare", validateDate("2021-05-13"), Category.FICTIONAL,5));
		
		sampleBookList.put("The Alchemist", new Book("The Alchemist", validateBookId(131), "Paulo Coelho", validateDate("2021-05-13"), Category.DRAMA,5));
		
		sampleBookList.put("The Pilgrimage", new Book("The Pilgrimage", validateBookId(152), "Paulo Coelho", validateDate("2021-05-13"), Category.DRAMA,5));
		
		return sampleBookList;
	}
	
	public static Map<String,Admin> AdminsDetails()
	{
		
		Map<String, Admin> AdminAccessList= new HashMap<String, Admin>();
		
		AdminAccessList.put("Admin123", new Admin("Admin123", "Admin@123"));
		
		AdminAccessList.put("Anvesh123", new Admin("Anvesh123", "Anvesh@99"));
		
		
		return AdminAccessList ;		
	}
	
//	public static Map<String,Reader> ReaderDetails()
//	{
//		
//		Map<String, Reader> ReaderUserList= new HashMap<String, Reader>();
//		
//		ReaderUserList.put("Usrname",new Reader("Usrname", "Username@123"));
//		ReaderUserList.put("Anvesh",new Reader("Anvesh", "Anvesh@123"));
//		
//		return ReaderUserList;
//		
//	}
}
