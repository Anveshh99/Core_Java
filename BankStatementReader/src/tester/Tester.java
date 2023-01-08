package tester;

import static utils.readTester.readTextFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.core.bank.AccountStatement;

//* Sum of all deposits = 54000.0 
//* Max deposit amount= 50000.0
//* Shopping expenses = 12000.0 
//* Date on which max amount withdrawn= 02-01-2022

public class Tester {
	
	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in))
		{
//		boolean exist=false;

//		while(!exist)
//		{
			
//			System.out.println(" Please select the Option: \n"
//					+ " 1. Sum of all Deposits\n"
//					+ " 2. Max deposit amount\n"
//					+ " 3. Shopping expenses (sum of withdrawals for shopping"
//					+ " 4. Date on which maximum");
					
		    List<AccountStatement> list=readTextFile();
		    
//		    switch(sc.nextInt())
//		    {
		        
		    //case 1:
		    	
		    	double sum = 0;
		    	
		    	for( AccountStatement a  :list)
		    	{
		    	  sum += a.getDdepositAmount();
		    	}
		    	
		    	System.out.println("Sum of all deposits = "+sum);
//		        break;
		        
		    //case 2:
		    	
//		    	double max=0;
//		    	
//		    	for( AccountStatement a  :list)
//		    	{
//		    	  if(max<a.getDdepositAmount())
//		    		  max=a.getDdepositAmount();
//		    	}
		    	
		    	double max =Collections.max(list, new Comparator<AccountStatement>() {

					@Override
					public int compare(AccountStatement o1, AccountStatement o2) {
						
						
						return ((Double)o1.getDdepositAmount()).compareTo(o2.getDdepositAmount());
					}
		    			
		    	} ).getDdepositAmount();
		    	
		    	System.out.println("Max deposit amount = "+max );
//		        break;
		        
            //case 3:
		    	
		    	double sumOfWithdrawal=0;
		    	double maxforShopping=0;
		    	for( AccountStatement a  :list)
		    	{
		    		if(a.getNarration().equalsIgnoreCase("Shopping"))
		    	    {
		    			if(maxforShopping<a.getDdepositAmount())
		    				maxforShopping=a.getDdepositAmount();
		    			sumOfWithdrawal += a.getWithdrawalAmount();
		    		}
		    		
		    	}
		    	
		    	System.out.println("Shopping expenses (sum of withdrawals for shopping)= "+sumOfWithdrawal); 
		     
		    	
		    	
		    	
		    	
                double maxOfWithdraw=0;
                LocalDate maxWithdrawalDate = null;
		    	
		    	for( AccountStatement a  :list)
		    	{
		    	  if(maxOfWithdraw<a.getWithdrawalAmount())
		    	  {
		    		  maxOfWithdraw=a.getWithdrawalAmount();
		    		  maxWithdrawalDate=a.getTransactionDate();
		    	  }	  
		    	}
		    	
		    	System.out.println("Date on which max amount withdrawn = "+ maxWithdrawalDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		    	


		    
		    }
		catch(Exception e)
		{
		    	System.out.println("error :"+ e);
		    	e.printStackTrace();
		    	
		}

	}
	

}
