package week6Assignment;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("Starting of main method ");
		Demo1 demoObj1 = new Demo1(); // creating object of demo1
		demoObj1.start();

		Demo2 demoObj2 = new Demo2(); // creating object of demo2
		Thread obj = new Thread(demoObj2); // passing object into the Thread object because we calling Runnable
											// interface
		
		obj.start();// call to run method of Demo2 class

		for (int i = 1; i <= 100; i++) {
			if (i == 40) {
				try {
					obj.join();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
			System.out.println("Excuting main method " + i + " Thread Name: " + Thread.currentThread().getName()
					+ " Thread Prioritie : " + Thread.currentThread().getPriority());
		}
		System.out.println("ending of main method");
	}

}
