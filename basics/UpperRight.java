package basics;

public class UpperRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 9;
		int spaces = 0;
		for(int i = 1; i <= 4; i++) {
			for(int k = 1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 4 ;j++) {
				System.out.print(count+ " ");
				count--;
			}
			System.out.println();
			
		}
	}

}
