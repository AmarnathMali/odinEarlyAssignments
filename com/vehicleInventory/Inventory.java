package com.vehicleInventory;

public class Inventory {
	private Vehicle[] vehicles;
	public Inventory() {
		vehicles = new Vehicle[5];
	}
	int index = 0;
	public void addVehicle(Vehicle v) {
		vehicles[index] = v;
		index++;	
	}
	public void listInventory() {
		for(Vehicle v: vehicles) {
			System.out.println(v.getInfo());
		}
	}
	
}
