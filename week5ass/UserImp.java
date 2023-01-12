package week5ass;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UserImp implements IUser {
	List<User> li = new LinkedList<>();

	@Override
	public boolean sigin(String userName, String password) {

		Iterator<User> it = li.iterator();
		while (it.hasNext()) {
			User s = it.next();
			if (s.userName.equals(userName) && s.password.equals(password)) {
				System.out.println(userName + "!!!! Welcome to Autoshop world\n");
				return true;
			}
		}
		return false;

	}

	@Override
	public void signup(User user) {

		li.add(user);
		System.out.println("Thank you… your registration success!!!");

	}

}
