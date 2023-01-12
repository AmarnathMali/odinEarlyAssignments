package basics;

public class ReverseStringWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String statement = "I Started Learning	  java i must";
			int count = 0;
			for(int i = statement.length()-1;i >= 0;i--) {
				if(statement.charAt(i) == ' '&& statement.charAt(i+1) != ' ') {
					count++;
				}
			}
			count++;
			System.out.println(count);
	}

}
