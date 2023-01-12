package week5ass;

import java.util.Scanner;

public class VehicleInventory {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Welcome to AUTOSHOP WORLD!!!\nPlease signup with your details");
		System.out.println("Please enter your first name: ");
		String firstName = scn.next();
		System.out.println("Please enter your secondName: ");
		String secondName = scn.next();
		System.out.println("Please enter your username");
		String username = scn.next();
		System.out.println("Please enter your password: ");
		String password = scn.next();

		User u = new User(firstName, secondName, username, password);
		IUser userObj = new UserImp();
		userObj.signup(u);

		System.out.println();
		System.out.println("Please sign with your details");
		System.out.println("please enter your username");
		String un = scn.next();
		System.out.println("please enter your password");
		String pa = scn.next();

		if (userObj.sigin(un, pa) == true) {
			IVehicle vehi = new VehicleImp();
			vehi.addingVehicles();
			vehi.avialableVehicle();
			System.out.println();
			System.out.println(
					"Please enter your input to sort details like 1.mfgYear , 2.price, 3.exit(type if you want to exit)");
			while (true) {

				String str = scn.next();
				if (str.equals("exit")) {
					System.out.println("Thank you!!! visit again..");
					break;
				} else {
					vehi.sorting(str);
				}
			}

			scn.close();

		} else {
			System.out.println("Invalid username and password");
		}

	}

}
