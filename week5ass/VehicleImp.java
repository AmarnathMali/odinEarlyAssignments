package week5ass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Price implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		if (o1.price == o2.price)
			return 0;
		else if (o1.price > o2.price)
			return 1;
		else
			return -1;
	}

}

class MfgYear implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		if (o1.mfgYear == o2.mfgYear) {
			return 0;
		} else if (o1.mfgYear > o2.mfgYear) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class VehicleImp implements IVehicle {

	LinkedList<Vehicle> lists = new LinkedList<>();

	@Override
	public void addingVehicles() {
		lists.add(new Vehicle("Toyata", 2019, 3500.45));
		lists.add(new Vehicle("suzuki", 2016, 5000));
		lists.add(new Vehicle("Benz", 2021, 6000));
		lists.add(new Vehicle("kia", 2020, 4500));

	}

	@Override
	public void avialableVehicle() {
		ArrayList<Vehicle> al = new ArrayList<>(lists);

		System.out.println("List of Available Vehicles:");

		for (Vehicle v : al) {
			System.out.println(v.vName + " " + v.mfgYear + " " + v.price);
		}

	}

	@Override
	public void sorting(String str) {
		ArrayList<Vehicle> al = new ArrayList<>(lists);
		if (str.equals("mfgYear")) {
			Collections.sort(al, new MfgYear());
			for (Vehicle v : al) {
				System.out.println(v.vName + " " + v.mfgYear + " " + v.price);
			}
		} else if (str.equals("price")) {
			Collections.sort(al, new Price());
			for (Vehicle v : al) {
				System.out.println(v.vName + " " + v.mfgYear + " " + v.price);
			}
		}
	}

}
