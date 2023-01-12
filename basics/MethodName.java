package basics;

public class MethodName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         sachin(3);
         sehwag(3);
         pant(4);
	}

	 static void sachin(int i) {
		// TODO Auto-generated method stub
		 for(int j = 1; j <= i; j++) {
			 System.out.println("Sachin Tendulkar, in full Sachin Ramesh Tendulkar,"
			 		+ " (born April 24, 1973, Bombay [Mumbai], India), "
						+ "Indian professional cricket player, "
						+ "considered by many to be one of the greatest batsmen "
						+ "of all time. In 2012 he became the first cricketer"
						+ " to score 100 centuries (100 runs in a single innings) "
						+ "in international play.\r\n"
						+ "");
			 
		}
		 System.out.println();

		
	}

	 static void sehwag(int i) {
		// TODO Auto-generated method stub
		 int k = 1;
		 while(k <= i) {
		        System.out.println("Virender Sehwag is a former Indian cricketer "
		 		+ "and former captain of the Indian National Cricket Team."
		 		+ " He was renowned as a destructive and aggressive player.");
		        k++;
		 }       
	      System.out.println();

	}

	 static void pant(int i) {
		// TODO Auto-generated method stub
		 int h = 1;
		 do {
			 System.out.println("Rishabha Pant is a captain of delhi capitals(ipl)");
			 System.out.println("pant is wicket-keeper batsman");
			 System.out.println("pant is aggresive player");
			 h++;
		 }while(h < i);	 
		 System.out.println();

	}

}
