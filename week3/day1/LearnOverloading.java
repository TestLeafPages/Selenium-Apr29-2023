package week3.day1;

public class LearnOverloading {
	
	public void add(int a,int b) {
		System.out.println(a+b);

	}
	
	public void add(int a,float b) {
		System.out.println(a+b);

	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);

	}
	
	public void add(int a,int b,int c,int d) {
		System.out.println(a+b+c+d);

	}
	public static void main(String[] args) {
		LearnOverloading lo = new LearnOverloading();
		lo.add(23, 45, 67);
		lo.add(23, 9.75f);
	}

}
