package week3Ass;

import java.util.Scanner;

public class HighestMarks {

	public static void main(String[] args) {
		String[] sub = { "Corejava", "HTML", "CSS", "Bootstrap", "ES6", "Spring", "Hibernate" };
		int[] marks = new int[sub.length];
		Scanner scn = new Scanner(System.in);

		for (int i = 0; i < sub.length; i++) {
			System.out.println("Please enter marks in " + sub[i]);
			marks[i] = scn.nextInt();
		}
		scn.close();                        
		int max = marks[0];
		int index = 0;
		for (int j = 1; j < marks.length; j++) {
			if (marks[j] > max) {
				max = marks[j];
				index = j;
			}
		}
		System.out.println();
		System.out.println("highest marks in " + sub[index] + " are : " + max);
	}

}
