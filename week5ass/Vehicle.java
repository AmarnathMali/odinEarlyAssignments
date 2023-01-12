package week5ass;

public class Vehicle {
    String vName;
    int mfgYear;
    double price;
	public Vehicle(String vName, int mfgYear, double price) {
		super();
		this.vName = vName;
		this.mfgYear = mfgYear;
		this.price = price;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public int getMfgYear() {
		return mfgYear;
	}
	public void setMfgYear(int mfgYear) {
		this.mfgYear = mfgYear;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehicle [vName=" + vName + ", mfgYear=" + mfgYear + ", price=" + price + "]";
	}
    
    
}
