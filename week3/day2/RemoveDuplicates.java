package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] nums = {2,3,4,2,3,5,7,6,7};
		
		//Duplicate values=2,3,7
		//Output=[2,3,4,5,7,6]
		
		//Declare Set
		Set<Integer> numbers = new LinkedHashSet<>();
		//To add all the input elements iterate through for loop
		for (int i = 0; i < nums.length; i++) {
			numbers.add(nums[i]);
			
		}
		System.out.println(numbers);
		
		
		
	}

}
