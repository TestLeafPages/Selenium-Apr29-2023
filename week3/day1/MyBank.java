package week3.day1;

public class MyBank extends AxisBank{

	@Override
	public void withDrawLimit() {
	System.out.println("50000");
		
	}

	@Override
	public void repoRate() {
		System.out.println("9%");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("25L");
		
	}
	public static void main(String[] args) {
		MyBank mb = new MyBank();
		mb.withDrawLimit();
		mb.repoRate();
		mb.knowYourCustomer();
		mb.homeLoan();
	}
	

}
