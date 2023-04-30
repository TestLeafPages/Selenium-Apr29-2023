package week1.day2;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};
		//Output = 2,5,7
		//loop through a number(outer loop)(i=0)
		//loop through the next number(inner loop)(j=i+1)
		//compare bothe the variables using if condition(if(nums[i]==nums[j])
		//print the duplicate value
		
		//Method1:
		for (int i = 0; i < nums.length; i++) {//0<len
			
			for (int j = i+1; j < nums.length; j++) {//j=2
				if (nums[i]==nums[j]) {//nums[0]==nums[2] 2==2
					System.out.println(nums[i]);//nums[0]=2
					
				}
			}
		}
		
		//Method 2:
//		Arrays.sort(nums);
//		for (int i = 0; i < nums.length-1; i++) {
//			if (nums[i]==nums[i+1]) {
//				System.out.println(nums[i]);
//			}
//		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
