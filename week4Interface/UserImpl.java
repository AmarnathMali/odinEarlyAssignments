package week4Interface;

public class UserImpl implements IUser{
	User[] users;
    UserImpl(){
    	users = new User[5];
    }
    User u = new User("amar","mali","amar@mali","123");
    int index = 0;
	@Override
	public boolean register(User u, int index) {
	   users[index] = u;
	   index++;
	   
		return true;
	}

	@Override
	public boolean login(User UserName, User Password) {
     
    	
	 return true;
	}
	
}
