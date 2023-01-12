package week3OOPs;

public class Motorcycle extends Vehicle {
	int milege;

	public Motorcycle(String type, int year, double price, int milege) {
		super(type, year, price);
		this.milege = milege;
	}

	public int getMilege() {
		return milege;
	}

	public void setMilege(int milege) {
		this.milege = milege;
	}

	String getInfo() {
		return getYear() + ", Bike " + getType() + " , $" + getPrice() + " , " + getMilege();
	}

}
