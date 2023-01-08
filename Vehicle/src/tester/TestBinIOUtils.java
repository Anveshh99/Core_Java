package tester;

import static showroomRuleValidator.ShowroomRuleValidation.validatemanufacturingdate;
import static com.org.app.Vehicle.sdf;

import java.util.Scanner;
import static utils.BinIOUtils.*;
import com.org.app.Color;
import com.org.app.Vehicle;

public class TestBinIOUtils {

	public static void main(String[] args) {

		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("enter file Name for restoring Data");
			String file=sc.nextLine();
			Vehicle v=new Vehicle("abc-1111", Color.BLACK, 12345, validatemanufacturingdate("22-02-2022"), "Honda");
			saveVehicleDetailsInBinary(v, file);
			Vehicle restoreDetails= restoreVehicleDetails(file);
			
			System.out.println("Restored Details :  "+ restoreDetails);
			
			restoreDetails.setBaseprice(v.getBaseprice()+5000);
            restoreDetails= restoreVehicleDetails(file);
			
			System.out.println("Restored Details :  "+ restoreDetails);
			
		}
		catch(Exception e) {
			System.out.println("error"+e);
			e.printStackTrace();
		}
		

	}

}
