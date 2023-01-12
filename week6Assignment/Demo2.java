package week6Assignment;

public class Demo2 implements Runnable {

	@Override
	public void run() {
		display2();
	}

	public void display2() {
		System.out.println("Starting display2 method ");

		for (int k = 1; k <= 100; k++) {
			System.out.println("The display2 method excuting " + k + " Thread name: " + Thread.currentThread().getName()
					+ " Therad Priority: " + Thread.currentThread().getPriority());
		}
		System.out.println("Ending of display2 method ");
	}
}
