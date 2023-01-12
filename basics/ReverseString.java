package basics;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String input = "java";
         boolean checkReverse = check(input);
         if(checkReverse) {
        	 System.out.println("palindrome");
         }else {
        	 System.out.println("not a palindrome");
         }
	}
	static boolean check(String input) {
		int index = 0;
		char []ch = new char[input.length()];
		for(int i = input.length()-1; i >= 0; i--) {
			ch[index++]= input.charAt(i);
			
		}
	String reverse = String.valueOf(ch);
		if(input.equals(reverse)) {
			return true;
		}else {
			return false;
		}
	}

}
