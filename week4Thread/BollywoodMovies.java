package week4Thread;

import java.util.Scanner;

class RandomMovies implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (Thread.currentThread().getName().equals("salmankhan"))
			for (int i = 1; i <= 10; i++) {
				System.out.println("salmankhan " + i);
			}
		if (Thread.currentThread().getName().equals("sharukhan"))
			for (int i = 1; i <= 10; i++) {
				System.out.println("sharukhan " + i);
			}
	}

}

public class BollywoodMovies {
	public static void main(String[] args) {
		System.out.println("Please enter your input to search:");
		System.out.println("Bollywood Movies");
		Scanner scn = new Scanner(System.in);
		// BollywoodMovies bv = new BollywoodMovies();
		RandomMovies rm = new RandomMovies();
		Thread th = new Thread(rm, "sharukhan");
		Thread th2 = new Thread(rm, "salmankhan");
		th2.start();
		th.start();
		System.out.println("enter hero name: ");
		String str = scn.next();
		Thread thread = new Thread(rm, str);
		thread.start();
		String str2 = scn.next();
		Thread thread2 = new Thread(rm, str2);
		thread2.start();
		scn.close();
	}
}
