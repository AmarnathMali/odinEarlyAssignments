package com.vehicleInventory;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Honda Civic",1998,6499,36);
		Car c2 = new Car("BMW",2000,5000,20);
		Truck t = new Truck("Ford F-150",2004,8999,3200);
		Truck t2 = new Truck("Ashok Leyland",2005,7666,2500);
		MotorCycle mc = new MotorCycle("Honda shine",2018,2000,600);
		
		Inventory i = new Inventory();
		i.addVehicle(c1);
		i.addVehicle(c2);
		i.addVehicle(t);
		i.addVehicle(t2);
		i.addVehicle(mc);
		i.listInventory();
		

	}

}
