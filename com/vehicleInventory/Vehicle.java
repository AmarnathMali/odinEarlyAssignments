package com.vehicleInventory;

public class Vehicle {
	private String type;
	private int year;
	private double price;
	public Vehicle(String type, int year, double price) {
		super();
		this.type = type;
		this.year = year;
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getInfo() {
		return " "+year+" "+type+" "+price;
	}

}
