package week3.day1;

public class SBIBank implements RBI,WorldBank{

	
	public void withDrawLimit() {
		System.out.println("10L");
		
	}

	@Override
	public void knowYourCustomer() {
		System.out.println("AADHAR");
		
	}
	
	public void goldLoan() {
		System.out.println("7% interest rate");

	}

	@Override
	public void repoRate() {
		System.out.println("12% rate");
		
	}
	@Override
	public void personalLoan() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		SBIBank sbi = new SBIBank();
		sbi.withDrawLimit();
		sbi.goldLoan();
		
	}

	

	

}
