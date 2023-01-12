package basics;

import java.util.Scanner;

public class OdinSchoolAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1st digit: ");
		double digit1 = scn.nextDouble();
		System.out.println("Enter 2nd digit: ");
		double digit2 = scn.nextDouble();
		System.out.println("Enter Your Choice:");
		System.out.println("1 for Addition");
		System.out.println("2 for Substraction");
		System.out.println("3 for Multiplication");
		System.out.println("4 for Divsion");
		int choice = scn.nextInt();
		
		switch (choice) {
		case 1: 
			System.out.println("Addition: "+ (digit1+digit2));  
	        break;  
	    case 2:
	    	System.out.println("Substration: "+(digit1-digit2));  
	        break;  
	    case 3:
	    	System.out.println("Multiplication: "+ (digit1*digit2)); 
	        break;
	    case 4:
	    	System.out.println("Division: "+ (digit1/digit2));
	    	break;
	    default:
	    	System.out.println("wrong choice!!");  
	    	
		}
	}

}
