package com.org.app;

import java.text.SimpleDateFormat;
import com.org.app.deliveryAddress;

import java.util.Date;

public class Vehicle implements Comparable<Vehicle> {
	
	private String chasisno;
	private Color color;
	private double baseprice;
	private Date manufacturedate;
	private deliveryAddress address;
	
	public String getChasisno() {
		return chasisno;
	}


	public Color getColor() {
		return color;
	}


	public double getBaseprice() {
		return baseprice;
	}


	public Date getManufacturedate() {
		return manufacturedate;
	}


	public String getCompany() {
		return company;
	}


	public static SimpleDateFormat getSdf() {
		return sdf;
	}

	private String company;
	
	public static SimpleDateFormat sdf;
	
	static
	{
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}
	
	public Vehicle(String chasisno, Color color, double baseprice, Date manufacturedate, String company)
	{
		this.chasisno=chasisno;
		this.color=color;
		this.baseprice=baseprice;
		this.manufacturedate=manufacturedate;
		this.company=company;
		
	}
	
	
	
	public void setBaseprice(double baseprice) {
		this.baseprice = baseprice;
	}


	public boolean equals(Object newVehicle)
	{
		System.out.println("In Equal's Methods");
		if(newVehicle instanceof Vehicle)
			return this.chasisno.equals(((Vehicle)newVehicle).chasisno);
		return false;
	}
	
	
	public deliveryAddress getAddress() {
		return address;
	}


	public void linkingAddress(String addr1,String addr2,String city,int pincode,String state)
	{
		this.address= new deliveryAddress(addr1, addr2, city, pincode, state);
		System.out.println("Delivery Address is Assigned");
	}


	@Override
	public String toString() {
	
		String mesg  = address == null? "Not Assigned": address.toString();
		return "Vehicle [chasisno=" + chasisno + ", color=" + color + ", baseprice=" + baseprice + ", manufacturedate="
				+ sdf.format(manufacturedate) + " company=" + company+" address=" + mesg  + "]";
	}


	public Vehicle(String chasisno) {
		super();
		this.chasisno = chasisno;
	}


	@Override
	public int compareTo(Vehicle anotherVehicle) {
		
		return this.chasisno.compareTo(anotherVehicle.chasisno);
		
	}
	
}
