package basics;

public class PatternNumberType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 9;
        for(int i =1; i <= 4; i++) {
        	for(int j = 1; j < i; j++) {
        		System.out.print("  ");
        	}
        	for(int k = i; k <= 4; k++) {
        		System.out.print(count--+" ");
        		
        	}
        	System.out.println();
        }
	}

}
