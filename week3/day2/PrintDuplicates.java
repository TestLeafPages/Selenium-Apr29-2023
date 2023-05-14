package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicates {
	public static void main(String[] args) {
		int[] nums = {2,3,4,2,3,5,7,6,7};

		//Duplicate values=2,3,7
		//Output=[2,3,7]

		//Declare Set
		Set<Integer> unique = new TreeSet<>();
		Set<Integer> duplicates = new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {
			boolean add = unique.add(nums[i]);//2,3,4,6,7
			if (!add) {
				duplicates.add(nums[i]);
			}
			
			
		}
		System.out.println(duplicates);
	}

}
