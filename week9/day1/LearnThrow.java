package week9.day1;

public class LearnThrow {

	public static int divide(int num1, int num2) {
		int res = 0;
		if(num1 > num2) {
			res = num1 / num2;	
		} else {
			throw new ArithmeticException("first input is smaller than the second. Correct your input");
		}
		
		return res; // round of to 0
	}

	public static void main(String[] args) {
		int result = 0;
		result = divide(10, 20);
		System.out.println(result);

	}

}
