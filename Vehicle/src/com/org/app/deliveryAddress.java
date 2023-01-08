package com.org.app;

public class deliveryAddress {
	
	private String address1;
	private String address2;
	private String city;
	private int pincode;
	private String state;
	
	
	
	public deliveryAddress(String address1, String address2, String city, int pincode, String state) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}


	

	@Override
	public String toString() {
		return "deliveryAddress [address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", pincode="
				+ pincode + ", state=" + state + "]";
	}
	
	
	
	
	
	
	
	

}
