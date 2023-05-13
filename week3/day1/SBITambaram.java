package week3.day1;

public class SBITambaram extends SBIHeadQuarters{
	public void fixedDepositRate() {
		System.out.println("12% interest rate");

	}
	
	public static void main(String[] args) {
		SBITambaram sb = new SBITambaram();
		sb.fixedDepositRate();
		
		SBIHeadQuarters sbi = new SBIHeadQuarters();
		sbi.fixedDepositRate();
	}
	
}
