package week3OOPs;

public class Inventory {
	// private Car[] cars;
	// private Truck[] truck;
	private Vehicle[] inventory;

	public Inventory() {
		inventory = new Vehicle[9];

	}

	int index = 0;

	void addVehicle(Vehicle v) {
		inventory[index] = v;
		index++;
	}

	/*
	 * void addCar(Car c, int index) { cars[index] = c; } void addTruck(Truck t, int
	 * index) { truck[index] = t; }
	 */
	void listInventory() {
		for (Vehicle v : inventory) {
			System.out.println(v.getInfo());
		}
		System.out.println();
		/*
		 * for(Truck t:truck) { System.out.println(t.getInfo()); }
		 */
	}

}
