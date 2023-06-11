package week7.day2;

public class LearnConstructor {
	
	int empId;
	String empName;
	boolean empStatus;
	
	//default Constructor
	public LearnConstructor(){
		//this(100, "Subraja", true);
		System.out.println("Default Constructor");
		
	}
	
	//parameterized Constructor
	public LearnConstructor(int empId,String empName,boolean empStatus){
		this();
		System.out.println("Parameterized Constructor");
		this.empId=empId;
		this.empName=empName;
		this.empStatus=empStatus;
		
	}
	 
	
	
	public static void main(String[] args) {
		LearnConstructor lc = new LearnConstructor(300, "Aravind", false);
		System.out.println(lc.empId);
		System.out.println(lc.empName);
		System.out.println(lc.empStatus);
	}

}
