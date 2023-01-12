package week5ass;

public class User {
	String fName;
	String sName;
	String userName;
	String password;

	public User(String fName, String sName, String userName, String password) {
		super();
		this.fName = fName;
		this.sName = sName;
		this.userName = userName;
		this.password = password;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [fName=" + fName + ", sName=" + sName + ", userName=" + userName + ", password=" + password + "]";
	}

	
}
