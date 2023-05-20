package week4.day1;

public class FindCount {
	public static void main(String[] args) {
		String input="TestLeaf";
		//Output=2
		char[] ch=input.toCharArray();
		int count=0;
		char expected = 'e';
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]==expected) {
				count++;
			}
		}
System.out.println("The "+expected+" has occured "+count+" times");
	}

}
