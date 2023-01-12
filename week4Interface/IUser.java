package week4Interface;

public interface IUser {
	
	boolean login(User UserName, User Password);
	boolean register(User u, int index);
}