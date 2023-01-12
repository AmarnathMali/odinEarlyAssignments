package week3OOPs;

public class Truck extends Vehicle {
	private int towing;

	public Truck(String type, int year, double price, int towing) {
		super(type, year, price);
		this.towing = towing;
	}

	public int getTowing() {
		return towing;
	}

	public void setTowing(int towing) {
		this.towing = towing;
	}

	boolean canTowBoat() {
		if (towing > 2000) {
			return true;
		} else {
			return false;
		}
	}

	String getInfo() {
		return getYear() + ",Truck " + getType() + ", " + getTowing() + " lbs.towing, $" + getPrice();
	}
}
