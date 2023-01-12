package week3OOPs;

public class Runner {

	public static void main(String[] args) {

		// creating Vehicle class object for Car class
		Vehicle car1 = new Car("Honda Civic", 2000, 6500.0, 32.0);
		Vehicle car2 = new Car("TATA", 2022, 22500, 12.3);
		Vehicle car3 = new Car("SUMO", 2022, 89000, 22.3);
		Vehicle car4 = new Car("Renult", 2022, 59600, 20.3);

		// creating Vehicle class object for Truck class

		Vehicle truck1 = new Truck("TATA", 2022, 222222, 123);
		Vehicle truck2 = new Truck("Ashok lelyand", 2019, 17.53, 17);
		Vehicle truck3 = new Truck("Mahindra", 2018, 15.76, 18);
		Vehicle truck4 = new Truck("Bharat Benz", 2019, 2000000, 16);

		// creating Vehicle class object for Motorcycle class
		Vehicle motorCycle = new Motorcycle("hero splender", 2022, 50000, 60);

		Inventory i = new Inventory();
		// adding car object
		i.addVehicle(car1);
		i.addVehicle(car2);
		i.addVehicle(car3);
		i.addVehicle(car4);

		// adding truck object
		i.addVehicle(truck1);
		i.addVehicle(truck2);
		i.addVehicle(truck3);
		i.addVehicle(truck4);

		i.addVehicle(motorCycle); // adding motorcycle object

		i.listInventory();
	}

}
