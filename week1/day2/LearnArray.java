package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		//ArrayIndexOutOfBoundsException
		//datatype[] variablename = {values};
		      //        0  1  2  3  4
		int[] scores = {89,98,80,78,92};
		//to find the length of array
		//ctrl+2->release and then press l->to assign to a variable
		int len = scores.length;
		 System.out.println("The length of this array is :" +len);
		 //to retrieve a single element from an array
		 System.out.println(scores[2]);//80
		 //to print all the datas of an array
		 Arrays.sort(scores);
		 for (int i = 0; i <len; i++) {
			System.out.println(scores[i]);//scores[4]=92
		}
		 
		 int[] nums = new int[6];
		 nums[0]=34; nums[1]=23;
		
		 nums[2]=89;
		 nums[3]=90;
		 nums[4]=78;
		 nums[5]=45;
		 for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		 
		
		

	}

}
