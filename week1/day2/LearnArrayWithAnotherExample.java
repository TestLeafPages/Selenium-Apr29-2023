package week1.day2;

import java.util.Arrays;

public class LearnArrayWithAnotherExample {

	public static void main(String[] args) {
		
		String[] names = {"Vidhya","Dilip","Raghu","Aravind","Kathir","Jagadeesh","Mukesh"};
		int len = names.length;
		System.out.println(len);
		System.out.println(names[3]);
		//to sort an array
		Arrays.sort(names);
		for (int i = len-1; i >=0; i--) {
			System.out.println(names[i]);
		}
		 
		 
		
		

	}

}
