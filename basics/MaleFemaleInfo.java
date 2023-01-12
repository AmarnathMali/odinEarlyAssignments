package basics;

public class MaleFemaleInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maleFemaleinformation('m');
		maleFemaleinformation('F');

	}

	static void maleFemaleinformation(char choice) {
		// TODO Auto-generated method stub
		switch (choice) {
		case 'M' | 'm':
			System.out.println("Men typically have darker hair than women. ...\r\n"
					+ "Men's teeth are larger than women's. ...\r\n"
					+ "Men have bigger jawbones, cheeks, and eyebrows. ...\r\n" + "Men snore more than women. ...\r\n"
					+ "Men process threats better. ...\r\n" + "Male babies can get erections in the womb.\r\n" + "");

			break;
		case 'F':
			System.out.println(
					"Women are special for many reasons.\n"
					+ " They are the most sensitive, caring and maternal people in the world.\n "
					+ "Women are very sympathetic towards people and things.\n"
					+ " They use both sides of the brain and men don't.\n");
			
			break;
		default:
			System.out.println("wrong choice");
		}
	}

}
