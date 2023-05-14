package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//Declare a list
		// List<Generic> listname = new implementationclass<>();		
		List<String> mentors = new ArrayList<>();

		//To add element to a list
		mentors.add("Vidhya");
		mentors.add("Aravind");
		mentors.add("Raghu");
		mentors.add("Dilip");
		mentors.add(2, "Mukesh");
		mentors.add("Raghu");
		
		//To sort a list
		Collections.sort(mentors);
		
		//To add all the elments of a list to another list
		List<String> mentors2 = new ArrayList<>();
		mentors2.add("Subraja");
		mentors2.addAll(mentors);
		System.out.println("Mentors2 elements: "+mentors2);

		//To find the size of a list	
		int size = mentors.size();
		System.out.println("Size of mentors: "+size);
		
		//To Print the list
		System.out.println("Mentor names: "+ mentors);
		
		//To remove a particular element from a list
		mentors.remove(2);
		System.out.println(mentors);
		
		//To removeall elements 
		mentors2.removeAll(mentors);
		System.out.println("After removing all elements : "+mentors2);
		
		//To retrieve a particular element from a list through index
		String name = mentors.get(3);
        System.out.println(name);
        
        //To clear a list
        mentors.clear();
        System.out.println(mentors);
        
		


	}

}
