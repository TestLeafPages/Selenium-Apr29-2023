package week1.day2;

public class LearnStringMethods {

	public static void main(String[] args) {
		//String literal
		String str = "TestLeaf";
		String str1 = "TestLeaF";
		//find the length of the String
		int len = str.length();
		System.out.println(len);
		
		//to check a part of the String
		//method 1:
		//str=str.toUpperCase();//TESTLEAF
//		boolean isPresent = str.contains("leaf");
//		System.out.println(isPresent);	
		//Method 2:
		if (str.contains("leaf") || str.contains("Leaf")) {
			System.out.println("Is Present");
		}
		else {
			System.out.println("Not Present");
		}
		
		
		//to convert String to charArray
		char[] ch = str.toCharArray();
		System.out.println(ch[2]);
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		//to return the character from particular index
		System.out.println(str.charAt(3));
		
		//to check both the Strings are equal
		if (str.equalsIgnoreCase(str1)) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Not equal");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
