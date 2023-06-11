package week7.day2;

public class EmployeeInfo {
	
	static {
		System.out.println("I am a static block");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method");
		//ClassName.methodname
		LearnStatic.add();
	}

}
