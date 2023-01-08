package validation;

import java.time.LocalDate;

import exception.TaskHandlingException;

public class validateRules {
	
	private static LocalDate beforeDate= LocalDate.parse("2022-12-10");
	
	private static LocalDate afterDate= LocalDate.parse("2022-10-10");
	
	
	
	public static LocalDate validateDate(String date) throws TaskHandlingException
	{
		LocalDate dt= LocalDate.parse(date);
		if(dt.isAfter(afterDate) && dt.isBefore(beforeDate))
			return dt;
		
	    throw new TaskHandlingException("Invalid Date");
	}
	

}
