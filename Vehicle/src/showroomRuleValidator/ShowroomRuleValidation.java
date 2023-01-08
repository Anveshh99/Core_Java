package showroomRuleValidator;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static com.org.app.Vehicle.sdf;

import com.org.app.Color;
import com.org.app.Vehicle;
import tester.vehicleTester;

import vehicleException.ShowroomHandlingException;


public class ShowroomRuleValidation {
	
	public static final double min_price ;
	public static final double max_price;
	public static Date startdate;
	public static Date enddate;
	
	static
	{
		min_price=10000;
		max_price=1000000;
		
		try {
			startdate= sdf.parse("01-01-2021");
			enddate=sdf.parse("31-12-2024");			
		}
		catch( ParseException exp ){
			System.out.println("problem in static init block: "+ exp);
		}
	}
	

	public static double validatebaseprice(double price) throws ShowroomHandlingException
	{
		if(price>max_price || price<min_price)
		{
			throw new ShowroomHandlingException("BasePrice is not in range");
		}
		return price;
	}
	
	public static Date validatemanufacturingdate(String manufacturdate) throws ParseException,ShowroomHandlingException
	{
		Date manf_date=sdf.parse(manufacturdate);
		
		if(manf_date.before(startdate) || manf_date.after(enddate))
		{
			throw new ShowroomHandlingException("Invalid Date of Car");
		}
		System.out.println(manf_date.toString());
		return manf_date;
	}
	
	public static Color validateColor(String color) throws ShowroomHandlingException
	{
		try {
			return Color.valueOf(color.toUpperCase());
		}
		catch(IllegalArgumentException exp)
		{
			StringBuilder sb= new StringBuilder("Not Correct Color \n");
			sb.append(Arrays.toString(Color.values())+"\n");
			sb.append("choose correct color");
			
			throw new ShowroomHandlingException(sb.toString()); 
		}
	}
	
	public static String validateChasisno(String chasisno, List<Vehicle> vehiclelist) throws ShowroomHandlingException
	{
		Vehicle newVehicle= new Vehicle(chasisno);
		if(vehiclelist.contains(newVehicle))
		{
			throw new ShowroomHandlingException("Vehicle is Duplicate");
		}
		return chasisno;
	}
	
	
}
