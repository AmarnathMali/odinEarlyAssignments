package basics;

import java.util.Scanner;

public class ArrayOfMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String[] subject = new String[] {"English:","Kannada:","Maths:","chemistry:","physics:","biology:","geography:" };
		System.out.println("Enter your all subject marks: ");
		int[] marks = new int[7];
		for(int i = 0; i<marks.length; i++) {
			System.out.print(subject[i]);
			marks[i] = scn.nextInt();
	    }
		System.out.println();
		System.out.print("highest mark among 7 subject is: ");
		int max = marks[0];
		for(int i = 1; i < marks.length;i++) {
			if(marks[i]>max) {
				max = marks[i];
			}
		}
		System.out.print(max);

	}

}
