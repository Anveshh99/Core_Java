package showroomRuleValidator;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.org.app.Color;
import com.org.app.Vehicle;

import static showroomRuleValidator.ShowroomRuleValidation.validatemanufacturingdate;
import vehicleException.ShowroomHandlingException;

public class ShowroomUtils {

	public static List<Vehicle> populatedShowroom() throws ParseException,ShowroomHandlingException {
		// TODO Auto-generated method stub
       
		List<Vehicle> vehicles= new ArrayList<Vehicle>(100);
		
		vehicles.add(new Vehicle("abc-1234", Color.BLACK, 12345, validatemanufacturingdate("2-5-2022"), "Honda"));
		vehicles.add(new Vehicle("abc-1237", Color.WHITE, 52345, validatemanufacturingdate("12-5-2022"), "Maruti"));

		vehicles.add(new Vehicle("abc-1236", Color.WHITE, 72345, validatemanufacturingdate("22-5-2022"), "Tata"));

		vehicles.add(new Vehicle("abc-1230", Color.RED, 32345, validatemanufacturingdate("2-4-2022"), "Maruti"));

		vehicles.add(new Vehicle("abc-1238", Color.GREY, 19345, validatemanufacturingdate("2-7-2022"), "Maurti"));

		vehicles.add(new Vehicle("abc-1232", Color.WHITE, 17345, validatemanufacturingdate("20-8-2022"), "Mahindra"));
		
		return vehicles;
	}

	
	@SuppressWarnings("unused")
	public static Vehicle findbychasisno(String searchChasisNo, List<Vehicle> list) throws ShowroomHandlingException {
		
		
		Vehicle existingVehicle= new Vehicle(searchChasisNo);

        int index= list.indexOf(existingVehicle);
        if (list.contains(existingVehicle))
        		return list.get(index);
               

       throw new ShowroomHandlingException("VEhicle not found");
	}

}
