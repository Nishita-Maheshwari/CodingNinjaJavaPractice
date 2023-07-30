package Recurssion;

public class Rev1toN {

	public static void main(String[] args) {
		funRev(5);
		

	}

	private static void funRev(int n) {
		if(n==0) {
			return;
		}
		funRev(n-1);
		System.out.println(n);
	}

}
