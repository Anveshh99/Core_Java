package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.core.bank.AccountStatement;

public class readTester {

	public static List<AccountStatement> readTextFile() 
	{
		
		ArrayList<AccountStatement> populatedArray= new  ArrayList<AccountStatement>();
		
		System.out.println("Enter the text file path");
		
		Scanner sc = new Scanner(System.in);
		
		try(Scanner br= new Scanner(new FileReader(sc.nextLine())))
		
		{
			
			
			
			while(br.hasNext())
			{
			String[] details= br.nextLine().split(",");
			
			LocalDate localdate=null;
			
			try{
				localdate= 
						LocalDate.parse(details[0], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			}
			catch(Exception e)
			{
				continue;
			}
			
			populatedArray.add(new AccountStatement(localdate, details[1],Double.parseDouble(details[2]), Double.parseDouble(details[3])));
			
//			System.out.println("Data Restore");
			}
			
//			for(AccountStatement a: populatedArray)
//			{
//				System.out.println(a);
//				System.out.println();
//			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("error :"+e);
			e.printStackTrace();
		}
		
		return populatedArray;
	}

}
