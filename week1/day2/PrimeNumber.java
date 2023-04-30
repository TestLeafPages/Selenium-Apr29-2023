package week1.day2;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int number = 4;
		boolean isPrime = true;
//		if (number<=1) {
//			isPrime = false;
//		}
		
		for (int i = 2; i < number; i++) {
			if (number%i==0) {//17%2==0
				isPrime = false;
				break;
			}
			
		}
		if (isPrime) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Non Prime");
		}
	}

}
