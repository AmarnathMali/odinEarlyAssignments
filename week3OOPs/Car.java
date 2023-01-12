package week3OOPs;

public class Car extends Vehicle {

	private double mpg;

	public Car(String type, int year, double price, double mpg) {
		super(type, year, price);
		this.mpg = mpg;
	}

	public double getMpg() {
		return mpg;
	}

	public void setMpg(double mpg) {
		this.mpg = mpg;
	}

	String getInfo() {
		return getYear() + ",car " + getType() + " ," + getMpg() + ", $" + getPrice();
	}

	@Override
	public String toString() {
		return getYear() + " ,car " + getType() + ", " + getMpg() + " mpg,$" + getPrice();
	}

}