package com.vehicleInventory;

public class MotorCycle extends Vehicle {
	
	int handGlovesPrice;

	public MotorCycle(String type, int year, double price, int handGlovesPrice) {
		super(type, year, price);
		this.handGlovesPrice = handGlovesPrice;
	}
	
	public String getInfo() {
		return " "+super.getInfo()+" "+handGlovesPrice;
	}
	
	
}
