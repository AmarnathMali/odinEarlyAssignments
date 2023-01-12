package basics;

public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in main method");
		double ans = multipleNumber(2, 3.5);
		System.out.println("Addition is: " + ans);
		System.out.println("main method ended");

	}

	static double multipleNumber(int num1, double num2) {
		double result = num1 * num2;
		return result;
	}

}
