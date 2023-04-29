package week1.day1;

public class LearnJumpStatements {

	public static void main(String[] args) {
		//break-exit out of the loop immediately
		for (int i = 10; i >=1; i--) {//9>=1;
			if(i==7) {
				System.out.println("Seven");
				break;
			}
			System.out.println(i);

		}
System.out.println("Out of for loop");
	}

}
