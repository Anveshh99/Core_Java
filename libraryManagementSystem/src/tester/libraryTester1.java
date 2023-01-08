package tester;

import static utils.ValidateRule.ValidatePassword;
import static utils.ValidateRule.validateBookId;
import static utils.ValidateRule.validateCategory;
import static utils.ValidateRule.validateDate;
import static utils.ValidateRule.validateUsername;
import static utils.utilsCollection.AdminsDetails;
import static utils.utilsCollection.SampleBooks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import libraryManagementSystem.Admin;
import libraryManagementSystem.Book;
import libraryManagementSystem.CampareByTitles;
import libraryManagementSystem.Category;

public class libraryTester1 {
	
	public static void  main(String[] args)
	{
		
		try(Scanner sc= new Scanner(System.in))
		{
			
			Map<String, Book> bookCart= SampleBooks() ;
			Map<String, Admin> AdminsLoginDetails= AdminsDetails();
//			Map<String, Reader> ReaderLoginDetails= ReaderDetails();
			
			try {
				
			boolean exit=false;
			
			while(!exit) {
			
			System.out.println("Enter the choice for Login \n"  
					        + " 1. Reader Login\n"
					        + " 2. Admin Login\n"
					        + " 3. Create New Account as a Reader\n"
					        + " 10. Exit\n" );
			
				
	
			switch(sc.nextInt())
			{
			
			case 1:			
				System.out.println("Enter the UserId and Password");
				
				if(validateUsername(sc.next()) && ValidatePassword(sc.next())) 
				{
					boolean exit2=false;
					System.out.println("login Successfully");
					
					while(!exit2)
					{
					sc.nextLine();
					System.out.println(" Enter the choice \n"  
					        + " 1. Display Books\n"
					        + " 2. Search By BookId\n"
					        + " 3. Search by Title\n"
					        + " 4. Search by Category\n"
					        + " 5. Add Book to Cart\n"
					        + " 6. Return Book to Cart\n"
					        + " 7. Sorting by BookTitles\n"
					        + " 8. Sorting by AuthorName"
					        + "10.Exit\n" );
					
					switch(sc.nextInt())
					{
					
					case 1:	
						for(Book b: bookCart.values() )
							System.out.println(b);
							
						break;
						
					case 2:
						System.out.println("Enter the Book Id for Searching");
						int id=validateBookId(sc.nextInt());
						for(Book b: bookCart.values())
						{
							if(b.getBookid()== id)
								System.out.println(b);
						}
						break;
						
					case 3:
						System.out.println("Enter the Book Title for Searching");
						sc.nextLine();
						String Title=sc.nextLine();
						for(Book b: bookCart.values())
						{
							if(b.getTitle().equalsIgnoreCase(Title))
								System.out.println(b);
						}
						break;
						
					case 4:
						System.out.println("Enter the Book Category");
						Category type= validateCategory(sc.next());
						for(Book b: bookCart.values())
						{
							if(b.getBooktype().equals(type))
								System.out.println(b);
						}
						break;
						
					case 5:
                        //" 5. Add Book to Cart\n"
						
						
						break;
						
					case 6:
						System.out.println("Enter the Book Title");
						
						break;
						
					case 7:
						System.out.println("Sorting by BookTitles\n");
						ArrayList<Book> booklist=new ArrayList<Book>(bookCart.values());
						Collections.sort(booklist, new CampareByTitles());
						
						System.out.println(booklist);
						
						break;
						
					case 8:
						System.out.println("Sorting by BookTitles");
						ArrayList<Book> booklist2=new ArrayList<Book>(bookCart.values());
						Collections.sort(booklist2);
						

						System.out.println(booklist2);
						break;
						
					case 9:
						System.out.println("Sorting by Bookid");
						ArrayList<Book> booklist3=new ArrayList<Book>(bookCart.values());
						Collections.sort(booklist3,new Comparator<Book>() {

							@Override
							public int compare(Book o1, Book o2) {
								System.out.println("into inner class");
								if(o1.getBookid()<o2.getBookid())
									return -1;
								else if(o1.getBookid()>o2.getBookid())
									return 1;
								else
									return 0;
							}
							
						});					
					System.out.println(booklist3);
					break;
						
						
						
						
					case 10:
					exit2=true;
					break;
					
					}
					}
			
				}

			
				break;
				
			case 2:
				
                System.out.println("Enter the UserId and Password");
				
				if(validateUsername(sc.next()) && ValidatePassword(sc.next())) 
				{
					System.out.println("login Successfully");
					
					boolean exit2=false;
					
					while(!exit2)
					{
					System.out.println("Enter the choice"  
					        + "1.Add Book for Library"
					        + "2.Display Books"
					        + "3."
					        + "10.Exit" );
					
					switch(sc.nextInt())
					{
					
					case 1:	
						
						System.out.println("Enter Book Title, Bookid, AuthorName, IssueingDate, Booktype,qua");
						String title_book=sc.next();
						bookCart.put(title_book, new Book(title_book, validateBookId(sc.nextInt()), sc.next(), validateDate(sc.next()), validateCategory(sc.next()),sc.nextInt()));		
						break;
						
					case 2:
						
						System.out.println(bookCart);
						break;
						
					case 10:
					exit2=true;
					break;
					
					}
					}
			
				}
				
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			case 10:
				exit=true;
				break;
			
			
			}
			
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("THANKYOU...!!!!!!!!!");
		}
	}






}


