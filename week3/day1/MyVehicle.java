package week3.day1;

public class MyVehicle {

	public static void main(String[] args) {
		BMW bm = new BMW();
		bm.applyBrake();
		bm.soundHorn();
		bm.applyGear();
		bm.applyAirBags();
		System.out.println("******************");
		Audi au = new Audi();
		au.applyGear();
		au.applyBrake();
		au.soundHorn();
		au.sunRoof();
		System.out.println("*******************");
	    Bajaj bj = new Bajaj();
	    bj.applyBrake();
	    bj.soundHorn();
	    bj.applyMeter();
	    bj.autoStart();

	}

}
