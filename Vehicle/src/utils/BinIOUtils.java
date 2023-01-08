package utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;

import static com.org.app.Vehicle.sdf;

import com.org.app.Color;
import com.org.app.Vehicle;



/*private String chasisno;
private Color color;
private double baseprice;
private Date manufacturedate;
private deliveryAddress address;*/

public class BinIOUtils {
	
	public static void saveVehicleDetailsInBinary(Vehicle v, String filename) throws FileNotFoundException, IOException

	{
		try(DataOutputStream out=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filename))))
		{
			out.writeUTF(v.getChasisno());
			out.writeUTF(v.getColor().toString());
			out.writeDouble(v.getBaseprice());
			out.writeUTF(sdf.format(v.getManufacturedate()).toString());
			out.writeUTF(v.getCompany());
			
		}
	}
	
	public static Vehicle restoreVehicleDetails(String filename) throws FileNotFoundException, IOException, ParseException
	{
		File f1= new File(filename);
		if(f1.exists() && f1.isFile() && f1.isFile())
		{
			try(DataInputStream in= new DataInputStream
					(new BufferedInputStream
							(new FileInputStream(filename))))
			{
				return new Vehicle(in.readUTF(), Color.valueOf(in.readUTF()), in.readDouble(), sdf.parse(in.readUTF()), in.readUTF()) ;
			}
		}
		return null;
	}
	
}
