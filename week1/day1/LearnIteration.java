package week1.day1;

public class LearnIteration {
	
	public static void main(String[] args) {
	//type for->ctrl+space->click based on index on array->Enter
		
		for (int i = 1; i <= 10 ; i++) {//i=1;1<=10;
			if(i%2==0) {//2%2==0
				System.out.println(i);// 2 3 4 5 6 7 8 9 10
			}
			
		}
		System.out.println("Done");
		
		int i = 15;
		int j = 2;
		System.out.println(i/j); //quotient
		System.out.println(i%j);  //remainder
		
	}

}
