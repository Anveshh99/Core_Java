package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import com.org.app.Vehicle;

public class IOUtils {

	
	public static void saveVehicleDetails(List<Vehicle> list,String fileName) throws IOException
	{
		try(PrintWriter pw= new PrintWriter(new FileWriter(fileName)))
		{
			for(Vehicle v: list)
			{
				pw.println(v );
			}
			
		}
	}
	
}
