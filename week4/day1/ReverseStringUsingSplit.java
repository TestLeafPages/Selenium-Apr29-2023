package week4.day1;

public class ReverseStringUsingSplit {
	public static void main(String[] args) {
		String  input="Amazon development centre Chennai"; 
		//Output = chennai centre development amazon
//		a)Convert the string to lower case
		input=input.toLowerCase();
//		b)split the sentence with white space and get the count of the words
		String[] split = input.split(" ");
		int length = split.length;
		System.out.println(length);
//		c)Use for loop to iterate (from end to go to the first)
		for (int i = length-1; i >=0; i--) {
//			d)Print the  reversed String
			System.out.print(split[i]+" ");
		}




	}

}
