package week1.day1;

public class LearnSwitchCase {

	public static void main(String[] args) {

		String browserType  = "I";
		
		switch(browserType) {
		case "Chrome" :
			System.out.println("Open Chrome browser");
			break;
		case "Edge"	:
			System.out.println("Open Edge browser");
			break;
		case "Safari":
			System.out.println("Open safari browsers");
			break;
		case "FireFox":
			System.out.println("Open Firefox browser");
			break;
		default:
			System.out.println("Open default browser");
			break;
		}

	}

}
