package week5ass;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class User1{
	private String firstName;
	private String secondName;
	private String User1name;
	private String password;
	public User1(String firstName, String secondName, String User1name, String password) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.User1name = User1name;
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getUser1name() {
		return User1name;
	}
	public void setUser1name(String User1name) {
		this.User1name = User1name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User1 [firstName=" + firstName + ", secondName=" + secondName + ", User1name=" + User1name + ", password="
				+ password + "]";
	}
	
//IUser1
	
public interface IUser1{
	String signup(User1 u);
	String signin(User1 u);
}

//User1 implements

public class User1Imp implements IUser1{

	@Override
	public String signup(User1 u) {
		// TODO Auto-generated method stub
		return "signup succesful";
	}

	@Override
	public String signin(User1 u) {
		// TODO Auto-generated method stub
		return "sign in";
	}

		
}


}

public class User1Login {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 System.out.println("Enter User1 name");
		 String firstName = scn.next();
		 System.out.println("Enter a Password:");
		 String secondName = scn.next();
		 System.out.println("enter a email");
		 String User1name = scn.next();
		 System.out.println("enter a phone number : ");
		 String password = scn.next();
		 
		 
		 IUser1 User1obj = new User1Imp();
		 
		 
		 System.out.println("signup succesfully completed");
		 
		 System.out.println("Login please: ");
		 System.out.print("User1 Name: ");
		 String User1Name = scn.next();
		 System.out.println("Password: ");
		 String passWord = scn.next();
		 
		 if(User1Name.equals(u.getUser1name()) && passWord.equals(u.getPassword())) {
			 System.out.println("login succesful");
		 }else {
			 System.out.println("Wrong User1 name and Password ");
		 }
	}
	

}
