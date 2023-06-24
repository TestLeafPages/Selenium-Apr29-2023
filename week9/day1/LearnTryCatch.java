package week9.day1;

public class LearnTryCatch {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		
		int[] values = {10,20,30}; //indices -> 0,1,2

		try {
			System.out.println(x / y); //2
			System.out.println(values[0]);
		} 
		  catch (Exception e) {
			  System.out.println(e);
		  }
		
		System.out.println("End of program");

	}

}
