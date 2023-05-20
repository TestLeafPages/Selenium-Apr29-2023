package week4.day1;

public class LearnReplaceAll {
	public static void main(String[] args) {
		String  input="Chennai 600023"; 
		//Output=600023
		//To get only the numbers
		String replaceAll = input.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		//Convert String to int
		int number = Integer.parseInt(replaceAll);
		//Iterate through while loop
//		d)Find sum of numbers
//		e)Declare sum,rem;
		int sum=0;
		int rem=0;
//		f)Iterate through while loop
//		g)Inside the loop
//		h)Get the rem using mod operator
//		i)Add rem with sum
//		j)get the quo and assign it to numbers
//		k)Finally print sum

		while(number>0) {
			rem=number%10;//600023%10=3
			sum= sum+rem;//3
			number=number/10;//60002
		}
		System.out.println(sum);
		
		
		//To get the ASCII characters
		String replaceAll2 = input.replaceAll("[^a-zA-Z]", "");
		System.out.println(replaceAll2);

	}

}
