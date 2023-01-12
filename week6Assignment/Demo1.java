package week6Assignment;

public class Demo1 extends Thread {

	public void run() {
		display1(); // calling display1 method
	}

	public void display1() {

		try {
			Thread.sleep(1000);// sleep method for 1000 msec to complete excution of main and display2 method
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("starting of display1 method ");

		for (int j = 1; j <= 100; j++) {

			System.out.println("Executeing " + j + " Thread Name " + Thread.currentThread().getName()
					+ " Thread Priority : " + Thread.currentThread().getPriority());
		}
		System.out.println("Ending of display1 method");
	}
}
