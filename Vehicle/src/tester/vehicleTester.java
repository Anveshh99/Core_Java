
package tester;

import static showroomRuleValidator.ShowroomRuleValidation.validateChasisno;
import static showroomRuleValidator.ShowroomRuleValidation.validateColor;
import static showroomRuleValidator.ShowroomRuleValidation.validatebaseprice;
import static showroomRuleValidator.ShowroomRuleValidation.validatemanufacturingdate;
import static showroomRuleValidator.ShowroomUtils.findbychasisno;
import static showroomRuleValidator.ShowroomUtils.populatedShowroom;
import static utils.IOUtils.saveVehicleDetails;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.org.app.Color;
import com.org.app.Vehicle;
import com.org.app.compareByBasePrice;

import utils.IOUtils;

public class vehicleTester {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		try(Scanner sc= new Scanner(System.in))
		{
		
		List<Vehicle> list= new ArrayList<Vehicle>();
		
		list=populatedShowroom();
		
		boolean exit = false;
		
		while (!exit) 
		{
			System.out.println("Options : 1. Add a vehicle 2. Display 3. Display all vehicles having specified color"
					+ "4. Apply discount to a particular vehicle 5. Purchase a vehicle 6. Natural Sorting on basis of chasis no 7. Custom Sorting on basis of baseprice "
					+ "8. Custom Sorting on the basis of Manufactutring Date. 10. Exit");
	System.out.println("Choose");
			
			try {
				switch (sc.nextInt()) 
				{
				case 1:
					sc.nextLine();
					System.out.println("Enter Chasis no, color, Baseprice, manufacturing date, company");
                    Vehicle V= new Vehicle(validateChasisno(sc.next(),list),validateColor(sc.next()),validatebaseprice(sc.nextDouble()),validatemanufacturingdate(sc.next()),sc.next());
                    list.add(V);
                    System.out.println("vehicle is added");
					break;

				case 2:
					sc.nextLine();
					System.out.println("Display");
					for(Vehicle m: list)
					{
						if(m!=null)
						{
							System.out.println(m);	
						}
					}
				
					break;
					
					
				case 3:
					sc.nextLine();
					//Display all vehicles having specified color
					System.out.println("Enter the colour of the vehicle");
					Color clrchosen= validateColor(sc.next()) ;
					for(Vehicle v: list)
					{
						if(v!=null && v.getColor().equals(clrchosen))
						{
							System.out.println(v);
						}
					}
                    break;
                    
				case 4:
					sc.nextLine();
					//Apply discount to a particular vehicle 
					sc.nextLine();
					System.out.println("Enter the vehicle chasis no and  discount required");
					String searchChasisNo=sc.nextLine();
					System.out.println("Enter the discount value");
					int discount=sc.nextInt();
				    Vehicle vehFound= findbychasisno(searchChasisNo,list);
				    vehFound.setBaseprice(vehFound.getBaseprice()-discount);
 				     System.out.println("Dicount applied");
				    
					break;
					
				case 5:
					// Purchase a vehicle
					sc.nextLine();
					System.out.println("Enter the vehicle chasis no");
					Vehicle vehFound1= findbychasisno(sc.next(),list);
					if(vehFound1.getAddress()==null)
				    {
						System.out.println("Enter address1, address2, city, pincode, state");
						vehFound1.linkingAddress(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next() );
						System.out.println("Succefully booked Vehicle");
				    }
				    else
				    	System.out.println("Vehicle not avilable for purchase");
					break;
					
				case 6:
					sc.nextLine();
					Collections.sort(list);
				    for(Vehicle v: list)
					System.out.println(v);
					
					break;
					
                case 7:
                	sc.nextLine();
					Collections.sort(list,new compareByBasePrice());
                	for(Vehicle v: list)
					System.out.println(v);
                	break;
                	
                case 8:
                	sc.nextLine();
                	Collections.sort(list,new Comparator<Vehicle>() {
				     	@Override
						public int compare(Vehicle d1, Vehicle d2) {
				     		
				     		System.out.println("In comparator inner class, Manufacturedate");
				
							return d1.getManufacturedate().compareTo(d2.getManufacturedate());
//							String dt=(d1.getManufacturedate()).toString();
//							String dt2=(d2.getManufacturedate()).toString();
//							Date a1=d1.getManufacturedate();
//							Date a2=d2.getManufacturedate();
				//			System.out.println(a1+"  " +a2+" comparison "+ a1.compareTo(a2));
				//			return 0;
						}
					});
                	
//                	for(Vehicle v: list)
//    					System.out.println(v);

                	
                	break;
                	
				case 10:
					exit = true;
					System.out.println("Enter File Name to store details");
			        IOUtils.saveVehicleDetails(list, sc.next() );
					break;
				}
			}
			catch(Exception exp){
				exp.printStackTrace();
			}
		}
		
		}
           catch(Exception exp)
		{
        	   exp.printStackTrace();
		}
		
		

	}





}
