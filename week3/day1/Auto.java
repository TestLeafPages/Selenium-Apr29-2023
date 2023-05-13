package week3.day1;

public class Auto extends Vehicle {
	
	public void applyMeter() {
		System.out.println("Meter applied -> Auto Class");
	}
	
	public static void main(String[] args) {
		Auto aut = new Auto();
		aut.applyBrake();
		aut.applyMeter();
	}

}
