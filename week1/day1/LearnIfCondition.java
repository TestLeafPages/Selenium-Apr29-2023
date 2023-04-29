package week1.day1;

public class LearnIfCondition {
public static void main(String[] args) {
	int number = 0;
	//Find the given number is positive or negative or neutral
	if(number>0) {//-20>0->false
		System.out.println("The given number is Positive");
	}
	else if(number<0) {//-20<0->true
		System.out.println("The given number is negative");
	}
	else {
		System.out.println("The given number is neutral");
	}
	
}
}
