package week1.day2;

public class Bicycle {

	//Accessmodifier returntype methodName(input arguments)
	//method shortcut->type methodname->ctrl+space->enter
	public int getCycleNumber(int num) {
		return num;
	}

	public String getCycleColor(String brand,int number) {

		return number +" " +brand;


	}

	public void getInvocationCount() {
		System.out.println("No ");

	}
	
	public static void main(String[] args) {
		//ClassName objectname = new ClassName();
		Bicycle bc = new Bicycle();
		System.out.println(bc.getCycleColor("Honda", 29));
		System.out.println(bc.getCycleNumber(4));
		bc.getInvocationCount();
		
	}


}
