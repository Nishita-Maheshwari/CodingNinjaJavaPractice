package Recurssion;

public class ReverseNum2 {
	public static void main(String[] args) {
		System.out.println(rev2(1234));
	}

	private static int rev2(int n) {
		//sometimes you might need some additional variables in the argumentin that case,
		//make another function
		
		int digits=(int)(Math.log10(n)+1);
		return helper(n,digits);
		
		
	}

	private static int helper(int n, int digits) {
		if(n%10==n) {
		return n;
	}
		int rem=n%10;
		return (int) (rem*Math.pow(10,digits-1)+helper(n/10, digits-1));
	}
	

}
